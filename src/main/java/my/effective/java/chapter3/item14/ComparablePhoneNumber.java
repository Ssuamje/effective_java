package my.effective.java.chapter3.item14;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.Comparator;

@AllArgsConstructor
@EqualsAndHashCode
public class ComparablePhoneNumber implements Comparable<ComparablePhoneNumber> {

	//비교자 생성 메서드
	private static final Comparator<ComparablePhoneNumber> COMPARATOR =
			Comparator.comparing((ComparablePhoneNumber pn) -> pn.areaCode)
					.thenComparing(pn -> pn.prefix)
					.thenComparing(pn -> pn.lineNumber);
	//정적 compare 메서드
	public static Comparator<Object> hashCodeOrder = new Comparator<>() {
		public int compare(Object o1, Object o2) {
			return o1.hashCode() - o2.hashCode();
		}
	};
	private final String areaCode;
	private final String prefix;
	private final String lineNumber;

	@Override
	public int compareTo(ComparablePhoneNumber phoneNumber) {
		int result = areaCode.compareTo(phoneNumber.areaCode);
		if (result == 0) {
			result = prefix.compareTo(phoneNumber.prefix);
			if (result == 0) {
				result = lineNumber.compareTo(phoneNumber.lineNumber);
			}
		}
		return result;
	}

	public int compareToByComparator(ComparablePhoneNumber phoneNumber) {
		return COMPARATOR.compare(this, phoneNumber);
	}
}
