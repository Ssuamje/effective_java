package my.effective.java.chapter3.item10;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Entity {
	private final int id;
	private final String name;
	private final Integer age;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Entity)) return false;
		Entity entity = (Entity) o;
		return id == entity.id;
	}
}
