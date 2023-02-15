package com.comit.course_01_operators;

public class Relational {

	//Relational Operators
	public static void main(String[] args) {
		
				int a = 10;
				int b = 8 ;
				int c = 2;
				
				boolean equalTo          = a ==b;
				boolean notEqual         = a !=b;
				boolean greaterThan      = a > b;
				boolean lessThan         = a < b;
				boolean greaterThanEqual = a >= b;
				boolean LessThanEqual    = a <= b;
				
				
				boolean exp = (a == b) && (c>= b)|| (a > c );
				
				//              false   and true
				//              false
				
				System.out.println("Equal To:" + equalTo);
				System.out.println("Not Equal To:" + notEqual);
				System.out.println("Greater Than:" + greaterThan);
				System.out.println("Less Than:" + lessThan);
				System.out.println("Greater Than Equals To:" + greaterThanEqual);
				System.out.println("Less Than Euals To "+ LessThanEqual);
				System.out.println("Expression: " + exp);

	}

}
