package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, null);
		map.put(2, null);
		map.put(2, null);
		map.put(3, "");

		System.out.println(map); // {1=null, 2=null, 3=}

		map.put(2, "Replaced");
		System.out.println(map); // {1=null, 2=Replaced, 3=}

		map = new HashMap<Integer, String>();

		map.put(1, "one");
		map.put(2, "one");
		map.put(3, "one");
		map.put(4, "one");

		System.out.println(map.putIfAbsent(5, "one")); // null

		System.out.println(map); // {1=one, 2=one, 3=one, 4=one, 5=one}

		String compute = map.compute(4, ((x, y) -> {
			System.out.println(x + " " + y); // 4 one
			return "one - new";
		}));

		System.out.println(compute); // one - new

		System.out.println(map); // {1=one, 2=one, 3=one, 4=one - new, 5=one}

		map.compute(6, ((x, y) -> {
			System.out.println(x + " " + y); // 4 one
			return "newly added";
		}));

		System.out.println(map); // {1=one, 2=one, 3=one, 4=one - new, 5=one, 6=newly added}

		map.compute(100, ((x, y) -> {
			System.out.println(x + " " + y); // 4 one
			return "newly added";
		}));

		System.out.println(map); // {1=one, 2=one, 3=one, 100=newly added, 4=one - new, 5=one, 6=newly added}

		map.computeIfPresent(4, ((x, y) -> {
			System.out.println(x + " " + y); // 4 one
			return "00 newly added";
		}));
		
		System.out.println(map); // {1=one, 2=one, 3=one, 100=newly added, 4=00 newly added, 5=one, 6=newly added}

		map.computeIfAbsent(888, (x) -> {
			System.out.println("--> " + x); // --> 888
			return "ff";
		});

		System.out.println(map);
		// {1=one, 2=one, 3=one, 100=newly added, 4=00 newly added, 5=one, 6=newly added, 888=ff}
		
		map.replace(1, "one", "new one");
		
		System.out.println(map); 
		// {1=new one, 2=one, 3=one, 100=newly added, 4=00 newly added, 5=one, 6=newly added, 888=ff}
		
	}

}
