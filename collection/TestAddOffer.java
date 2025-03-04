
package com.collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestAddOffer {
	public static void main(String[] args) {
		// Example no 1
		Queue<Integer> q = new ArrayBlockingQueue<>(2);
		// offer method return true if value is inserted otherwise it gives false
		q.offer(4);
		q.offer(5);
		q.offer(6);
		q.offer(7);
		System.out.println(q);

		Queue<Integer> q1 = new ArrayBlockingQueue<>(2);
		// add method give true if inserted or rise an exception
		q1.add(4);
		q1.add(5);
		q1.add(6);
		q1.add(7);
		System.out.println(q1);

//		// Example no 2
//		Queue<Integer> qq = new LinkedBlockingQueue<>(2);
//		qq.offer(10);
//		qq.offer(20);
//		qq.offer(30);
//		qq.offer(30);
//		System.out.println(qq);
//
//		Queue<Integer> qq1 = new LinkedBlockingQueue<>(2);
//		qq1.add(10);
//		qq1.add(20);
//		qq1.add(30);
//		qq1.add(40);
//		System.out.println(qq1);

	}
}
