
package com.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {

		Queue queue = new PriorityQueue();
		// Queue queue = new LinkedList();

		queue.offer(100);
		queue.offer(200);
		queue.offer(50);
		queue.add(400);

		
		System.out.println("queue.element(55555) : " + queue.element());
     	System.out.println("queue.peek() : " + queue.peek());
		System.out.println(queue);
		System.out.println("queue.poll() : " + queue.poll());// provide smallest and remove it
		System.out.println(queue);
		System.out.println("queue.remove() : " + queue.remove());// provide first and remove it
		System.out.println(queue);
		System.out.println("queue.remove(200) : " + queue.remove(200));
		System.out.println(queue);
	
	}
}
