package my.effective.java.chapter4.item17;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@EqualsAndHashCode
public class Car {
	private final String maker;
	private final String model;
	private final int year;
}

class CarFactory {
	public static Car createCar(String maker, String model, int year) {
		return new Car(maker, model, year);
	}
}


