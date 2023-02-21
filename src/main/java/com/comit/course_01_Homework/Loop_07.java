package com.comit.course_01_Homework;

import java.util.Scanner;

public class Loop_07 {

	public static void main(String[] args) {
				
		Scanner sc= new Scanner(System.in);    
		System.out.print("Enter a Number : ");  
		int a= sc.nextInt();  
		
		int num = 100, sum = 0;

        for(int i = a; i <= num; ++i)
        {
           
        	sum += i;
        }

        System.out.println("Sum = " + sum);
		
			
		
	}
		}


	


