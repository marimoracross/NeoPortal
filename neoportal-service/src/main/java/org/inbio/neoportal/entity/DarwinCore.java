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
package org.inbio.neoportal.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Store;

/**
 * DarwinCore generated by hbm2java
 * @author asanabria <asanabria@inbio.ac.cr>
 */
@Indexed
public class DarwinCore  extends LogGenericEntity implements Serializable {


    @DocumentId
     private String globaluniqueidentifier;
     private Date datelastmodified;
     private String institutioncode;
     private String collectioncode;
     private String catalognumber;
     private BigDecimal catalognumbernumeric;
     @Field(index=Index.UN_TOKENIZED, store=Store.NO)
     private String scientificname;
     private String basisofrecord;
     private String informationwithheld;
     private BigDecimal kingdomid;
     private BigDecimal phylumId;
     private BigDecimal classId;
     private BigDecimal ordersId;
     private BigDecimal familyId;
     private BigDecimal genusId;
     private BigDecimal specificepithetId;
     private BigDecimal infraspecificepithetId;
     private String highertaxon;
     private String kingdom;
     private String phylum;
     private String class_;
     private String orders;
     private String family;
     private String genus;
     private String specificepithet;
     private String infraspecificepithet;
     private String infraspecificrank;
     private String authoryearofscientificname;
     private String nomenclaturalcode;
     private String identificationqualifier;
     private String identifiedby;
     private Date dateidentified;
     private String typestatus;
     private String collectingmethod;
     private String validdistributionflag;
     private String collectornumber;
     private String fieldnumber;
     private String collector;
     private Date earliestdatecollected;
     private Date latestdatecollected;
     private String verbatimcollectingdate;
     private BigDecimal dayofyear;
     private String fieldnotes;
     private String highergeography;
     private String continent;
     private String waterbody;
     private String islandgroup;
     private String island;
     @Field(index=Index.TOKENIZED, store=Store.NO)
     private String country;
     @Field(index=Index.TOKENIZED, store=Store.NO)
     private String stateprovince;
     @Field(index=Index.TOKENIZED, store=Store.NO)
     private String county;
     @Field(index=Index.TOKENIZED, store=Store.NO)
     private String locality;
     private String decimallongitude;
     private String verbatimlongitude;
     private String decimallatitude;
     private String verbatimlatitude;
     private String geodeticdatum;
     private String verbatimcoordinatesystem;
     private String georeferenceprotocol;
     private String coordinateuncertaintyinmeters;
     private String georeferenceremarks;
     private String footprintwkt;
     private Double minimumelevationinmeters;
     private Double maximumelevationinmeters;
     private Double verbatimelevation;
     private Double minimumdepthinmeters;
     private Double maximumdepthinmeters;
     private String sex;
     private String lifestage;
     private String preparations;
     private BigDecimal individualcount;
     private String genbanknum;
     private String othercatalognumbers;
     private String relatedcatalogitems;
     private String remarks;
     private String attributes;
     private String imageurl;
     private String relatedinformation;
     private String disposition;
     private BigDecimal pointradiusspatialfit;
     private BigDecimal footprintspatialfit;
     private String verbatimcoordinates;
     private String georeferencesources;
     private String georeferenceverificationstatus;

