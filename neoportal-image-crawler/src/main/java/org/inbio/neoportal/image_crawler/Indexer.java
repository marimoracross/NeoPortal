/*
 *  NeoPortal - New implementation of the INBio Species and Occurrences portal.
 *  
 *  Copyright (C) 2010 INBio - Instituto Nacional de Biodiversidad, Costa Rica
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.inbio.neoportal.image_crawler;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.inbio.neoportal.image_crawler.flickr.Flickr;
import org.inbio.neoportal.image_crawler.flickr.GroupPoolsInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import au.com.bytecode.opencsv.CSVReader;

/**
 * @author avargas
 *
 */
@Component
public class Indexer {

	@Autowired
	ApplicationContext applicationContext;
	
	public Indexer() {
		
	}
	
	/*
     * Get images from flickr and start threads for 
     * associate taxon and occurrence and then index 
     */
    public void indexFlickr(int threads) {
		ExecutorService executor = Executors.newFixedThreadPool(threads);
		
		// read the flickr properties file
		Properties properties = new Properties();
		String flickrApiKey = null;
		String groupId = null;
		
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
			flickrApiKey = properties.getProperty("flickr_api_key");
			groupId = properties.getProperty("group_id");
			
			// get image list from flickr
			Flickr flickr = new Flickr(flickrApiKey);
			GroupPoolsInterface groupPoolsInterface = flickr.getGroupPoolsInterface();
			JSONArray photos;
			
			while( groupPoolsInterface.hasNext()){
				photos = groupPoolsInterface.nextPhotosPage(groupId);
				// loop the list and start threads
				for (int i = 0; i < photos.length(); i++) {
					FlickrIndexer imageIndexer = (FlickrIndexer)applicationContext.getBean("flickrIndexer", photos.getJSONObject(i));
					System.out.println("schedule: " + photos.getJSONObject(i).getString("title"));
					executor.execute(imageIndexer);
				}
			}
			// This will make the executor accept no new threaImages
		    // and finish all existing threads in the queue
		    executor.shutdown();
		    // Wait until all threads are finish
	    	executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    	} catch (InterruptedException e) {
    	  
    	} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Finished all threads");
	}
    
    /**
     * 
     * @param threads
     */
    public void indexM3s (int threads, String csvFile) {
    	ExecutorService executor = Executors.newFixedThreadPool(threads);
		
    	try {
			CSVReader csvReader = new CSVReader(new FileReader(csvFile));
			
			String [] csvHeaders = csvReader.readNext();
			String [] csvLine;
			
			// create map for headers
			HashMap<String, Integer> headersMap = new HashMap<String, Integer>();
			for (int i = 0; i < csvHeaders.length; i++) {
				headersMap.put(csvHeaders[i], i);
			}
			
			while ((csvLine = csvReader.readNext()) != null) {
				M3sIndexer m3sIndexer = (M3sIndexer) applicationContext.getBean("m3sIndexer", headersMap, csvLine);
				System.out.println("schedule: " + csvLine[0]);
				executor.execute(m3sIndexer);
			}
			// This will make the executor accept no new threaImages
		    // and finish all existing threads in the queue
		    executor.shutdown();
		    // Wait until all threads are finish
	    	executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
}
