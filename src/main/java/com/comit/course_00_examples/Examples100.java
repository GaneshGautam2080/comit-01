package com.comit.course_00_examples;

class Parent {
	
	int a= 3;
			
	
	void print() {
		System.out.println("I am the Parent");
	}
	
}

class Child extends Parent{
	void print() {
		System.out.println("I am the Child");
}

public class Examples1 {

	public static void main(String[] args) {
Parent obj = new Child();
obj.print();
	}

}
}