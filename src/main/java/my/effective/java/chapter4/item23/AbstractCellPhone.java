package my.effective.java.chapter4.item23;

public abstract class AbstractCellPhone {
	protected String operatingSystem;

	public abstract void closePhone();

	public abstract void forcePowerOff() throws InterruptedException;
}
