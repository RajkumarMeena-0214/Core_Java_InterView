package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class FailFast {
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		// ArrayBlockingQueue<Integer> l = new ArrayBlockingQueue <Integer>(4); // Exception Not raise
		l.add(1);
		l.add(2);
		l.add(3);

		Iterator<Integer> it = l.iterator();
	//	l.clear();
		
		//l.remove(3);
		l.add(4); // Here we cannot add or remove elements only for ArrayBlockingQueue
      
	
       while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}