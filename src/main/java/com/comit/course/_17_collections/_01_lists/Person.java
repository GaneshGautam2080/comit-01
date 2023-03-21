package com.comit.course._17_collections._01_lists;

import java.util.Objects;

public class Person {
	int id;
	String name;
	int age;
	public Person(String name, int age) {
		//super();
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
/*
 * Java uses the equals method() to compare Person objects
 * if the equal () method is not overwritten then Java will
 * use the memory address
 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	

}
