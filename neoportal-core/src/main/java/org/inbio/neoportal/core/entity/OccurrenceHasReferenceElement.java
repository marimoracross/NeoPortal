package org.inbio.neoportal.core.entity;
// Generated 02/03/2011 05:06:45 PM by Hibernate Tools 3.1.0.beta4



/**
 * OccurrenceHasReferenceElement generated by hbm2java
 */

public class OccurrenceHasReferenceElement  implements java.io.Serializable {


    // Fields    

     private OccurrenceHasReferenceElementId id;
     private ReferenceElement referenceElement;
     private Occurrence occurrence;
     private String value;


    // Constructors

    /** default constructor */
    public OccurrenceHasReferenceElement() {
    }

	/** minimal constructor */
    public OccurrenceHasReferenceElement(OccurrenceHasReferenceElementId id, ReferenceElement referenceElement, Occurrence occurrence) {
        this.id = id;
        this.referenceElement = referenceElement;
        this.occurrence = occurrence;
    }
    
    /** full constructor */
    public OccurrenceHasReferenceElement(OccurrenceHasReferenceElementId id, ReferenceElement referenceElement, Occurrence occurrence, String value) {
        this.id = id;
        this.referenceElement = referenceElement;
        this.occurrence = occurrence;
        this.value = value;
    }
    

   
    // Property accessors

    public OccurrenceHasReferenceElementId getId() {
        return this.id;
    }
    
    public void setId(OccurrenceHasReferenceElementId id) {
        this.id = id;
    }

    public ReferenceElement getReferenceElement() {
        return this.referenceElement;
    }
    
    public void setReferenceElement(ReferenceElement referenceElement) {
        this.referenceElement = referenceElement;
    }

    public Occurrence getOccurrence() {
        return this.occurrence;
    }
    
    public void setOccurrence(Occurrence occurrence) {
        this.occurrence = occurrence;
    }

    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
   








}