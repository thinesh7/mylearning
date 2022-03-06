package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTester {
	
	public static void main(String[] args) {
		
		/*
		 * FIFO
		 * Possible to change the algorithm
		 * Allow Duplicates
		 * Insertion Order -> NO
		 * Follow Sorting order
		 * not allow heterogeneous
		 * Allow comparable obj by default, Non comparable - Use Comparator
		 * Able to manage prerior to process
		 * 
		 * Not Synchronized
		 */
		
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(100);
		queue.add(50);
		queue.add(10);
		queue.add(1);
		queue.add(1);
		queue.add(1);
		// queue.add(null); -> java.lang.NullPointerException
		
		System.out.println(queue); // [1, 1, 1, 100, 10, 50]
		
		System.out.println(queue.peek()); // 1 -> Retrieves, but does not remove, 
		// the head of this queue,or returns null if this queue is empty.
		
		System.out.println(queue); // [1, 1, 1, 100, 10, 50]
		
		System.out.println(queue.offer(55)); // true
		
		System.out.println(queue);  // [1, 1, 1, 100, 10, 50, 55]
		
		System.out.println(queue.remove(55)); // true
		
		System.out.println(queue); // [1, 1, 1, 100, 10, 50]
		
		System.out.println(queue.poll()); // 1 ->  Retrieves and removes the head of this queue,or returns null if this queue is empty.
		
		System.out.println(queue); // [1, 10, 1, 100, 50]
		
		queue.add(500);
		queue.add(200);
		queue.add(300);
		
		System.out.println(queue); // [1, 10, 1, 100, 50, 500, 200, 300]
		
		System.out.print(queue.poll());
		System.out.print(queue.poll());
		System.out.print(queue.poll());
		System.out.print(queue.poll());
		System.out.println(queue.poll()); // 1 1 10 50 100
		
		System.out.println(queue);
		
		PriorityQueue<A> queue1 = new PriorityQueue<>();
		// queue1.add(new A()); -> java.lang.ClassCastException: class com.queue.A cannot be cast to class java.lang.Comparable
	}
}


class A{
	
}
