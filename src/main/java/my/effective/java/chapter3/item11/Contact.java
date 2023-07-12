package my.effective.java.chapter3.item11;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Contact {

	private final String name;
	private final PhoneNumber phoneNumber;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Contact)) return false;
		Contact contact = (Contact) o;
		return name.equals(contact.name) &&
				phoneNumber.equals(contact.phoneNumber);
	}
}
