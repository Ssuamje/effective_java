package my.effective.java.chapter4.item18;

public class CatIsAnimal extends Animal {

	public CatIsAnimal(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("응애옹");
		// 여기서 갑자기 animal이 갖는(자식도 갖는) 프로퍼티를 변경해버린다면 캡슐화가 깨질 여지가 있다..!
	}
}
