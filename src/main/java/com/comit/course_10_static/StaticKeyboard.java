package com.comit.course_10_static;

/* 
 * the keyboard static indicates that the number belongs to the class and not the object.
 */

class MyClass{
	
	/*
	 * Static class attributes are shared across all the objects of the class
	 */
	
	static int num;
	
	/* Static method() belongs to the class */
	
	static int addNumbers(int a, int b) {
		
		/* If the logic inside the method depends only on the parameters
		 * then the method can be static
		 */
		/* we cannot call non-static methods from static methods */
		
		// print (a,b);
		return a+b;
	}
	
	/* non-static method() belongs to the object */
	void print(int a, int b) {
		
		/* If inside the method we use class sttributes then the method 
		/* we can call static methods from non-static methods */

		int num = addNumbers(a,b);
		System.out.println(a+b);
	}
	
}

public class StaticKeyboard {

	public static void main(String[] args) {
	/*	
		MyClass obj1 = new MyClass();
		obj1.num = 10;
		
		MyClass obj2 = new MyClass();
		obj1.num = 20;
		
		MyClass obj3 = new MyClass();
		obj3.num = 30;
		
		System.out.println(obj1.num); 
				
		*/
		/* We can call the static method directly using the class name*/

		System.out.println(MyClass.addNumbers(3, 4));  
		
		/* We can call the static method directly using the class name*/
		MyClass obj = new MyClass();
		System.out.println(MyClass.addNumbers(3, 5));  
		
		/* 
		 * Two ways to call methods from a main() method 
		 *  1. Make method we want to call static 
		 */
		// hello();
		/* 2. Create an object of the class and use it to call the method */
		
		StaticKeyboard obj4 = new StaticKeyboard ();
		obj4.hello();
		
	}
	void hello() {
		System.out.println("Hello");
		
	}

}
