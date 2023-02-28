package com.comit.course._02_flow_control;

public class SwitchStatement {
	
	/* Switch Statement is to select one of many code blocks  to be executed.
	 /* Book Page 69 - 74
	 */

	public static void main(String[] args) {
		/* WAP a program that translates the day's number into the days's name according to the following table.
		 * 1 -> Mondnay
		 * 2 -> Tuesday
		 * 3 -> Wednesday
		 * 4 -> Thursday
		 * 5 -> Friday
		 * 6 -> Saturday
		 * 7 -> Sunday
		 */
int day = 0;

if (day == 1) {
	System.out.println("Monday");
	}
else if (day == 2) {
	System.out.println("Tuesday");
	} else if (day == 3); {
	System.out.println("Wednesday");
	
	} else if (day == 4); {
	System.out.println("Thursday");
	
	} else if (day == 5); {
	System.out.println("Friday");
	
	else if (day == 6); {
	System.out.println("Saturday");
	
	else if (day == 7); {
	System.out.println("Sunday");
	
	}

		
		/* Simplified Switch Statement from Java 12 */
	switch(day) {
	case 0, 1 -> {
				System.out.println("Hello");
				System.out.println("Monday");
	}
	case 2 -> System.out.println("Tuesday");
	case 3 -> System.out.println("Wednesday");
	case 4 -> System.out.println("Thursday");
	case 5 -> System.out.println("Friday");
	case 6 -> System.out.println("Saturday");
	case 7 -> System.out.println("Sunday");
	default -> System.out.println("Invalid Day");
}
	// Assigning values with the simplified switch statement
	// a default case is required.
	
	String name = switch(day) {
	case 0,1 -> "Tuesday";
	case 3 -> "Wednesday";
	case 4 ->  "Thursday";
	case 5  -> "Friday";
	case 6 -> "Saturday";
	case 7 -> "Sunday";
	default -> "Invalid Day";
	
	
	
	}
	}
	}
	}
	
	

	