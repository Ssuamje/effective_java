package my.effective.java.chapter2.item3;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PublicSniper {

	public static final PublicSniper INSTANCE = new PublicSniper();

	public void shoot() {
		System.out.println("PUBLIC: 탕~!");
	}
}
