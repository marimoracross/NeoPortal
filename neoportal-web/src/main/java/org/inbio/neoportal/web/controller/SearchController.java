/*
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
package org.inbio.neoportal.web.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.lucene.queryParser.ParseException;
import org.inbio.neoportal.core.dto.occurrence.OccurrenceLiteDTO;
import org.inbio.neoportal.core.dto.species.SpeciesLiteDTO;
import org.inbio.neoportal.service.manager.SearchManager;
import org.inbio.neoportal.web.messagebean.SpeciesLiteBean;
import org.inbio.neoportal.web.messagebean.OccurrenceLiteBean;
import org.inbio.neoportal.web.messagebean.wrapper.XMLCountWrapper;
import org.inbio.neoportal.web.messagebean.wrapper.XMLSpeciesWrapper;
import org.inbio.neoportal.web.messagebean.wrapper.XMLSpecimenWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 *@autor jgutierrez
 */
@Controller
@RequestMapping("search/*")
public class SearchController {

    @Autowired
    private SearchManager searchManagerImpl;

    /**
     * Get a well formated xml containing paginated occurrences
     * @param searchString
     * @return
     */
    @RequestMapping(value="/occurrences", method=RequestMethod.GET, params={"format=xml","searchString"})
    public @ResponseBody XMLSpecimenWrapper searchOccurrencesWriteXml(@RequestParam String searchString) {

        List<OccurrenceLiteDTO> occurrenceList = null;

        XMLSpecimenWrapper rw = new XMLSpecimenWrapper();
        try {
            occurrenceList = searchManagerImpl.fullPaginatedSearch(searchString, 0, 15); //TODO

            for(OccurrenceLiteDTO olDTO : occurrenceList)
                rw.addElement(new OccurrenceLiteBean(
                olDTO.getGlobalUniqueIdentifier(),
                olDTO.getScientificName(),
                olDTO.getCountry(),
                olDTO.getProvince(),
                olDTO.getCounty(),
                olDTO.getLocality(),
                olDTO.getLatitude(),
                olDTO.getLongitude(),
                olDTO.getCatalog(),
                olDTO.getInstitution()));

        } catch (ParseException ex) {
            Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rw;
    }

     /**
     * Get a string containing the total count of occurrences by searchString
     * @param searchString
     * @return
     */
    @RequestMapping(value="/countOcurrences", method=RequestMethod.GET, params={"format=xml","searchString"})
    public @ResponseBody XMLCountWrapper countOccurrencesWriteXml(@RequestParam String searchString) {
        XMLCountWrapper cw = new XMLCountWrapper();
        cw.setCount(50L); //TODO
        return cw;
    }

    /**
     * Get a well formated xml containing paginated species
     * @param searchString
     * @return
     */
    @RequestMapping(value="/species", method=RequestMethod.GET, params={"format=xml","searchString"})
    public @ResponseBody XMLSpeciesWrapper searchSpeciesWriteXml(@RequestParam String searchString) {

        List<SpeciesLiteDTO> speciesList = null;

        XMLSpeciesWrapper rw = new XMLSpeciesWrapper();
        try {
            speciesList = searchManagerImpl.speciesListPaginatedSearch(searchString, 0 ,10); //TODO

            for(SpeciesLiteDTO spDTO : speciesList)
                rw.addElement(new SpeciesLiteBean(
                spDTO.getImageURL(),
                spDTO.getCommonName(),
                spDTO.getScientificName()));

        } catch (ParseException ex) {
            Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rw;
    }

    /**
     * Get a string containing the total count of species by searchString
     * @param searchString
     * @return
     */
    @RequestMapping(value="/countSpecies", method=RequestMethod.GET, params={"format=xml","searchString"})
    public @ResponseBody XMLCountWrapper countSpeciesWriteXml(@RequestParam String searchString) {
        XMLCountWrapper cw = new XMLCountWrapper();
        cw.setCount(50L); //TODO
        return cw;
    }

    public SearchManager getSearchManagerImpl() {
        return searchManagerImpl;
    }

    public void setSearchManagerImpl(SearchManager searchManagerImpl) {
        this.searchManagerImpl = searchManagerImpl;
    }
}
