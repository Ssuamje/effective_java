package my.effective.java.chapter4.item24;

public class NonStaticMemberClass {
	private String outerField = "Outer Value";

	public class NonStaticNestedClass {
		private final String innerField;

		public NonStaticNestedClass(String innerField) {
			this.innerField = innerField;
		}

		public void printFields() {
			// 외부 클래스의 상태를 변경함
			outerField = "Modified by Inner Class";
			System.out.println("Outer Field : " + outerField);
			System.out.println("Inner Field : " + innerField);
		}
	}
}
