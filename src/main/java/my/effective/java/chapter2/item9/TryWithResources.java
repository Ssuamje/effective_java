package my.effective.java.chapter2.item9;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResources {
	public String readFirstLineFromFile(String path) {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			throw new RuntimeException("finally 블록에서도 예외가 발생하면 try 블록에서 발생한 예외는 무시된다.");
		}
	}
}
