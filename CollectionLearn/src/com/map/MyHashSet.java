package com.map;

import java.util.HashMap;

public class MyHashSet<T> {

	private static Object PRESENT = new Object();

	private HashMap<T, Object> hashMap = null;

	public MyHashSet() {
		this(10);
	}

	public MyHashSet(Integer capacity) {
		hashMap = new HashMap<>(capacity);
	}

	public boolean set(T object) {
		if (hashMap.get(object) != null) {
			return false;
		} else {
			hashMap.put(object, PRESENT);
			return true;
		}
	}

	public boolean remove(T object) {
		if (hashMap.get(object) != null) {
			hashMap.remove(object);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return hashMap.keySet().toString();
	}

}
