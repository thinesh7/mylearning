package com.cursor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class CursorTest {

	public static void main(String[] args) {

		// Bi Direction Cursor: -> 9 methods
		ListIterator<Integer> intItr = null;
		intItr.hasNext();
		intItr.hasPrevious();
		intItr.next();
		intItr.previous();
		intItr.previousIndex();
		intItr.nextIndex();
		intItr.add(null);
		intItr.remove();

		Iterator itr = null;
		itr.hasNext();
		itr.next();
		itr.remove();

		Enumeration<Integer> elements = null;
		elements.hasMoreElements();
		elements.nextElement();
	}
}
