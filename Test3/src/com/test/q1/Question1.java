package com.test.q1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Question1 {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("raj", 95);
		map.put("ekta", 75);
		map.put("rajiv", 85);
		map.put("sunita", 66);
		map.put("gunika", 99);
		System.out.println("------printing map------");
		
		//1. Print map using stream
//		 map.entrySet().forEach(entry->{
//			 System.out.println("Name: "+entry.getKey()+", Marks: "+entry.getValue());
//		 });
		 
		 //2.Print only that records that contain key contains raj
//		 map.entrySet()
//		 	.stream()
//		 	.filter(entry->(entry.getKey()).equals("raj"))
//		 	.forEach(name->System.out.println(name));
		 
		 //3. Print map sorted by key
//		 map.entrySet()
//		 	.stream()
//		 	.sorted(Map.Entry.comparingByKey())
//		 	.forEach(name->System.out.println(name));
		
		//4. Print map sorted by values
//		map.entrySet()
//			.stream()
//			.sorted(Map.Entry.comparingByValue())
//			.forEach(name->System.out.println(name));
		
		//5.Print map reverse sorted by the key
//		map.entrySet()
//			.stream()
//			.sorted((a,b)->a.getKey().compareTo(b.getKey()))
//			.forEach(name->System.out.println(name));
		
		
//*****************************************************************//
		Map<Student, Integer> map2=new HashMap<>();
		map2.put(new Student(10, "raj", 95), 95);
		map2.put(new Student(61, "keta", 78), 78);
		map2.put(new Student(11, "gunika", 98), 98);
		map2.put(new Student(19, "keshav", 97), 97);
		
		//1. Print all records sorted as per name of the student
//		map2.entrySet()
//			.stream()
//			.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName)))
//			.forEach(entry->System.out.println(entry.getKey()+": "+entry.getValue()));
		
		//2. Print all records as per id of the student
//		map2.entrySet()
//		.stream()
//		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getId)))
//		.forEach(entry->System.out.println(entry.getKey()+": "+entry.getValue()));
	
		
	}
}
