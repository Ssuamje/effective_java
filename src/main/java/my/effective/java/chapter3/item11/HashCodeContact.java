package my.effective.java.chapter3.item11;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HashCodeContact {

	private final String name;
	private final PhoneNumber phoneNumber;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof HashCodeContact)) return false;
		HashCodeContact hashCodeContact = (HashCodeContact) o;
		return name.equals(hashCodeContact.name) &&
				phoneNumber.equals(hashCodeContact.phoneNumber);
	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + phoneNumber.hashCode();
		return result;
	}
}
