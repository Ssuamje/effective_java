package my.effective.java.chapter5.item29;

import java.util.Arrays;
import java.util.EmptyStackException;

public class GenericStack<E> {
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	private E[] elements;
	private int size = 0;

	@SuppressWarnings("unchecked")
	public GenericStack() {
		elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public E pop() {
		if (size == 0)
			throw new EmptyStackException();
		E result = elements[--size];
		elements[size] = null; // 다 쓴 참조 해제
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
}
