package com.comit.course._17_collections._01_lists;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class StringSetExamples {

	public static void main(String[] args) {

		Set<Person> set = new TreeSet<>();
		
		
		
		set.add(new Person ("John",30));  
		set.add(new Person ("John",30));
		set.add(new Person ("Jane",20));
		set.add(new Person ("Mike",36));
		set.add(new Person ("Pete",38));
		
		System.out.println(set.contains(new Person ("Mike",36)));
		//set.remove("Pete");
		set.forEach(System.out::println);
		System.out.println(set.size());
	}

}
