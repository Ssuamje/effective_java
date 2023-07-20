package my.effective.java.chapter5.item29;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GenericStackTest {

	@Test
	void 제네릭_스택() {
		GenericStack<String> stack = new GenericStack<>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");

		assertThat(stack.size()).isEqualTo(5);
		assertThat(stack.pop()).isEqualTo("5");
	}

}