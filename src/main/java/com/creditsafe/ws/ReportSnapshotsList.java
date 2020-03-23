
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportSnapshotsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportSnapshotsList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="ReportSnapshot" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ReportSnapshotData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Results" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="FirstPosition" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="TotalResults" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="PageSize" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportSnapshotsList", propOrder = {
    "reportSnapshot"
})
public class ReportSnapshotsList
    extends ServiceResponse
{

    @XmlElement(name = "ReportSnapshot")
    protected List<ReportSnapshotData> reportSnapshot;
    @XmlAttribute(name = "Results", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long results;
    @XmlAttribute(name = "FirstPosition", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long firstPosition;
    @XmlAttribute(name = "TotalResults", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long totalResults;
    @XmlAttribute(name = "PageSize", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long pageSize;

    /**
     * Gets the value of the reportSnapshot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportSnapshot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportSnapshot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportSnapshotData }
     * 
     * 
     */
    public List<ReportSnapshotData> getReportSnapshot() {
        if (reportSnapshot == null) {
            reportSnapshot = new ArrayList<ReportSnapshotData>();
        }
        return this.reportSnapshot;
    }

    /**
     * Gets the value of the results property.
     * 
     */
    public long getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     */
    public void setResults(long value) {
        this.results = value;
    }

    /**
     * Gets the value of the firstPosition property.
     * 
     */
    public long getFirstPosition() {
        return firstPosition;
    }

    /**
     * Sets the value of the firstPosition property.
     * 
     */
    public void setFirstPosition(long value) {
        this.firstPosition = value;
    }

    /**
     * Gets the value of the totalResults property.
     * 
     */
    public long getTotalResults() {
        return totalResults;
    }

    /**
     * Sets the value of the totalResults property.
     * 
     */
    public void setTotalResults(long value) {
        this.totalResults = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public long getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(long value) {
        this.pageSize = value;
    }

}
