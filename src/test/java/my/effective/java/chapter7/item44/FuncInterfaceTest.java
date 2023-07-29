package my.effective.java.chapter7.item44;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FuncInterfaceTest {

	@DisplayName("")
	@Test
	void test() {
		DomainEntity domain = new DomainEntity("domain", s -> !s.isEmpty());
		DomainEntity emptyDomain = new DomainEntity("", s -> !s.isEmpty());

		assertThat(domain.isValid()).isTrue();
		assertThat(emptyDomain.isValid()).isFalse();
	}
}
