package com.comit.course._17_collections._01_lists;

import java.util.ArrayList;
import java.util.List;

public class CopyListExamples {

	public static void main(String[] args) {

		
		List<String> list1 = new ArrayList<>();
		list1.add("John");
		list1.add("Jane");
		list1.add("Pete");
		list1.add("Mike");
		list1.add("Jack");
		
		//System.out.println(List1.size());
			
		List<String> list2 = new ArrayList<>();
		
	for (String str: list1) {
		list2.add(str);
	}
			list1.clear();
			System.out.println(list1);
			System.out.println(list2);
			System.out.println(list2.size());
			
		
		
		
		
		}
	}


