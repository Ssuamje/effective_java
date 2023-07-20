package my.effective.java.chapter4.item23;

public class FoldablePhone extends AbstractCellPhone {
	private Integer foldingLifeSpan;

	public FoldablePhone(Integer foldingLifeSpan) {
		this.operatingSystem = "Samsung";
		this.foldingLifeSpan = foldingLifeSpan;
	}

	@Override
	public void closePhone() {
		System.out.println("폴딩폰을 접습니다.");
		foldingLifeSpan--;
		if (foldingLifeSpan == 0) {
			System.out.println("뽀각");
		}
	}

	@Override
	public void forcePowerOff() throws InterruptedException {
		System.out.println("전원 버튼을 꾹 누릅니다.");
		Thread.sleep(1000 * 10);
		System.out.println("전원이 꺼집니다.");
	}

	public void alwaysOnDisplay() {
		System.out.println("AOD로 시간이 보인다");
	}
}
