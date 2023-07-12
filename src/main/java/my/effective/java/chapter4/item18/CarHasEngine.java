package my.effective.java.chapter4.item18;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CarHasEngine {
	private EngineBelongsToCar engine;

	public void start() {
		engine.start();
	}
}
