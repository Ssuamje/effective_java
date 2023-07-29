package my.effective.java.chapter7.item44;

import lombok.Getter;

@Getter
public class DomainEntity implements Validatable {

	private final String name;
	private final Validator<String> validator;

	public DomainEntity(String name, Validator<String> validator) {
		this.name = name;
		this.validator = validator;
	}

	@Override
	public boolean isValid() {
		return validator.isValid(this.name);
	}
}
