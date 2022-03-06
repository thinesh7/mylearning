package com.list.set.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {

		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		
		queue.add(1);
		queue.add(100);
		queue.add(2);
		queue.add(3);
		queue.add(209);
		queue.add(105);
		
		System.out.println(queue); // [1, 3, 2, 100, 209, 105]
		
		Integer peek = queue.peek();
		
		System.out.println(peek);
		System.out.println(queue);
		
		System.out.println(queue);

	}
}