    public DarwinCore() {
    }

	
    public DarwinCore(String globaluniqueidentifier, Date datelastmodified, String institutioncode, String collectioncode, String catalognumber, String basisofrecord) {
        this.globaluniqueidentifier = globaluniqueidentifier;
        this.datelastmodified = datelastmodified;
        this.institutioncode = institutioncode;
        this.collectioncode = collectioncode;
        this.catalognumber = catalognumber;
        this.basisofrecord = basisofrecord;
    }
    public DarwinCore(String globaluniqueidentifier, Date datelastmodified, String institutioncode, String collectioncode, String catalognumber, BigDecimal catalognumbernumeric, String scientificname, String basisofrecord, String informationwithheld, BigDecimal kingdomid, BigDecimal phylumId, BigDecimal classId, BigDecimal ordersId, BigDecimal familyId, BigDecimal genusId, BigDecimal specificepithetId, BigDecimal infraspecificepithetId, String highertaxon, String kingdom, String phylum, String class_, String orders, String family, String genus, String specificepithet, String infraspecificepithet, String infraspecificrank, String authoryearofscientificname, String nomenclaturalcode, String identificationqualifier, String identifiedby, Date dateidentified, String typestatus, String collectingmethod, String validdistributionflag, String collectornumber, String fieldnumber, String collector, Date earliestdatecollected, Date latestdatecollected, String verbatimcollectingdate, BigDecimal dayofyear, String fieldnotes, String highergeography, String continent, String waterbody, String islandgroup, String island, String country, String stateprovince, String county, String locality, String decimallongitude, String verbatimlongitude, String decimallatitude, String verbatimlatitude, String geodeticdatum, String verbatimcoordinatesystem, String georeferenceprotocol, String coordinateuncertaintyinmeters, String georeferenceremarks, String footprintwkt, Double minimumelevationinmeters, Double maximumelevationinmeters, Double verbatimelevation, Double minimumdepthinmeters, Double maximumdepthinmeters, String sex, String lifestage, String preparations, BigDecimal individualcount, String genbanknum, String othercatalognumbers, String relatedcatalogitems, String remarks, String attributes, String imageurl, String relatedinformation, String disposition, BigDecimal pointradiusspatialfit, BigDecimal footprintspatialfit, String verbatimcoordinates, String georeferencesources, String georeferenceverificationstatus) {
       this.globaluniqueidentifier = globaluniqueidentifier;
       this.datelastmodified = datelastmodified;
       this.institutioncode = institutioncode;
       this.collectioncode = collectioncode;
       this.catalognumber = catalognumber;
       this.catalognumbernumeric = catalognumbernumeric;
       this.scientificname = scientificname;
       this.basisofrecord = basisofrecord;
       this.informationwithheld = informationwithheld;
       this.kingdomid = kingdomid;
       this.phylumId = phylumId;
       this.classId = classId;
       this.ordersId = ordersId;
       this.familyId = familyId;
       this.genusId = genusId;
       this.specificepithetId = specificepithetId;
       this.infraspecificepithetId = infraspecificepithetId;
       this.highertaxon = highertaxon;
       this.kingdom = kingdom;
       this.phylum = phylum;
       this.class_ = class_;
       this.orders = orders;
       this.family = family;
       this.genus = genus;
       this.specificepithet = specificepithet;
       this.infraspecificepithet = infraspecificepithet;
       this.infraspecificrank = infraspecificrank;
       this.authoryearofscientificname = authoryearofscientificname;
       this.nomenclaturalcode = nomenclaturalcode;
       this.identificationqualifier = identificationqualifier;
       this.identifiedby = identifiedby;
       this.dateidentified = dateidentified;
       this.typestatus = typestatus;
       this.collectingmethod = collectingmethod;
       this.validdistributionflag = validdistributionflag;
       this.collectornumber = collectornumber;
       this.fieldnumber = fieldnumber;
       this.collector = collector;
       this.earliestdatecollected = earliestdatecollected;
       this.latestdatecollected = latestdatecollected;
       this.verbatimcollectingdate = verbatimcollectingdate;
       this.dayofyear = dayofyear;
       this.fieldnotes = fieldnotes;
       this.highergeography = highergeography;
       this.continent = continent;
       this.waterbody = waterbody;
       this.islandgroup = islandgroup;
       this.island = island;
       this.country = country;
       this.stateprovince = stateprovince;
       this.county = county;
       this.locality = locality;
       this.decimallongitude = decimallongitude;
       this.verbatimlongitude = verbatimlongitude;
       this.decimallatitude = decimallatitude;
       this.verbatimlatitude = verbatimlatitude;
       this.geodeticdatum = geodeticdatum;
       this.verbatimcoordinatesystem = verbatimcoordinatesystem;
       this.georeferenceprotocol = georeferenceprotocol;
       this.coordinateuncertaintyinmeters = coordinateuncertaintyinmeters;
       this.georeferenceremarks = georeferenceremarks;
       this.footprintwkt = footprintwkt;
       this.minimumelevationinmeters = minimumelevationinmeters;
       this.maximumelevationinmeters = maximumelevationinmeters;
       this.verbatimelevation = verbatimelevation;
       this.minimumdepthinmeters = minimumdepthinmeters;
       this.maximumdepthinmeters = maximumdepthinmeters;
       this.sex = sex;
       this.lifestage = lifestage;
       this.preparations = preparations;
       this.individualcount = individualcount;
       this.genbanknum = genbanknum;
       this.othercatalognumbers = othercatalognumbers;
       this.relatedcatalogitems = relatedcatalogitems;
       this.remarks = remarks;
       this.attributes = attributes;
       this.imageurl = imageurl;
       this.relatedinformation = relatedinformation;
       this.disposition = disposition;
       this.pointradiusspatialfit = pointradiusspatialfit;
       this.footprintspatialfit = footprintspatialfit;
       this.verbatimcoordinates = verbatimcoordinates;
       this.georeferencesources = georeferencesources;
       this.georeferenceverificationstatus = georeferenceverificationstatus;
    }
   
