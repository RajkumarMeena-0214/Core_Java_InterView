package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Integer> dequ = new ArrayDeque<Integer>();
		//Deque dequ1 = new LinkedList();
		
		dequ.offer(100);
		dequ.offer(200);
		dequ.offer(300);
		dequ.offer(400);
		dequ.offer(500);
		dequ.offer(600);
		
		System.out.println("dequ.offerFirst(1000) : "+dequ.offerFirst(1000));
		System.out.println(dequ);
		System.out.println("dequ.offerFirst(1000) : "+dequ.offerLast(1000));
		System.out.println(dequ);

		System.out.println("dequ.getFirst() : "+dequ.getFirst());
		System.out.println("dequ.peek() : "+dequ.peek());
		System.out.println(dequ);

		System.out.println("dequ.poll() : "+dequ.poll());//provide first and remove it 
		System.out.println(dequ);
		System.out.println("dequ.pop() : "+dequ.pop());//provide smallest and remove it 
		System.out.println(dequ);
		System.out.println("dequ.pollFirst() : "+dequ.pollLast());
		System.out.println(dequ);

		
	}

}