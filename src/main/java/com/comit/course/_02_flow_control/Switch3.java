package com.comit.course._02_flow_control;

public class Switch3 {

	public static void main(String[] args) {
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