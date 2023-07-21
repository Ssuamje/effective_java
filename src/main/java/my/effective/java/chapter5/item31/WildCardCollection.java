package my.effective.java.chapter5.item31;

import java.util.Collection;

public class WildCardCollection {
	static <T> void copyToCollection(Collection<? extends T> src, Collection<? super T> dest) {
		for (T t : src) {
			dest.add(t);
		}
	}

	static void printCollection(Collection<? super Fruit> collection) {
		for (Object obj : collection) {
			System.out.println(obj);
		}
	}
}
