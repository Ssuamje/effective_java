package my.effective.java.chapter4.item24;

public class NonStaticViewClass {
	private final String outerField = "Outer Value";


	public class View {
		public void printField() {
			System.out.println("Outer Field : " + outerField);
		}
	}
}
