package com.comit.course._05_Scanner;

import java.util.Scanner;
public class Scan {

	
	
	/* Scanner - accepting user input
	 * Page 59 - 62
	 */
	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)){
		
		System.out.println("Plese enter an integer:");
		
		/* Read an integer number from the keyboard
		 * 
		 */
		int i = scan.nextInt();
		//int i = scan.nextInt();

			
	System.out.println("you input:" + i);
	
	
	}
	//scan.close();
		
			}

}
