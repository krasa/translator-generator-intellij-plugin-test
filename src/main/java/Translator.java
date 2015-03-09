import a.Main;
import b.Choices;
import b.Enumeration;
import b.Enumerations;
import b.NumberWithCode;
import b.Numbers;
import b.Strings;

import java.util.List;

public class Translator {

	public b.Main translateMain(Main input) {
		if (input == null) {
			return null;
		}
		b.Main result = new b.Main();
		result.setNumbers(translateNumbers(input.getNumbers()));
		result.setStrings(translateStrings(input.getStrings()));
		result.setUnsignedByte(input.getUnsignedByte());
		result.setChoices(translateChoices(input.getChoices()));
		result.setEnumerations(translateEnumerations(input.getEnumerations()));
		result.setEnumeration(translateEnumeration(input.getEnumeration()));
		return result;
	}

	public Choices translateChoices(a.Choices input) {
		if (input == null) {
			return null;
		}
		Choices result = new Choices();
		result.setTea(input.getTea());
		result.setCoffee(input.getCoffee());
		return result;
	}

	public Numbers translateNumbers(a.Numbers input) {
		if (input == null) {
			return null;
		}
		Numbers result = new Numbers();
		result.setMinInclusive(input.getMinInclusive());
		result.setMaxInclusive(input.getMaxInclusive());
		result.setMinExclusive(input.getMinExclusive());
		result.setMaxExclusive(input.getMaxExclusive());
		result.setMinMaxExclusive(input.getMinMaxExclusive());
		result.setNumberWithCode(translateNumberWithCode(input.getNumberWithCode()));
		return result;
	}

	public Enumerations translateEnumerations(a.Enumerations input) {
		if (input == null) {
			return null;
		}
		Enumerations result = new Enumerations();
		result.setFoo(input.getFoo());
		return result;
	}

	public Strings translateStrings(a.Strings input) {
		if (input == null) {
			return null;
		}
		Strings result = new Strings();
		result.setPattern(input.getPattern());
		result.setGenericString(input.getGenericString());
		result.setMaxLength(input.getMaxLength());
		result.setMinLength(input.getMinLength());
		List<Object> inputSomeCollection = input.getSomeCollection();
		List<Object> resultSomeCollection = result.getSomeCollection();
		for (Object item : inputSomeCollection) {
			resultSomeCollection.add(item);
		}
		return result;
	}

	public Enumeration translateEnumeration(a.Enumeration input) {
		if (input == null) {
			return null;
		}
		Enumeration result = new Enumeration();
		result.setFoo(input.getFoo());
		return result;
	}

	public NumberWithCode translateNumberWithCode(a.NumberWithCode input) {
		if (input == null) {
			return null;
		}
		NumberWithCode result = new NumberWithCode();
		result.setValue(input.getValue());
		result.setCode(input.getCode());
		return result;
	}


}
