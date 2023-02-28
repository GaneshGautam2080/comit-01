package com.comit.course_01_Homework;

public class Library {

	
		
		class Book {
			
			String bookName;
			String author;
			int noOfCopies;
			int noOfLandCopies;
						
			Book(){
		
			}
		 
				Book(String bookName, String author, int noOfCopies, int noOfLandCopies) {
				super();
				this.bookName = bookName;
				this.author = author;
				this.noOfCopies = noOfCopies;
				this.noOfLandCopies = noOfLandCopies;
			}
				
				String getBookName() {
					return bookName;
				}

				void setBookName(String bookName) {
					this.bookName = bookName;
				}

				String getAuthor() {
					return author;
				}

				void setAuthor(String author) {
					this.author = author;
				}

				int getNoOfCopies() {
					return noOfCopies;
				}

				void setNoOfCopies(int noOfCopies) {
					this.noOfCopies = noOfCopies;
				}

				int getNoOfLandCopies() {
					return noOfLandCopies;
				}

				void setNoOfLandCopies(int noOfLandCopies) {
					this.noOfLandCopies = noOfLandCopies;
				}

				public Object availableCopies(int i) {
					// TODO Auto-generated method stub
					return null;
				}
			}		
		

/*
				Book(String bookName, String author, int noOfCopies, int noOfLandCopies) {
				void display() {  /* methods declaration - Methods signature 
				method's body 
				 * System.out.println(bookName);
				System.out.println(author);
				System.out.println(noOfCopies);
				System.out.println(noOfLandCopies);
			}
			
		
	*/			
				


				public class MyClass {

					public static void main(String[] args) {
						
						
				
						Book bo1 = new Book(); 
						bo1.bookName = "Dog Man";
						bo1.author= "Dav Pilkey";
						bo1.noOfCopies = 10;
						bo1.noOfLandCopies = 5;
						
						ab = bo1.availableCopies(10);
						System.out.println("Available Copies: " + ab);

						/*
						 * Create emp2 from class Employee
						 */
						bo2.bookName = "Ant Man";
						bo2.author= "Edgar Wright";
						bo2.noOfCopies = 20;
						bo2.noOfLandCopies = 15;
						
						ab = bo2.availableCopies(7);
						System.out.println("Available Copies: " + ab);


						/*
						 * Create emp3 using a parameterized constructor.
						 */
						
						
						/*
						Employee emp3= new Employee(1040, "Mike,", 90000, "General Accountant");
						emp3.display();
						bonus = emp3.bonusEmployee(9);
						System.out.println("bonus: " + bonus);
						
						*/
		}
		}
	}


