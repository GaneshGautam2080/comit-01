package com.comit.course_01_operators;

public class Logical {

	public static void main(String[] args) {
		
		boolean a= true;
		boolean b = false;
		boolean c = false;

		boolean and = a && b;  // the "and" operator true only of both  operands are true.
		boolean or = a ||b; //The "or " operator returns false only if both operands are false.
		boolean not = !a; // the "not returns the opposite.

		System.out.println(and);
		System.out.println(or);
		System.out.println(not);
				
		

	}

}
