
package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapInterface {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");
		m.put(5, null);

		System.out.println(m);

		System.out.println(m.size());
		m.replace(2, "bb");
		m.putIfAbsent(6, "f");
		System.out.println(m.isEmpty());
		System.out.println(m.get(5));
        System.out.println(m.containsKey(4));
		System.out.println(m.containsValue("d"));
		
		System.out.println("+++++++++++++++++++++++++++++++++");

		TreeMap t = new TreeMap();

		t.put(1, "one");
		t.put(2, "two");
		t.put(3, "three");
		t.put(4, "four");
		t.put(5, "five");

		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		System.out.println(t.firstEntry());
		System.out.println(t.lastEntry());
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		
		System.out.println(t.higherKey(2));
		System.out.println(t.lowerKey(5));
		

		System.out.println(t);
		System.out.println("==============================================");

		LinkedHashMap l = new LinkedHashMap();
		l.put(1, "abc");
		l.put(2, "raks");
		l.put(3, "indore");
		l.put(2, "rajkumar");
		l.put(5, "meena");

		l.replace(1, "new abc");
		l.remove(3);
		System.out.println(l.entrySet());
		System.out.println(l.keySet());
		System.out.println(l.values());
	}

}
