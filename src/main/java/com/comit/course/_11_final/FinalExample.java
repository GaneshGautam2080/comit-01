package com.comit.course._11_final;

/*
 * The final keyword can be applied on Classes, Methods and Variables.
 * 
 * If you make a class final then class can not be extended.
 * For instance: String , Integer
 */

class Parent{
	
	void print() {
	System.out.println("I am the Parent Class");
	}
}
class Child extends Parent {
	@Override
	void print() {
	System.out.println("I am the Child Class");

	}
	
}

public class FinalExample {
	
	/* A final class attribut cannot be updated -> constant.
	 * A constant in java is defined as static final.
	 * By convention constants in Java must ll in UPPERCASE letters.
	 */
	
	
	static int num = 4;

	public static void main(String[] args) {
	num = 5;

	}

}
}
