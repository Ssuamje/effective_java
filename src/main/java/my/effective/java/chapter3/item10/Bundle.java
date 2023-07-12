package my.effective.java.chapter3.item10;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bundle {
	private final String item;
	private final Integer price;
	private final Integer quantity;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Bundle)) return false;
		Bundle bundle = (Bundle) o;
		return item.equals(bundle.item) && price.equals(bundle.price) && quantity.equals(bundle.quantity);
	}
}
