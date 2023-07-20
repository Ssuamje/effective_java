package my.effective.java.chapter4.item20;

public class WashingSkeleton implements Washing {
	@Override // 양치는 반드시 세게 해야 함
	public void toothBrush() {
		System.out.println("양치 구석구석 꼼꼼하게 해버리기~");
	}

	@Override
	public void bodyWash() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void hairDry() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void faceWash() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void doWashing() {
		toothBrush();
		bodyWash();
		hairDry();
		faceWash();
	}
}
