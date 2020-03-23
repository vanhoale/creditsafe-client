
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCriteriaSchema.QueryStringSchema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriteriaSchema.QueryStringSchema">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.ValueSchema_String">
 *       &lt;sequence>
 *         &lt;element name="AllowedMatchTypes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AllowedMatchType" type="{http://www.creditsafe.com/globaldata/datatypes}QueryMatchType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteriaSchema.QueryStringSchema", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "allowedMatchTypes"
})
public class SearchCriteriaSchemaQueryStringSchema
    extends SearchCriteriaSchemaValueSchemaString
{

    @XmlElement(name = "AllowedMatchTypes", required = true)
    protected SearchCriteriaSchemaQueryStringSchema.AllowedMatchTypes allowedMatchTypes;

    /**
     * Gets the value of the allowedMatchTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaQueryStringSchema.AllowedMatchTypes }
     *     
     */
    public SearchCriteriaSchemaQueryStringSchema.AllowedMatchTypes getAllowedMatchTypes() {
        return allowedMatchTypes;
    }

    /**
     * Sets the value of the allowedMatchTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaQueryStringSchema.AllowedMatchTypes }
     *     
     */
    public void setAllowedMatchTypes(SearchCriteriaSchemaQueryStringSchema.AllowedMatchTypes value) {
        this.allowedMatchTypes = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AllowedMatchType" type="{http://www.creditsafe.com/globaldata/datatypes}QueryMatchType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allowedMatchType"
    })
    public static class AllowedMatchTypes {

        @XmlElement(name = "AllowedMatchType", namespace = "http://www.creditsafe.com/globaldata/datatypes", required = true)
        @XmlSchemaType(name = "string")
        protected List<QueryMatchType> allowedMatchType;

        /**
         * Gets the value of the allowedMatchType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the allowedMatchType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAllowedMatchType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueryMatchType }
         * 
         * 
         */
        public List<QueryMatchType> getAllowedMatchType() {
            if (allowedMatchType == null) {
                allowedMatchType = new ArrayList<QueryMatchType>();
            }
            return this.allowedMatchType;
        }

    }

}