    public String getGlobaluniqueidentifier() {
        return this.globaluniqueidentifier;
    }
    
    public void setGlobaluniqueidentifier(String globaluniqueidentifier) {
        this.globaluniqueidentifier = globaluniqueidentifier;
    }
    public Date getDatelastmodified() {
        return this.datelastmodified;
    }
    
    public void setDatelastmodified(Date datelastmodified) {
        this.datelastmodified = datelastmodified;
    }
    public String getInstitutioncode() {
        return this.institutioncode;
    }
    
    public void setInstitutioncode(String institutioncode) {
        this.institutioncode = institutioncode;
    }
    public String getCollectioncode() {
        return this.collectioncode;
    }
    
    public void setCollectioncode(String collectioncode) {
        this.collectioncode = collectioncode;
    }
    public String getCatalognumber() {
        return this.catalognumber;
    }
    
    public void setCatalognumber(String catalognumber) {
        this.catalognumber = catalognumber;
    }
    public BigDecimal getCatalognumbernumeric() {
        return this.catalognumbernumeric;
    }
    
    public void setCatalognumbernumeric(BigDecimal catalognumbernumeric) {
        this.catalognumbernumeric = catalognumbernumeric;
    }
    public String getScientificname() {
        return this.scientificname;
    }
    
    public void setScientificname(String scientificname) {
        this.scientificname = scientificname;
    }
    public String getBasisofrecord() {
        return this.basisofrecord;
    }
    
    public void setBasisofrecord(String basisofrecord) {
        this.basisofrecord = basisofrecord;
    }
    public String getInformationwithheld() {
        return this.informationwithheld;
    }
    
    public void setInformationwithheld(String informationwithheld) {
        this.informationwithheld = informationwithheld;
    }
    public BigDecimal getKingdomid() {
        return this.kingdomid;
    }
    
    public void setKingdomid(BigDecimal kingdomid) {
        this.kingdomid = kingdomid;
    }
    public BigDecimal getPhylumId() {
        return this.phylumId;
    }
    
    public void setPhylumId(BigDecimal phylumId) {
        this.phylumId = phylumId;
    }
    public BigDecimal getClassId() {
        return this.classId;
    }
    
    public void setClassId(BigDecimal classId) {
        this.classId = classId;
    }
    public BigDecimal getOrdersId() {
        return this.ordersId;
    }
    
    public void setOrdersId(BigDecimal ordersId) {
        this.ordersId = ordersId;
    }
    public BigDecimal getFamilyId() {
        return this.familyId;
    }
    
    public void setFamilyId(BigDecimal familyId) {
        this.familyId = familyId;
    }
    public BigDecimal getGenusId() {
        return this.genusId;
    }
    
    public void setGenusId(BigDecimal genusId) {
        this.genusId = genusId;
    }
    public BigDecimal getSpecificepithetId() {
        return this.specificepithetId;
    }
    
