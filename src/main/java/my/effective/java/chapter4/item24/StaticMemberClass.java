package my.effective.java.chapter4.item24;

public class StaticMemberClass {
	private static final String outerField = "Outer Field";

	public void printFields() {
		System.out.println("Outer Field : " + outerField);
	}

	public static class StaticNestedClass {
		private final String innerField;

		public StaticNestedClass(String innerField) {
			this.innerField = innerField;
		}

		public void printFields() {
			System.out.println("Outer Field : " + outerField);
			System.out.println("Inner Field : " + innerField);
		}
	}
}
