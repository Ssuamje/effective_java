package my.effective.java.chapter4.item17;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public final class Immutable {
	private final String name;
	private final String address;
	private final int count;
	private InstanceOnHeap mutableCount; // 참조는 외부에서 받을 수 없음

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getCount() {
		return count;
	}

	public InstanceOnHeap getMutableCountDefensively() {
		return InstanceOnHeap.of(mutableCount.getCount());
	}

	public void increaseMutableCount() {
		mutableCount.add();
	}

	public Immutable functionalLikeImmutableAdd() {
		return new Immutable(name, address, count + 1, mutableCount);
	}
}
