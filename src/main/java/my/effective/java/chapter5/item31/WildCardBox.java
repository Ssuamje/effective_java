package my.effective.java.chapter5.item31;

import lombok.Getter;

@Getter
public class WildCardBox<T extends Comparable<T>> { // Comparable을 구현한 타입만 받는다.
	private T item;

	public WildCardBox(T item) {
		this.item = item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public int compareTo(WildCardBox<? extends T> otherBox) {
		return this.item.compareTo(otherBox.item);
	}
}
