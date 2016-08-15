//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 07:40:50 PM MSK 
//


package TaskModule2.generated;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flower" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="soil">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="dirt"/>
 *                         &lt;enumeration value="podzolic"/>
 *                         &lt;enumeration value="sod-podzolic"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="visualParameters">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="trunkColour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="leafColour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="growingTips">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="water" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="multiplying">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="cuttings"/>
 *                         &lt;enumeration value="seeds"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "flower"
})
@XmlRootElement(name = "flowers")
public class Flowers {
    @Override
    public String toString() {
        StringBuffer o = new StringBuffer();
        List<Flowers.Flower> flower = getFlower();
        for (Flower f : flower
                ) {
            o.append("Name: ").append(f.getName()).append(", Soil: ").append(f.getSoil())
                    .append(", Origin: ").append(f.getOrigin()).append(", Visual Parameters: [")
                    .append(f.getVisualParameters().getLeafColour()).append(",")
                    .append(f.getVisualParameters().getTrunkColour()).append(",")
                    .append(f.getVisualParameters().getSize()).append("], Growing Tips: [")
                    .append(f.getGrowingTips().getTemperature()).append(",")
                    .append(f.getGrowingTips().getWater()).append("], Multiplying: ")
                    .append(f.getMultiplying()).append("\n");
        }
        return o.toString();
    }

    @XmlElement(required = true)
    protected List<Flowers.Flower> flower;

    /**
     * Gets the value of the flower property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flower property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlower().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flowers.Flower }
     */
    public List<Flowers.Flower> getFlower() {
        if (flower == null) {
            flower = new ArrayList<Flowers.Flower>();
        }
        return this.flower;
    }


    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="soil">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="dirt"/>
     *               &lt;enumeration value="podzolic"/>
     *               &lt;enumeration value="sod-podzolic"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="visualParameters">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="trunkColour" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="leafColour" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="growingTips">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="water" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="multiplying">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="cuttings"/>
     *               &lt;enumeration value="seeds"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "name",
            "soil",
            "origin",
            "visualParameters",
            "growingTips",
            "multiplying"
    })
    public static class Flower {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String soil;
        @XmlElement(required = true)
        protected String origin;
        @XmlElement(required = true)
        protected Flowers.Flower.VisualParameters visualParameters;
        @XmlElement(required = true)
        protected Flowers.Flower.GrowingTips growingTips;
        @XmlElement(required = true)
        protected String multiplying;

        /**
         * Gets the value of the name property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the soil property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getSoil() {
            return soil;
        }

        /**
         * Sets the value of the soil property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSoil(String value) {
            this.soil = value;
        }

        /**
         * Gets the value of the origin property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getOrigin() {
            return origin;
        }

        /**
         * Sets the value of the origin property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOrigin(String value) {
            this.origin = value;
        }

        /**
         * Gets the value of the visualParameters property.
         *
         * @return possible object is
         * {@link Flowers.Flower.VisualParameters }
         */
        public Flowers.Flower.VisualParameters getVisualParameters() {
            return visualParameters;
        }

        /**
         * Sets the value of the visualParameters property.
         *
         * @param value allowed object is
         *              {@link Flowers.Flower.VisualParameters }
         */
        public void setVisualParameters(Flowers.Flower.VisualParameters value) {
            this.visualParameters = value;
        }

        /**
         * Gets the value of the growingTips property.
         *
         * @return possible object is
         * {@link Flowers.Flower.GrowingTips }
         */
        public Flowers.Flower.GrowingTips getGrowingTips() {
            return growingTips;
        }

        /**
         * Sets the value of the growingTips property.
         *
         * @param value allowed object is
         *              {@link Flowers.Flower.GrowingTips }
         */
        public void setGrowingTips(Flowers.Flower.GrowingTips value) {
            this.growingTips = value;
        }

        /**
         * Gets the value of the multiplying property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getMultiplying() {
            return multiplying;
        }

        /**
         * Sets the value of the multiplying property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMultiplying(String value) {
            this.multiplying = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="water" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "temperature",
                "water"
        })
        public static class GrowingTips {

            @XmlElement(required = true)
            protected BigInteger temperature;
            @XmlElement(required = true)
            protected BigInteger water;

            /**
             * Gets the value of the temperature property.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getTemperature() {
                return temperature;
            }

            /**
             * Sets the value of the temperature property.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setTemperature(BigInteger value) {
                this.temperature = value;
            }

            /**
             * Gets the value of the water property.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getWater() {
                return water;
            }

            /**
             * Sets the value of the water property.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setWater(BigInteger value) {
                this.water = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="trunkColour" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="leafColour" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "trunkColour",
                "leafColour",
                "size"
        })
        public static class VisualParameters {

            @XmlElement(required = true)
            protected String trunkColour;
            @XmlElement(required = true)
            protected String leafColour;
            @XmlElement(required = true)
            protected String size;

            /**
             * Gets the value of the trunkColour property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrunkColour() {
                return trunkColour;
            }

            /**
             * Sets the value of the trunkColour property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrunkColour(String value) {
                this.trunkColour = value;
            }

            /**
             * Gets the value of the leafColour property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeafColour() {
                return leafColour;
            }

            /**
             * Sets the value of the leafColour property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeafColour(String value) {
                this.leafColour = value;
            }

            /**
             * Gets the value of the size property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSize() {
                return size;
            }

            /**
             * Sets the value of the size property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSize(String value) {
                this.size = value;
            }

        }

    }

}