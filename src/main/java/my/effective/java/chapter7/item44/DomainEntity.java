package my.effective.java.chapter7.item44;

import lombok.Getter;

@Getter
public class DomainEntity implements Validatable {

	private final String name;
	private final Validator<String> validator;

	// validation의 경우에는 외부에서 변경될 로직이 아니므로 상황과 맞지 않지만,
	// 그냥 연습삼아서 내부 로직을 변경할 수 있도록 주입받게끔 구성해보았음
	public DomainEntity(String name, Validator<String> validator) {
		this.name = name;
		this.validator = validator;
	}

	@Override
	public boolean isValid() {
		return validator.isValid(this.name);
	}
}
