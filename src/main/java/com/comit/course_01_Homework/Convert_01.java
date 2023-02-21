package com.comit.course_01_Homework;

import java.util.Scanner;

public class Convert_01 {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);    
		System.out.print("Enter Cad Dollor : ");  
		double c= sc.nextDouble();  
		
		System.out.println("Converted USD= " +c*0.74);  
	}
}