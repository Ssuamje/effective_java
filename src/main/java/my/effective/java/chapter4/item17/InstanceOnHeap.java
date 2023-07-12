package my.effective.java.chapter4.item17;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class InstanceOnHeap {
	private int count;

	public static InstanceOnHeap of(int count) {
		return new InstanceOnHeap(count);
	}

	public void add() {
		count++;
	}
}
