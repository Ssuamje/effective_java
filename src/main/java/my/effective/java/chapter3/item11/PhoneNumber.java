package my.effective.java.chapter3.item11;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PhoneNumber {

	private final String areaCode;
	private final String prefix;
	private final String lineNumber;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof PhoneNumber)) return false;
		PhoneNumber that = (PhoneNumber) o;
		return areaCode.equals(that.areaCode) &&
				prefix.equals(that.prefix) &&
				lineNumber.equals(that.lineNumber);
	}

	@Override
	public int hashCode() {
		int result = areaCode.hashCode();
		result = 31 * result + prefix.hashCode();
		result = 31 * result + lineNumber.hashCode();
		return result;
	}
}
