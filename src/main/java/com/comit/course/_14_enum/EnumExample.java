package com.comit.course._14_enum;

/*
 * An enum is a special class that represents a group of constant.
 */


enum Size{
	SMALL,MEDIUM,LARGE
}

class Glass{
	
	/*
	 * Small =1
	 * Medium = 2
	 * Large = 3
	 */
	/*
	static final int SMALL = 1;
	static final int MEDIUM = 2;
	static final int LARGE = 3;
	
	*/
	Size size;
	
	void setSize(Size size) {
		this.size = size;
		
			
	}
void print() {
	System.out.println("Size is "+ this.size);
}
}
public class EnumExample {

	public static void main(String[] args) {
Glass obj = new Glass();
obj.setSize(Size.LARGE);
obj.print();
	}

}
