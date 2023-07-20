package my.effective.java.chapter4.item24;

import org.junit.jupiter.api.Test;

public class MemberClassTest {

	@Test
	void 정적_멤버_클래스() {
		StaticMemberClass outer = new StaticMemberClass();
		StaticMemberClass.StaticNestedClass inner = new StaticMemberClass.StaticNestedClass("Inner Field");

		outer.printFields();
		//Outer Field : Outer Field

		inner.printFields();
		//Outer Field : Outer Field
		//Inner Field : Inner Field
	}

	@Test
	void 비정적_멤버_클래스() {
		NonStaticMemberClass outer = new NonStaticMemberClass();
		NonStaticMemberClass.NonStaticNestedClass inner = outer.new NonStaticNestedClass("Inner Field");

		inner.printFields();
		//Outer Field : Modified by Inner Class
		//Inner Field : Inner Field

		NonStaticViewClass outer2 = new NonStaticViewClass();
		NonStaticViewClass.View view = outer2.new View();
		view.printField();
		//Outer Field : Outer Value
	}
}
