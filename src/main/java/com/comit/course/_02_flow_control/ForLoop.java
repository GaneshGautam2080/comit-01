package com.comit.course._02_flow_control;

public class ForLoop {

	/*
	 * the for-loop is used when you know exactly how many times you want
	 * to loop through a block of code.
	 */
	
	
	public static void main(String[] args) {
		
		int i = 0;
				
		while (i < 10) {
			System.out.println(i);
			i++;
			
			/*
			if (i == 5) {
				//break;  // breaks out the loop
				continue // continues with the next interaction 
			} 
		/* initialization; termination; incresement */
		for (int j = 0; j<10; j++) {
			
			if (j==5) {
				continue;
			}
			System.out.println(j);
		}
			//System.out.println(i);
		} //while (i <10);
		
		*/
		System.out.println("The End");
		
		int a = 5
				int[] array = {1,2,3,4,5};
		
		for (int c: array) {
			System.out.println(c);
		}

	}


