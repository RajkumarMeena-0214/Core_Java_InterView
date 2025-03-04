
package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ReverceArray2 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);

		l.add(3);
		l.add(4);

		// System.out.println("Original List: " + l);

		// Reverse the list manually
		for (int i = 0, j = l.size() - 1; i < j; i++, j--) {
			int temp = l.get(i);
			l.set(i, l.get(j));
			l.set(j, temp);
		}
		System.out.println(l);
	}
}
