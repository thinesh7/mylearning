package com.linkedList;

import java.util.LinkedList;

public class LinkedListBehaviour {

	public static void main(String[] args) {
		

		/*  1.2v
		 * Underline data structure is -> Doubly Linked List [Node like Structure]
		 * Duplicates Allowed
		 * Null Allowed
		 * Insertion Order preserved
		 * Heterogeneous objects allowed
		 * All methods in AL are not synchronized,  not thread safe,
		 * high performance
		 * 
		 * The default size is 0 - zero. 
		 * LinkedList does not maintain capacity 
		 * like array based Lists do, it does not have default_capacity. The default size is 0 - zero.
		 * 
		 * Doesn't Implement -> RandomAccess(I) As by this frequent retrieval will give worst performance.
		 * For Retrival in LinkedList-> we have to contact all nodes from 1st node one by one..!
		 * 1st element -> 1 seconds
		 * 100th element -> 100 seconds
		 * 
		 * Frequent insertion and deletion will give good performance. -> Just create a node 
		 * and add it or remove a node and put in garbage collection
		 */
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
	//	linkedList.add(5, null); -> Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5, Size: 0
		
		linkedList.add(0, null);
		linkedList.add(null);
		linkedList.add(1);
		System.out.println(linkedList); // [null, null, 1]
		linkedList.add(linkedList.size()-1, 2);
		System.out.println(linkedList); // [null, null, 2, 1]
		
		linkedList.remove(2); // -> Remove Second node and put it to garbage collection
		linkedList.add(1, 55);
		
		System.out.println(linkedList); // [null, 55, null, 1]
		
		
		linkedList.addFirst(999);
		linkedList.addLast(888);
		System.out.println(linkedList); // [999, null, 55, null, 1, 888]
		linkedList.descendingIterator();
		System.out.println(linkedList.peek()); // 999
		System.out.println(linkedList.peekFirst()); // 999
		System.out.println(linkedList.peekLast()); // 888
		
		System.out.println("-> "+linkedList); // -> [999, null, 55, null, 1, 888]
		
		System.out.println(linkedList.poll()); // 999 ->  Return and remove the 1st element 
		
		System.out.println(linkedList); // [null, 55, null, 1, 888]
		
		System.out.println(linkedList.offer(866));; // add the element to the tail(last element)
		linkedList.offerFirst(999); // add the element to the front(first element)
		System.out.println(linkedList.offerLast(867));; // insert the element to the tail(last element)
		
		System.out.println(linkedList); // [999, null, 55, null, 1, 888, 866, 867]
		
		linkedList.removeFirst();
		linkedList.removeLast();
		linkedList.removeFirstOccurrence(null);
		linkedList.removeLastOccurrence(null);
		
		System.out.println(linkedList); // [55, 1, 888, 866]
		
		linkedList.push(75);
		System.out.println(linkedList); // [75, 55, 1, 888, 866] 
		
		// Pushes an element onto the stack represented by this list. In otherwords, 
		// inserts the element at the front of this list

		linkedList.pop();
		System.out.println(linkedList); // [55, 1, 888, 866]
		
		System.out.println(linkedList.pollFirst()); // 55
		System.out.println(linkedList.pollLast()); // 866
		
		System.out.println(linkedList); // [1, 888]
	}
}
