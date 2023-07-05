package my.effective.java.chapter2.item1;

import my.effective.java.chapter2.item1.Item;
import my.effective.java.chapter2.item1.ItemWithBarcode;
import my.effective.java.chapter2.item1.ItemWithOrigin;
import my.effective.java.chapter2.item1.ItemWithPrice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ItemTest {


	@Test
	void 중복_반환() {
		Item bestSellingItem1 = Item.withPrice("베스트셀러", 10000);
		Item bestSellingItem2 = Item.withPrice("베스트셀러", 20000);
		Item diffItem1 = Item.withPrice("삼겹살", 3000);
		Item diffItem2 = Item.withPrice("삼겹살", 4000);

		assertEquals(bestSellingItem1.hashCode(), bestSellingItem2.hashCode());
		assertNotEquals(diffItem1.hashCode(), diffItem2.hashCode());
	}

	@Test
	void 매개변수에_따른_다른_하위객체() {
		Item itemWithBarcode = Item.withBarcode("광천김", "1lIlII!!ll1");
		Item itemWithPrice = Item.withPrice("삼다수", 1000);
		Item itemWithOrigin = Item.withOrigin("국산김치", "중국");

		assertEquals(ItemWithBarcode.class, itemWithBarcode.getClass());
		assertEquals(ItemWithPrice.class, itemWithPrice.getClass());
		assertEquals(ItemWithOrigin.class, itemWithOrigin.getClass());
	}

}
