package com.comit.course._17_collections._02_sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class StringSetExamples {

	public static void main(String[] args) {

		
   // Set<String> set = new HashSet<>();  // Doesn't Keeps the insertion order.
    // Set<String> set = new LinkedHashSet<>();  //Keeps the insertion order.
    Set<String> set = new TreeSet<>();  //Keeps the insertion order.
    
    set.add("John");
    set.add("John");
    set.add("Jane");
    set.add("Mike");
    set.add("Pete");
    
       set.remove("Mike");
       System.out.println(set);
       System.out.println(set.size());
       System.out.println(set.contains("Mikes"));
    
	}

}
