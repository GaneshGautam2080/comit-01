package com.comit.course._07_Overloading;


/*
 * Overlaoding is a situation where in the same class, two or more methods/constructors
 * have the same name but different parameters
 */
class MyClass{
	
	int num;
	String str;
	
	
	/* 
	 * Overloading only works with methods and constructors 
	 */
	 /* 
	 * 1.Constructor Overloading
	 */
	MyClass() {
	}
	
	MyClass(String str) {
		this.str=str;
	}
	
	MyClass(int num) {
		this.num = num;
	}
	
	MyClass(String str, int num) {
		this.str=str;
		this.num = num;
	}
	
	MyClass( int num, String str) {
		this.str=str;
		this.num = num;
	}


/*
* 2. Method Overloading
*/
	/* Overloading by changing the type of the parameters */
	
	String concatenate (String str, int num) {
		return str + " " + num;
		
	}
	String concatenate (String str) {
		return "Hello" + str;
	}
	
	/* Overloading by changing the number of the parameters */
	int add (int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
			
		}
	}
	/*
	 

class Hello{
	string str1;
	string str2
	
	MyClass(String str1) {
		this.str1=str1;
	
}
*/
public class Overloading {

public static void main(String[] args) {
 int a, b, c;
 MyClass obj1 = new MyClass();
 MyClass obj2 = new MyClass("CoMIT");
MyClass obj3 = new MyClass(1);
MyClass obj4 = new MyClass("ComIT");

System.out.println(obj1.concatenate("ComIT", 1));
//System.out.println(obj1.concatenate(1, "ComIT" ));
System.out.println(obj1.concatenate("ComIT" ));

System.out.println(obj1.add(1, 2));
System.out.println(obj1.add(1, 2, 3));

}
}
 
	