    public void setSpecificepithetId(BigDecimal specificepithetId) {
        this.specificepithetId = specificepithetId;
    }
    public BigDecimal getInfraspecificepithetId() {
        return this.infraspecificepithetId;
    }
    
    public void setInfraspecificepithetId(BigDecimal infraspecificepithetId) {
        this.infraspecificepithetId = infraspecificepithetId;
    }
    public String getHighertaxon() {
        return this.highertaxon;
    }
    
    public void setHighertaxon(String highertaxon) {
        this.highertaxon = highertaxon;
    }
    public String getKingdom() {
        return this.kingdom;
    }
    
    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }
    public String getPhylum() {
        return this.phylum;
    }
    
    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }
    public String getClass_() {
        return this.class_;
    }
    
    public void setClass_(String class_) {
        this.class_ = class_;
    }
    public String getOrders() {
        return this.orders;
    }
    
    public void setOrders(String orders) {
        this.orders = orders;
    }
    public String getFamily() {
        return this.family;
    }
    
    public void setFamily(String family) {
        this.family = family;
    }
    public String getGenus() {
        return this.genus;
    }
    
    public void setGenus(String genus) {
        this.genus = genus;
    }
    public String getSpecificepithet() {
        return this.specificepithet;
    }
    
    public void setSpecificepithet(String specificepithet) {
        this.specificepithet = specificepithet;
    }
    public String getInfraspecificepithet() {
        return this.infraspecificepithet;
    }
    
    public void setInfraspecificepithet(String infraspecificepithet) {
        this.infraspecificepithet = infraspecificepithet;
    }
    public String getInfraspecificrank() {
        return this.infraspecificrank;
    }
    
    public void setInfraspecificrank(String infraspecificrank) {
        this.infraspecificrank = infraspecificrank;
    }
    public String getAuthoryearofscientificname() {
        return this.authoryearofscientificname;
    }
    
    public void setAuthoryearofscientificname(String authoryearofscientificname) {
        this.authoryearofscientificname = authoryearofscientificname;
    }
    public String getNomenclaturalcode() {
        return this.nomenclaturalcode;
    }
    
    public void setNomenclaturalcode(String nomenclaturalcode) {
        this.nomenclaturalcode = nomenclaturalcode;
    }
    public String getIdentificationqualifier() {
        return this.identificationqualifier;
    }
    
    public void setIdentificationqualifier(String identificationqualifier) {
        this.identificationqualifier = identificationqualifier;
    }
    public String getIdentifiedby() {
        return this.identifiedby;
    }
    
    public void setIdentifiedby(String identifiedby) {
        this.identifiedby = identifiedby;
    }
    public Date getDateidentified() {
        return this.dateidentified;
    }
    
    public void setDateidentified(Date dateidentified) {
        this.dateidentified = dateidentified;
    }
    public String getTypestatus() {
        return this.typestatus;
    }
    
    public void setTypestatus(String typestatus) {
        this.typestatus = typestatus;
    }
    public String getCollectingmethod() {
        return this.collectingmethod;
    }
    
    public void setCollectingmethod(String collectingmethod) {
        this.collectingmethod = collectingmethod;
    }
    public String getValiddistributionflag() {
        return this.validdistributionflag;
    }
    
    public void setValiddistributionflag(String validdistributionflag) {
        this.validdistributionflag = validdistributionflag;
    }
    public String getCollectornumber() {
        return this.collectornumber;
    }
    
    public void setCollectornumber(String collectornumber) {
        this.collectornumber = collectornumber;
    }
    public String getFieldnumber() {
        return this.fieldnumber;
    }
    
    public void setFieldnumber(String fieldnumber) {
        this.fieldnumber = fieldnumber;
    }
    public String getCollector() {
        return this.collector;
    }
    
    public void setCollector(String collector) {
        this.collector = collector;
    }
    public Date getEarliestdatecollected() {
        return this.earliestdatecollected;
    }
    
    public void setEarliestdatecollected(Date earliestdatecollected) {
        this.earliestdatecollected = earliestdatecollected;
    }
    public Date getLatestdatecollected() {
        return this.latestdatecollected;
    }
    
    public void setLatestdatecollected(Date latestdatecollected) {
        this.latestdatecollected = latestdatecollected;
    }
    public String getVerbatimcollectingdate() {
        return this.verbatimcollectingdate;
    }
    
    public void setVerbatimcollectingdate(String verbatimcollectingdate) {
        this.verbatimcollectingdate = verbatimcollectingdate;
    }
    public BigDecimal getDayofyear() {
        return this.dayofyear;
    }
    
    public void setDayofyear(BigDecimal dayofyear) {
        this.dayofyear = dayofyear;
    }
    public String getFieldnotes() {
        return this.fieldnotes;
    }
    
    public void setFieldnotes(String fieldnotes) {
        this.fieldnotes = fieldnotes;
    }
    public String getHighergeography() {
        return this.highergeography;
    }
    
    public void setHighergeography(String highergeography) {
        this.highergeography = highergeography;
    }
    public String getContinent() {
        return this.continent;
    }
    
    public void setContinent(String continent) {
        this.continent = continent;
    }
    public String getWaterbody() {
        return this.waterbody;
    }
    
    public void setWaterbody(String waterbody) {
        this.waterbody = waterbody;
    }
    public String getIslandgroup() {
        return this.islandgroup;
    }
    
    public void setIslandgroup(String islandgroup) {
        this.islandgroup = islandgroup;
    }
    public String getIsland() {
        return this.island;
    }
    
    public void setIsland(String island) {
        this.island = island;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public String getStateprovince() {
        return this.stateprovince;
    }
    
    public void setStateprovince(String stateprovince) {
        this.stateprovince = stateprovince;
    }
    public String getCounty() {
        return this.county;
    }
    
    public void setCounty(String county) {
        this.county = county;
    }
    public String getLocality() {
        return this.locality;
    }
    
    public void setLocality(String locality) {
        this.locality = locality;
    }
    public String getDecimallongitude() {
        return this.decimallongitude;
    }
    
    public void setDecimallongitude(String decimallongitude) {
        this.decimallongitude = decimallongitude;
    }
    public String getVerbatimlongitude() {
        return this.verbatimlongitude;
    }
    
    public void setVerbatimlongitude(String verbatimlongitude) {
        this.verbatimlongitude = verbatimlongitude;
    }
    public String getDecimallatitude() {
        return this.decimallatitude;
    }
    
    public void setDecimallatitude(String decimallatitude) {
        this.decimallatitude = decimallatitude;
    }
    public String getVerbatimlatitude() {
        return this.verbatimlatitude;
    }
    
    public void setVerbatimlatitude(String verbatimlatitude) {
        this.verbatimlatitude = verbatimlatitude;
    }
    public String getGeodeticdatum() {
        return this.geodeticdatum;
    }
    
    public void setGeodeticdatum(String geodeticdatum) {
        this.geodeticdatum = geodeticdatum;
    }
    public String getVerbatimcoordinatesystem() {
        return this.verbatimcoordinatesystem;
    }
    
    public void setVerbatimcoordinatesystem(String verbatimcoordinatesystem) {
        this.verbatimcoordinatesystem = verbatimcoordinatesystem;
    }
    public String getGeoreferenceprotocol() {
        return this.georeferenceprotocol;
    }
    
    public void setGeoreferenceprotocol(String georeferenceprotocol) {
        this.georeferenceprotocol = georeferenceprotocol;
    }
    public String getCoordinateuncertaintyinmeters() {
        return this.coordinateuncertaintyinmeters;
    }
    
    public void setCoordinateuncertaintyinmeters(String coordinateuncertaintyinmeters) {
        this.coordinateuncertaintyinmeters = coordinateuncertaintyinmeters;
    }
    public String getGeoreferenceremarks() {
        return this.georeferenceremarks;
    }
    
    public void setGeoreferenceremarks(String georeferenceremarks) {
        this.georeferenceremarks = georeferenceremarks;
    }
    public String getFootprintwkt() {
        return this.footprintwkt;
    }
    
    public void setFootprintwkt(String footprintwkt) {
        this.footprintwkt = footprintwkt;
    }
    public Double getMinimumelevationinmeters() {
        return this.minimumelevationinmeters;
    }
    
    public void setMinimumelevationinmeters(Double minimumelevationinmeters) {
        this.minimumelevationinmeters = minimumelevationinmeters;
    }
    public Double getMaximumelevationinmeters() {
        return this.maximumelevationinmeters;
    }
    
    public void setMaximumelevationinmeters(Double maximumelevationinmeters) {
        this.maximumelevationinmeters = maximumelevationinmeters;
    }
    public Double getVerbatimelevation() {
        return this.verbatimelevation;
    }
    
    public void setVerbatimelevation(Double verbatimelevation) {
        this.verbatimelevation = verbatimelevation;
    }
    public Double getMinimumdepthinmeters() {
        return this.minimumdepthinmeters;
    }
    
    public void setMinimumdepthinmeters(Double minimumdepthinmeters) {
        this.minimumdepthinmeters = minimumdepthinmeters;
    }
    public Double getMaximumdepthinmeters() {
        return this.maximumdepthinmeters;
    }
    
    public void setMaximumdepthinmeters(Double maximumdepthinmeters) {
        this.maximumdepthinmeters = maximumdepthinmeters;
    }
    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getLifestage() {
        return this.lifestage;
    }
    
    public void setLifestage(String lifestage) {
        this.lifestage = lifestage;
    }
    public String getPreparations() {
        return this.preparations;
    }
    
    public void setPreparations(String preparations) {
        this.preparations = preparations;
    }
    public BigDecimal getIndividualcount() {
        return this.individualcount;
    }
    
    public void setIndividualcount(BigDecimal individualcount) {
        this.individualcount = individualcount;
    }
    public String getGenbanknum() {
        return this.genbanknum;
    }
    
    public void setGenbanknum(String genbanknum) {
        this.genbanknum = genbanknum;
    }
    public String getOthercatalognumbers() {
        return this.othercatalognumbers;
    }
    
    public void setOthercatalognumbers(String othercatalognumbers) {
        this.othercatalognumbers = othercatalognumbers;
    }
    public String getRelatedcatalogitems() {
        return this.relatedcatalogitems;
    }
    
    public void setRelatedcatalogitems(String relatedcatalogitems) {
        this.relatedcatalogitems = relatedcatalogitems;
    }
    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public String getAttributes() {
        return this.attributes;
    }
    
    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }
    public String getImageurl() {
        return this.imageurl;
    }
    
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
    public String getRelatedinformation() {
        return this.relatedinformation;
    }
    
    public void setRelatedinformation(String relatedinformation) {
        this.relatedinformation = relatedinformation;
    }
    public String getDisposition() {
        return this.disposition;
    }
    
    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }
    public BigDecimal getPointradiusspatialfit() {
        return this.pointradiusspatialfit;
    }
    
    public void setPointradiusspatialfit(BigDecimal pointradiusspatialfit) {
        this.pointradiusspatialfit = pointradiusspatialfit;
    }
    public BigDecimal getFootprintspatialfit() {
        return this.footprintspatialfit;
    }
    
    public void setFootprintspatialfit(BigDecimal footprintspatialfit) {
        this.footprintspatialfit = footprintspatialfit;
    }
    public String getVerbatimcoordinates() {
        return this.verbatimcoordinates;
    }
    
    public void setVerbatimcoordinates(String verbatimcoordinates) {
        this.verbatimcoordinates = verbatimcoordinates;
    }
    public String getGeoreferencesources() {
        return this.georeferencesources;
    }
    
    public void setGeoreferencesources(String georeferencesources) {
        this.georeferencesources = georeferencesources;
    }
    public String getGeoreferenceverificationstatus() {
        return this.georeferenceverificationstatus;
    }
    
    public void setGeoreferenceverificationstatus(String georeferenceverificationstatus) {
        this.georeferenceverificationstatus = georeferenceverificationstatus;
    }




}


