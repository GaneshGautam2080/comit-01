package com.comit.course._11_final;

/*
 * The final keyword can be applied on Classes, methods and variables.
 */

/*
 * A class final cannot be extended.
 * For instance: String, Integer
 */
class Parent{

	/*
	 * A final method cannot be overridden by a child class.
	 */
	void print() {
		System.out.println("I am the Parent class");
	}
}

class Child extends Parent {
	
	@Override
	void print() {
		System.out.println("I am the Child class");
	}
}


