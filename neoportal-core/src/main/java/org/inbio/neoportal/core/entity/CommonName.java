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
package org.inbio.neoportal.core.entity;
// Generated 02/03/2011 05:06:45 PM by Hibernate Tools 3.1.0.beta4

import java.math.BigDecimal;
import org.hibernate.search.annotations.ContainedIn;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;


/**
 * CommonName generated by hbm2java
 */
@Indexed
public class CommonName  
    implements java.io.Serializable {


    // Fields    

    @DocumentId
     private BigDecimal commonNameId;

    @ContainedIn
     private Taxon taxon;

     @Field(index= Index.TOKENIZED)
     private String name;
     private String language;
     private String temporality;

     @Field(index= Index.TOKENIZED)
     private String locality;
     private String sex;
     private String lifeStage;
     private String usedBy;


    // Constructors

    /** default constructor */
    public CommonName() {
    }

	/** minimal constructor */
    public CommonName(BigDecimal commonNameId) {
        this.commonNameId = commonNameId;
    }
    
    /** full constructor */
    public CommonName(BigDecimal commonNameId,
        Taxon taxon,
        String name, 
        String language, 
        String temporality,
        String locality, 
        String sex, 
        String lifeStage, 
        String usedBy) {
        
        this.commonNameId = commonNameId;
        this.taxon = taxon;
        this.name = name;
        this.language = language;
        this.temporality = temporality;
        this.locality = locality;
        this.sex = sex;
        this.lifeStage = lifeStage;
        this.usedBy = usedBy;
    }
    

   
    // Property accessors

    public BigDecimal getCommonNameId() {
        return this.commonNameId;
    }
    
    public void setCommonNameId(BigDecimal commonNameId) {
        this.commonNameId = commonNameId;
    }

    public Taxon getTaxon() {
        return this.taxon;
    }
    
    public void setTaxon(Taxon taxon) {
        this.taxon = taxon;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTemporality() {
        return this.temporality;
    }
    
    public void setTemporality(String temporality) {
        this.temporality = temporality;
    }

    public String getLocality() {
        return this.locality;
    }
    
    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLifeStage() {
        return this.lifeStage;
    }
    
    public void setLifeStage(String lifeStage) {
        this.lifeStage = lifeStage;
    }

    public String getUsedBy() {
        return this.usedBy;
    }
    
    public void setUsedBy(String usedBy) {
        this.usedBy = usedBy;
    }

}
