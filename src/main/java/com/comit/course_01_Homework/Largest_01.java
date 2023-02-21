package com.comit.course_01_Homework;

import java.util.Scanner;

public class Largest_01 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter first number- "); 
		int a= sc.nextInt(); 
		System.out.print("Enter second number- "); 
		int b= sc.nextInt(); 

		if (a > b) {
			System.out.println("a is greater than b");
		if (a < b) {
			System.out.println("a is less than b");
		if (a == b) {
			System.out.println("a is equall to b");
		}
	}

		}
	}
}
