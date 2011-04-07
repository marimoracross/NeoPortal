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
package org.inbio.neoportal.core.transformers;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.transform.ResultTransformer;
import org.inbio.neoportal.core.dto.commonname.CommonNameLiteDTO;
import org.inbio.neoportal.core.dto.taxon.TaxonLiteDTO;
import org.inbio.neoportal.core.entity.CommonName;
import org.inbio.neoportal.core.entity.Taxon;


/**
 * Transfrom a list of Taxon entities to OccurrenceLiteDTO
 * @author asanabria
 */
public class TaxonResultTransformer 
    implements ResultTransformer {

    CommonNameResultTransformer commonNameRT =
        new CommonNameResultTransformer();
    
    List commonNameList =
        new ArrayList<CommonNameLiteDTO>();
    
    @Override
    public List transformList(List list) {
        List<Taxon> taxonList = (List<Taxon>) list;
        List<TaxonLiteDTO> newList = new ArrayList<TaxonLiteDTO>();

        for(Taxon taxon: taxonList){
            
            commonNameList =  commonNameRT.transformList(
                new ArrayList<CommonName>(taxon.getCommonNames()));
            
            newList.add(
                new TaxonLiteDTO(
                    taxon.getDefaultName(),
                    (ArrayList<CommonNameLiteDTO>) commonNameList));
        }
        
        return newList;
    }

    @Override
    public Object transformTuple(Object[] os, String[] strings) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
