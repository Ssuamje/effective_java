package my.effective.java.chapter2.item1;

public interface Item {

	static ItemWithPrice bestSellingItemWithPrice = new ItemWithPrice("베스트셀러", 100);
	static Item withPrice(String name, Integer price) {
		if (name.equals(bestSellingItemWithPrice.getName()))
			return bestSellingItemWithPrice; // 참조만 하는 인스턴스(멤버가 final)이므로 가능
		return new ItemWithPrice(name, price);
	}

	static Item withBarcode(String name, String barcode) {
		return new ItemWithBarcode(name, barcode);
	}

	static Item withOrigin(String name, String origin) {
		return new ItemWithOrigin(name, origin);
	}

	String getName();
}
