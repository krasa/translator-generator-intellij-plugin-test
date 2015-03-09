package a;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Main complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Main">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numbers" type="{a}Numbers"/>
 *         &lt;element name="strings" type="{a}Strings"/>
 *         &lt;element name="unsignedByte" type="{a}unsignedByte"/>
 *         &lt;element name="choices" type="{a}Choices"/>
 *         &lt;element name="enumerations" type="{a}Enumerations"/>
 *         &lt;element name="enumeration" type="{a}Enumeration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Main", propOrder = {
		"numbers",
		"strings",
		"unsignedByte",
		"choices",
		"enumerations",
		"enumeration"
})
public class Main {

	@XmlElement(required = true)
	@NotNull
	@Valid
	protected Numbers numbers;
	@XmlElement(required = true)
	@NotNull
	@Valid
	protected Strings strings;
	@NotNull
	@DecimalMax("255")
	@DecimalMin("0")
	protected short unsignedByte;
	@XmlElement(required = true)
	@NotNull
	@Valid
	protected Choices choices;
	@XmlElement(required = true)
	@NotNull
	@Valid
	protected Enumerations enumerations;
	@XmlElement(required = true)
	@NotNull
	@Valid
	protected Enumeration enumeration;

	/**
	 * Gets the value of the numbers property.
	 *
	 * @return possible object is
	 * {@link Numbers }
	 */
	public Numbers getNumbers() {
		return numbers;
	}

	/**
	 * Sets the value of the numbers property.
	 *
	 * @param value allowed object is
	 *              {@link Numbers }
	 */
	public void setNumbers(Numbers value) {
		this.numbers = value;
	}

	/**
	 * Gets the value of the strings property.
	 *
	 * @return possible object is
	 * {@link Strings }
	 */
	public Strings getStrings() {
		return strings;
	}

	/**
	 * Sets the value of the strings property.
	 *
	 * @param value allowed object is
	 *              {@link Strings }
	 */
	public void setStrings(Strings value) {
		this.strings = value;
	}

	/**
	 * Gets the value of the unsignedByte property.
	 */
	public short getUnsignedByte() {
		return unsignedByte;
	}

	/**
	 * Sets the value of the unsignedByte property.
	 */
	public void setUnsignedByte(short value) {
		this.unsignedByte = value;
	}

	/**
	 * Gets the value of the choices property.
	 *
	 * @return possible object is
	 * {@link Choices }
	 */
	public Choices getChoices() {
		return choices;
	}

	/**
	 * Sets the value of the choices property.
	 *
	 * @param value allowed object is
	 *              {@link Choices }
	 */
	public void setChoices(Choices value) {
		this.choices = value;
	}

	/**
	 * Gets the value of the enumerations property.
	 *
	 * @return possible object is
	 * {@link Enumerations }
	 */
	public Enumerations getEnumerations() {
		return enumerations;
	}

	/**
	 * Sets the value of the enumerations property.
	 *
	 * @param value allowed object is
	 *              {@link Enumerations }
	 */
	public void setEnumerations(Enumerations value) {
		this.enumerations = value;
	}

	/**
	 * Gets the value of the enumeration property.
	 *
	 * @return possible object is
	 * {@link Enumeration }
	 */
	public Enumeration getEnumeration() {
		return enumeration;
	}

	/**
	 * Sets the value of the enumeration property.
	 *
	 * @param value allowed object is
	 *              {@link Enumeration }
	 */
	public void setEnumeration(Enumeration value) {
		this.enumeration = value;
	}

}
