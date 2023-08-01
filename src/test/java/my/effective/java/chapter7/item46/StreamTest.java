package my.effective.java.chapter7.item46;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	@DisplayName("forEach를 하면 매 시행마다 side effect가 발생한다.")
	@Test
	void forEach_sideEffect() {
		List<Person> people = List.of(
				new Person("Alice", 20),
				new Person("Bob", 30),
				new Person("Charlie", 40)
		);

		people.forEach(person -> {
			person.setAge(person.getAge() + 1);
			System.out.println("people = " + people);
		});
		//people = [Person(name=Alice, age=21), Person(name=Bob, age=30), Person(name=Charlie, age=40)]
		//people = [Person(name=Alice, age=21), Person(name=Bob, age=31), Person(name=Charlie, age=40)]
		//people = [Person(name=Alice, age=21), Person(name=Bob, age=31), Person(name=Charlie, age=41)]
	}

	@DisplayName("무한 스트림으로 출력해보기")
	@Test
	void infinite_stream() {
		Stream<Integer> infinite = Stream.iterate(0, i -> i + 3);
		infinite.limit(4).forEach(System.out::println);
		//0
		//3
		//6
		//9
	}

	@DisplayName("toMap을 이용해보기")
	@Test
	void toMap() {
		List<Person> people = List.of(
				new Person("Alice", 20),
				new Person("Bob", 30),
				new Person("Charlie", 50)
		);

		// 매개변수가 2개인 toMap
		// 해당 stream의 원소를 기준으로 key와 value를 추출하여 Map으로 반환한다.
		Map<String, Integer> nameAndAgeMap = people.stream()
				.collect(Collectors.toMap(
						Person::getName,
						Person::getAge
				));
		System.out.println("nameAndAgeMap = " + nameAndAgeMap);
		//nameAndAgeMap = {Bob=30, Alice=20, Charlie=50}

		List<Person> people2 = List.of(
				new Person("Alice", 20),
				new Person("Alice", 30),
				new Person("Bob", 30),
				new Person("Bob", 40),
				new Person("Charlie", 50)
		);
		// 매개변수가 3개인 value 충돌시 병합 BinaryOperator를 받는 toMap
		Map<String, Person> nameToOldestPerson = people2.stream()
				.collect(Collectors.toMap(
						Person::getName,
						person -> person,
						(existingValue, newValue) -> existingValue.getAge() > newValue.getAge() ? existingValue : newValue
				));

		System.out.println(nameToOldestPerson);
		//{Bob=Person(name=Bob, age=40), Alice=Person(name=Alice, age=30), Charlie=Person(name=Charlie, age=50)}
	}

	@DisplayName("groupingBy 이용해보기")
	@Test
	void test() {
		List<Person> people = List.of(
				new Person("Sangje", 20),
				new Person("Sangjai", 20),
				new Person("Sangjin", 30),
				new Person("Sangjing", 30),
				new Person("Eomma", 50),
				new Person("Appa", 50)
		);

		Map<Integer, List<Person>> peopleByAge = people.stream()
				.collect(Collectors.groupingBy(Person::getAge));
		System.out.println("peopleByAge = " + peopleByAge);
		//{50=[
		// Person(name=Eomma, age=50),
		// Person(name=Appa, age=50)],
		// 20=[Person(name=Sangje, age=20),
		// Person(name=Sangjai, age=20)],
		// 30=[Person(name=Sangjin, age=30),
		// Person(name=Sangjing, age=30)]}
	}

	@DisplayName("joining 써보기")
	@Test
	void joining_test() {
		List<Person> people = List.of(
				new Person("Alice", 20),
				new Person("Bob", 30),
				new Person("Charlie", 50)
		);

		String names = people.stream()
				.map(Person::getName)
				.collect(Collectors.joining(", "));
		System.out.println("names = " + names);
		//names = Alice, Bob, Charlie
	}

}
