package com.comit.course._17_collections._03_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.comit.course._17_collections._01_lists.Person;

public class PersonMapExample {

	public static void main(String[] args) {

		
		List<Person>list = new ArrayList<>();
		
		list.add(new Person ("John",30));  
		list.add(new Person ("John",30));
		list.add(new Person ("Jane",20));
		list.add(new Person ("Mike",36));
		list.add(new Person ("Pete",80));
		list.add(new Person ("Lily",35));
	
		for(Person p:list) {
			if (p.getAge()==5) {
				
				System.out.println(p);
				break;
			}
		}
		Map<Integer,Person> map=new HashMap<>();
		map.put(2, new Person(2,"John",30));
		map.put(4, new Person(4,"Omer",30));
		map.put(7, new Person(7,"Jane",20));
		map.put(3, new Person(3,"Mike",36));
		map.put(5, new Person(5,"Pete",80));
		map.put(10, new Person(10,"Lily",30));
		
		System.out.println(map.get(5));
		/*
		map.put(10, new Person (10, "Hello", 30));
		map.forEach((k,v)->System.out.println(k + " , " + v ));
		*/
		for(Integer key: map.keySet()) {
			System.out.println((key + " , " + map.get(key)));
			
		}
	}

}
