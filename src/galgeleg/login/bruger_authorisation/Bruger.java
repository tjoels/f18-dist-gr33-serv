
package galgeleg.login.bruger_authorisation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for bruger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bruger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brugernavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidstAktiv" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="campusnetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studeretning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fornavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="efternavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adgangskode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ekstraFelter">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bruger", propOrder = {
    "brugernavn",
    "email",
    "sidstAktiv",
    "campusnetId",
    "studeretning",
    "fornavn",
    "efternavn",
    "adgangskode",
    "ekstraFelter"
})
public class Bruger {

    protected String brugernavn;
    protected String email;
    protected long sidstAktiv;
    protected String campusnetId;
    protected String studeretning;
    protected String fornavn;
    protected String efternavn;
    protected String adgangskode;
    @XmlElement(required = true)
    protected Bruger.EkstraFelter ekstraFelter;

    /**
     * Gets the value of the brugernavn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBrugernavn() {
        return brugernavn;
    }

    /**
     * Sets the value of the brugernavn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBrugernavn(String value) {
        this.brugernavn = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the sidstAktiv property.
     *
     */
    public long getSidstAktiv() {
        return sidstAktiv;
    }

    /**
     * Sets the value of the sidstAktiv property.
     *
     */
    public void setSidstAktiv(long value) {
        this.sidstAktiv = value;
    }

    /**
     * Gets the value of the campusnetId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCampusnetId() {
        return campusnetId;
    }

    /**
     * Sets the value of the campusnetId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCampusnetId(String value) {
        this.campusnetId = value;
    }

    /**
     * Gets the value of the studeretning property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStuderetning() {
        return studeretning;
    }

    /**
     * Sets the value of the studeretning property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStuderetning(String value) {
        this.studeretning = value;
    }

    /**
     * Gets the value of the fornavn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFornavn() {
        return fornavn;
    }

    /**
     * Sets the value of the fornavn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFornavn(String value) {
        this.fornavn = value;
    }

    /**
     * Gets the value of the efternavn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEfternavn() {
        return efternavn;
    }

    /**
     * Sets the value of the efternavn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEfternavn(String value) {
        this.efternavn = value;
    }

    /**
     * Gets the value of the adgangskode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdgangskode() {
        return adgangskode;
    }

    /**
     * Sets the value of the adgangskode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdgangskode(String value) {
        this.adgangskode = value;
    }

    /**
     * Gets the value of the ekstraFelter property.
     *
     * @return
     *     possible object is
     *     {@link Bruger.EkstraFelter }
     *
     */
    public Bruger.EkstraFelter getEkstraFelter() {
        return ekstraFelter;
    }

    /**
     * Sets the value of the ekstraFelter property.
     *
     * @param value
     *     allowed object is
     *     {@link Bruger.EkstraFelter }
     *
     */
    public void setEkstraFelter(Bruger.EkstraFelter value) {
        this.ekstraFelter = value;
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
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "entry"
    })
    public static class EkstraFelter {

        protected List<Entry> entry;

        /**
         * Gets the value of the entry property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Bruger.EkstraFelter.Entry }
         *
         *
         */
        public List<Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<Entry>();
            }
            return this.entry;
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
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
            "key",
            "value"
        })
        public static class Entry {

            protected String key;
            protected Object value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setValue(Object value) {
                this.value = value;
            }

        }

    }

}
