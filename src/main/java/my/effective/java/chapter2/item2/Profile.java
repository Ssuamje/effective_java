package my.effective.java.chapter2.item2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor(access = PRIVATE) // new Profile() 방지
@Getter
public class Profile {
	private static final ProfileBuilder BUILDER_INSTANCE = new ProfileBuilder(); // Profile.ProfileBuilder가 불편해..
	private final String name;
	private final String hobby;
	private final int age;

	public static ProfileBuilder builder() {
		return BUILDER_INSTANCE; // new ProfileBuilder()가 아까워서 한번 해봤다.
	}

	protected static class ProfileBuilder {
		private String name;
		private String hobby;
		private int age;

		private ProfileBuilder() { // new ProfileBuilder() 방지
		}

		public ProfileBuilder name(String name) {
			this.name = name;
			return this;
		}

		public ProfileBuilder hobby(String hobby) {
			this.hobby = hobby;
			return this;
		}

		public ProfileBuilder age(int age) {
			this.age = age;
			return this;
		}

		public Profile build() {
			Profile profile = new Profile(name, hobby, age);
			this.age = 0;
			this.name = null;
			this.hobby = null;
			return profile;
		}
	}
}
