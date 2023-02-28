package com.comit.course._06_oop;

/* A Class is construction map or blueprint for creating objects.
 * 
 * A class has three types of elements.
 * 
 * 		1. Attributes
 * 		2. Constructors 
 * 		3. Methods
*/
class Employee {
	
	/* Attributes - fields - Properties - Instance Variables
	 * Variables inside the class.
	 */
	int id;
	String name;
	double salary;
	String position;
	
	/* 
	 * 1 Constructors : a special method that is used to initialize the objects. 
 * 						the constructors is called automatically when we create a object. 
 * 						types of constructors 
 * 						
 * 				A Constructor has the same name of the Class and returns nothing
 * 
 * 				types
 * 						1. Default - it is created by Java when you don't have a constructor.
 * 						2. Parameterized
 */
	Employee(){
	
  /* Default Constructor created by Java automatically for us
	 * when we don't have any constructor
	 * 
	 */
	}
 
		Employee(int id, String name, double salary, String position) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.position = position;
	}


	/* Methods is a block of code that runs when it is called.
	 * 
	 * return type - method name - parameters - block of code
	 */
	/*
	 * To follow the encapsulation OOP concept we should use
	 * getter and setters
	 */
	
	int getId() {
	return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	String getPositions() {
		return position;
	}
	
	void setPosition(String position) {
		this.position = position;
	}
	
		void display() {  /* methods declaration - Methods signature */
		/* method's body */
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(position);
	}
	
	double bonusEmployee(double percentage) {
		/* CamelCase is the convention for naming variables, methods and class */
		
		double empBonusCompany = (salary * percentage)/100;
		return empBonusCompany;
	}		
}

		


		public class MyClass {

			public static void main(String[] args) {
				
				/* 
				 * new keyword allocates memory for the object.
				 */
		
				Employee emp1 = new Employee(); /*Create an object called emp1 from class Employee */
				emp1.id = 1020;
				emp1.name = "John"; /* Should not access object attributes attributes directly from other classes */
				emp1.salary = 80000;
				emp1.position= "Manager";

				emp1.display();

				double bonus = emp1.bonusEmployee(10);
				System.out.println("bonus: " + bonus);

				/*
				 * Create emp2 from class Employee
				 */
				Employee emp2 = new Employee(); /*Create an object called emp1 from class Employee */
				emp2.id = 1030;
				emp2.name = "Jane"; /* Should not access object attributes attributes directly from other classes */
				emp2.salary = 100000;
				emp2.position= "Director";

				emp2.display();

				bonus = emp2.bonusEmployee(8);
				System.out.println("bonus: " + bonus);

				/*
				 * Create emp3 using a parameterized constructor.
				 */
				
				Employee emp3= new Employee(1040, "Mike,", 90000, "General Accountant");
				emp3.display();
				bonus = emp3.bonusEmployee(9);
				System.out.println("bonus: " + bonus);
}
}