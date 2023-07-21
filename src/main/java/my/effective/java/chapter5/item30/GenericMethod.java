package my.effective.java.chapter5.item30;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
	public static <E> List<E> mergeLists(List<E>... lists) {
		List<E> ret = new ArrayList<>();
		for (List<E> list : lists) {
			ret.addAll(list);
		}
		return ret;
	}

	@Deprecated
	public static List<?> mergeLists2(List<?>... lists) {
		List<?> result = new ArrayList<>();
		for (List<?> list : lists) {
//			result.addAll(list); // 컴파일 에러
		}
		return result;
	}
}
