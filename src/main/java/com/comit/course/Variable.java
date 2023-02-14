package com.comit.course;

public class Variable {

	public static void main(String[] arg) {
		
    /*
     comment
     Primitive data types.
	integer Variables 
	*/
	
	/* Declaration and Initialization*/
	int a = 10; /*4 bytes */
	long b = 1000000; /*8 Bytes */
	
	short c =  32000; /*2 bytes */
	byte d =  -120; /* 1 byte */
/* Decimal Variables */
			
			Double e = 10.456;  /*8 bytes */
	float f = 1445.453F; /* 4 bytes */

	/* Text Variables 	 */
	char g = 'A';  // 2 bytes
	
	boolean h =true;
	
	/* reference type 
	* Never compare reference type variable with the operators
	* always compare refereence type variable withh equall() method
	
	* 1. String s = new String ("Hello"); //standard Way//
	* 2. String s = "Hello";
	*/
	String s1 = "Hello";
	String s2= "Hello";
	if (s1.equals(s2)) {
		System.out.println("Equal " + s1 + "-" + s2 );
	}
	else  {
			System.out.println("Not Equall " +s1 + "-" + s2);
		}
	}
	
	
	//System.out.println(h);//
	

}


