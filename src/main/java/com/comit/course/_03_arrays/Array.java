package com.comit.course._03_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		int i0 =  0;
		int i1 =  1;
		int i2 =  2;
		int i3 =  3;
		int i4 =  4;
		int i5 =  5;
		int i6 =  6;
		int i7 =  7;
		int i8 =  8;
		int i9 =  9;
		
		/* Java Book Page 41 - 48 */
		
		/* An Array is a data structure that holds a sequence of elements of the size type */
		/* in other programming languages arrays are called lists */
		/* the arrays in Java are not resizeable - drawback -> Java Arraylist  */
		/* Declare the array and initialize it  (Allocating memory */
		
		int[] a = { 4, 5, 7, 2, 14, 35, 46, 71, 28, 19};
		
		   /* index 0, 1, 2, 3,  4, 5,   6,  7,  8,  9    
		
		
		// System.out.println(a[9]);
		
		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			System.out.println(j);
		}
		
		
		for(int i :a  ) {
			System.out.print(i + " ");
			
			}
		
		// System.out.println- prints a new line after prining the elements
		//system.out.print-prints out the element with out new line
		
		/* print out the memory address
		System.out.println(a);
		
		// Java Library arrays print out the emements of the array in one line
		
		*/
		
		//1st way to create an array when I know the initial values
		int[] b = { 4, 5, 7, 2, 14, 35, 46, 71, 28, 19, 12};
		
	// index 0, 1, 2, 3,  4, 5,   6,  7,  8,  9    
		
		b[7] = -1;
		
		//2nd way to create an array when I don't know the initial values
				
		int size = 10;
		int[] c = new int[size];
				c[4] = 107;
			
				c[c.length-1] =  108;
			System.out.println( Arrays.toString(c));
		
		String[] brands= {"Toyota","Ford", "Nissan", "BMW"};
		
		String[]d= new String [4];
				d[0] = "John";
		d[1] = "Jane";
		System.out.println( Arrays.toString(brands));
		
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Studnet 0 Grade");
		i0 = scan.nextInt();
		
		System.out.println("Input Studnet 1 Grade");
		i1 = scan.nextInt();
		
		System.out.println("Input Studnet 2 Grade");
		i2 = scan.nextInt();
		
		System.out.println("Input Studnet 3 Grade");
		i3 = scan.nextInt();
		*/
					
	}

}
