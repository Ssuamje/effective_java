package my.effective.java.chapter2.item1;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ItemWithOrigin implements Item{
	private final String name;
	private final String origin;
}
