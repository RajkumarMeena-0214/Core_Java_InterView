
package com.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {
	
	public static void main(String[] args) {
		SortedMap<Integer,String> s=new TreeMap<>();
		
		s.put(1, "one");
		s.put(2, "two");
		s.put(3, "three");
		s.put(4, "four");
		s.put(5, "five");
		s.put(6, "Six");
		
		System.out.println(s.lastKey());
		System.out.println(s.firstKey());
		System.out.println(s.tailMap(2));
		System.out.println(s.headMap(5));
		System.out.println(s.entrySet());
		System.out.println(s.subMap(2, 6));
	}

}
