package com.comit.course._02_flow_control;

public class ifStatement {

	public static void main(String[] args) {
		
		int a = 28;
		int b = 28;
		
		// format your code on Eclipse
		// Control A (Select All) and Ctrl + Shift + F
		// Mac - Command + A to select all and Command + Shift + F  
		
		
	// 1 Scenario
		if (a > b) {
			System.out.println("a is greater than b");
		}  
		else if (a < b) {
			System.out.println("a is less than b");
		} 
		else {
			System.out.println("a is equal to b");
		}
		
		// 2 Scenario
		
		if (a > b) {
			System.out.println("a is greater than b");
		 if (a < b) {
			System.out.println("a is less than b");
		if (a == b) {
			System.out.println("a is equall to b");
		}
		
		int c =25;
		if (a > b ) {
			if (a < c) {
				System.out.println(" a is equal to b");
			}
		}
			
			String str;
			a= 10;
			b = 15;
			
			 if  (a > b ) {
				 str = "a greater than b";
				 }
			 else { 
				 str = "a less than b";
				 }
			 
			 //Ternary Operator ? :
			 str = (a > b ) ? "a greater than b" : "a less than b";
			 System.out.println(str);
		}
		}
	}
}
		
		 

		
