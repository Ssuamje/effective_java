package my.effective.java.chapter4.item18;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ParentCapsule {
	private final String mySecretCanBeToldOnlyToParents;
	private final Integer weightCanBeToldOnlyToMyself;
	private final String nameCanBeTold;

	public String getName() {
		return nameCanBeTold;
	}

	protected String getMySecretCanBeToldOnlyToParents() {
		return mySecretCanBeToldOnlyToParents;
	}

	protected Integer getWeightCanBeToldOnlyToMyself() {
		return weightCanBeToldOnlyToMyself;
	}

	public void introduce() {
		System.out.println("안녕하세요. 저는 " + nameCanBeTold + "입니다.");
	}
}
