package com.comit.course._access_modifier._01_private;


/*
 * The Private access modifier can only be applied for attributes, constructors, methods
 * 
 */
 class MyClass{
	 
	 
	private int num;
	//private MyClass(){
//	}
	
	void print() {
		System.out.println("MyClass " );
	}

	int getNum() {
		return num;
	}

	void setNum(int num) {
		this.num = num;
	}
		
	}


public class PrivateExamples {

	public static void main(String[] args) {

		MyClass obj = new MyClass();
		obj.setNum(4);
		obj.print();
	}

}
