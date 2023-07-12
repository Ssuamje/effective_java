package my.effective.java.chapter4.item19;

public class InferClass extends SuperClass {
	private final Integer age;

	public InferClass(String name, Integer age) {
		super(name);
		this.age = age;
	}

	@Override
	public void introduce() {
		System.out.println("안녕하세요. 저는 " + getName() + "인데요, 제 나이는 " + age + "입니다.");
	}
}
