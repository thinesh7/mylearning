package com.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLinkedListTester {
	
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
		
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(100);
		queue.add(50);
		queue.add(10);
		queue.add(1);
		queue.add(1);
		queue.add(1);
		// queue.add(null); -> java.lang.NullPointerException
		
		System.out.println(queue); // [100, 50, 10, 1, 1, 1]
		
		System.out.println(queue.peek()); // 100 -> Retrieves, but does not remove, 
		// the head of this queue,or returns null if this queue is empty.
		
		System.out.println(queue); // [100, 50, 10, 1, 1, 1]
		
		System.out.println(queue.offer(55)); // true
		
		System.out.println(queue);  // [100, 50, 10, 1, 1, 1, 55]
		
		System.out.println(queue.remove(55)); // true
		
		System.out.println(queue); // [100, 50, 10, 1, 1, 1]
		
		System.out.println(queue.poll()); // 100 ->  Retrieves and removes the head of this queue,or returns null if this queue is empty.
		
		System.out.println(queue); // [50, 10, 1, 1, 1]
		
		queue.add(500);
		queue.add(200);
		queue.add(300);
		
		System.out.println(queue); // [50, 10, 1, 1, 1, 500, 200, 300]
		
		System.out.print(queue.poll());
		System.out.print(queue.poll());
		System.out.print(queue.poll());
		System.out.print(queue.poll());
		System.out.println(queue.poll()); // 50 10 1 1 1 
		
		System.out.println(queue); // [500, 200, 300]
	}
}
