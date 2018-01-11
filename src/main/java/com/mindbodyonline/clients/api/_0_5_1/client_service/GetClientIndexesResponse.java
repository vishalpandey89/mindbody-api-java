
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetClientIndexesResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetClientIndexesResult" minOccurs="0"/>
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
    "getClientIndexesResult"
})
@XmlRootElement(name = "GetClientIndexesResponse")
public class GetClientIndexesResponse {

    @XmlElement(name = "GetClientIndexesResult")
    protected GetClientIndexesResult getClientIndexesResult;

    /**
     * Gets the value of the getClientIndexesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetClientIndexesResult }
     *     
     */
    public GetClientIndexesResult getGetClientIndexesResult() {
        return getClientIndexesResult;
    }

    /**
     * Sets the value of the getClientIndexesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetClientIndexesResult }
     *     
     */
    public void setGetClientIndexesResult(GetClientIndexesResult value) {
        this.getClientIndexesResult = value;
    }

}