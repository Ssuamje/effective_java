package my.effective.java.chapter4.item18;

public class ChildCapsule extends ParentCapsule {


	public ChildCapsule(String mySecretCanBeToldOnlyToParents, Integer weightCanBeToldOnlyToMyself, String nameCanBeTold) {
		super(mySecretCanBeToldOnlyToParents, weightCanBeToldOnlyToMyself, nameCanBeTold);
	}

	@Override
	public void introduce() {
		System.out.println("안녕하세요. 저는 " + getName() + "인데요,");
		System.out.println("저가 부모님한테만 말하는 비밀은 " + getMySecretCanBeToldOnlyToParents() + "이구요,");
		System.out.println("저만 알고 있는 제 몸무게는 " + getWeightCanBeToldOnlyToMyself() + "입니다.");
	}
}
