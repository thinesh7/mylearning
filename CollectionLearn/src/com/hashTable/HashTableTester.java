package com.hashTable;

import java.util.Hashtable;

public class HashTableTester {
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	public static void main(String[] args) {

		
		// All Methods are Syncronized ..!
		Hashtable<Integer, String> kk = new Hashtable<>();
		// kk.put(1, null); Exp
		// kk.put(null, ""); Exp

		kk.put(1, "one");
		kk.put(1, "one-1");
		System.out.println(kk); // {1=one-1}
	}
}
