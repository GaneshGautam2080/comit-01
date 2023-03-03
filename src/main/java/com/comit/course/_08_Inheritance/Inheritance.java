package com.comit.course._08_Inheritance;

class Person{

String name;
int age;

void setName(String name) {
	this.name = name;
}
void setAge(int age) {
	this.age = age;
}

public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}
}
class Employee extends Person {  //Child class
	
	
}

class Accountant extends person{

	
class Customer extends Person {  //Child class	
	
}
/* In General the toString method return a string that
 * "Textually represent" this object.
 */

public class Single {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("Joe");
		emp1.setAge(40);
		
		
		Accountant acc1 = new Accountant();
		acc1.setName("John");
		acc1.setAge(45);
		
		System.out.println(acc1);
		
		
		/*
		 * System.out.println() calls the toString () method automatically when it receives an object.
		 */
		
		System.out.println(emp1);
	}
}
}
