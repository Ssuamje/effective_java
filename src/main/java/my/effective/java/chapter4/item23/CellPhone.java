package my.effective.java.chapter4.item23;

public class CellPhone {

	private final DeviceType deviceType;
	private final String operatingSystem;
	private Integer foldingLifeSpan;

	public CellPhone() { // 터치폰
		deviceType = DeviceType.FLAT;
		this.operatingSystem = "iOS";
	}

	public CellPhone(Integer foldingLifeSpan) { // 폴딩폰
		deviceType = DeviceType.FOLDABLE;
		this.operatingSystem = "Samsung";
		this.foldingLifeSpan = foldingLifeSpan;
	}

	public void closePhone() {
		switch (deviceType) {
			case FOLDABLE:
				System.out.println("폴딩폰을 접습니다.");
				foldingLifeSpan--;
				if (foldingLifeSpan == 0) {
					System.out.println("뽀각");
				}
				break;
			case FLAT:
				System.out.println("터치폰을 끕니다.");
				break;
		}
	}

	public void forcePowerOff() throws InterruptedException {
		switch (operatingSystem) {
			case "Samsung":
				System.out.println("전원 버튼을 꾹 누릅니다.");
				Thread.sleep(1000 * 10);
				System.out.println("전원이 꺼집니다.");
				break;
			case "iOS":
				System.out.println("전원 버튼과 볼륨 버튼을 꾹 누릅니다.");
				Thread.sleep(1000 * 20);
				System.out.println("전원이 꺼집니다.");
				break;
		}
	}
}
