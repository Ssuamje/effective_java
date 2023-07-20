package my.effective.java.chapter4.item23;

public class FlatPhone extends AbstractCellPhone {
	public FlatPhone() {
		this.operatingSystem = "iOS";
	}

	@Override
	public void closePhone() {
		System.out.println("터치폰을 끕니다.");
	}

	@Override
	public void forcePowerOff() throws InterruptedException {
		System.out.println("전원 버튼과 볼륨 버튼을 꾹 누릅니다.");
		Thread.sleep(1000 * 20);
		System.out.println("전원이 꺼집니다.");
	}
}
