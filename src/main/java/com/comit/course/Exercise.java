package com.comit.course;

class Password{
	
	String password;
	int length = 8;
	
	Password(int length) {
		super();
		this.length = length;
	}

/*
 * Write a Code that generate
 * a random password
 */

	void generatePassword() {
		
	
		/*Generate a random password
		 * Create random numbers from 32 126 
	
		 */
		
	Random rand = new Random(126);
		 int counter = 0;
		 while (counter < length) {
			 int num = rand.nextInt();
			 char car = (char)num;
			 password = password + car;
					 counter++;
		 
	}
	
}

}

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password [] password = new Password [5];
		
		
	}

}
