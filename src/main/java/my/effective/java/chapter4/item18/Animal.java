package my.effective.java.chapter4.item18;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Animal {
	private final String name;
	private final int age;

	public void makeSound() {
		System.out.println("[뭔가 소리를 내고 있음]");
	}
}
