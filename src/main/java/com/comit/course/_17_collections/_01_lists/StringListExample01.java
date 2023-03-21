package com.comit.course._17_collections._01_lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringListExample01 {

	public static void main(String[] args) {
		
		/*
		 * Declare and Allcoate memory for an Array
		 * Arraylist <String> list = new Arraylist<String>();
		 * 
		 */
		
		// List<String> list = List.of("
		
	//	List<String> list = new ArrayList<>(); //use then when you don't need to add or remove elements frequently
		List<String> list = new LinkedList<>();  //Use this when you are going to add remove elements frequently
		
		list.add("John");  //1
		list.add("Jane");  //2
		list.add("Jane");  //3
		list.add("Mike");  //4
		list.add("Pete");  //5
		list.add("Mike");  //5

		
		list.add(3, "Nick");   //Insert an Elements
		list.set(4, "Lily");  //Replace an Elements
		list.remove("Lily"); //Remove an elements
		list.remove(1); //Removes an elements by index
		//list.clear(); //Removes an elements in the list
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(1));
		// System.out.println(list.contains("Mike"));
		
		/* Loop over the array using the foreach loop
		for (String str: list) {
			System.out.println(str);
		}  
		* 
		*/
		
		/*loop over an array using the traditional for loop*/
		
		for (int i = 0; i<list.size(); i++) {
			 System.out.println(list.get(i));
					
			
		}
		
list.forEach(e ->System.out.println(e));
		
	}

}
