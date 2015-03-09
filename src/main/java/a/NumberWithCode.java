package a;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for NumberWithCode complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="NumberWithCode">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;a>Number">
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberWithCode", propOrder = {
		"value"
})
public class NumberWithCode {

	@XmlValue
	@Size(min = 1, max = 5)
	protected String value;
	@XmlAttribute(name = "code")
	protected String code;

	/**
	 * Gets the value of the value property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the code property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the value of the code property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setCode(String value) {
		this.code = value;
	}

}
