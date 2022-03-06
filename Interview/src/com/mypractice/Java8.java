package com.mypractice;

import java.util.Arrays;

public class Java8 {

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(Arrays.asList(intArray).stream().filter(x -> x % 2 == 0).reduce(Integer::sum).orElse(0));

		Integer[] intArray2 = { 1, 1, 1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 10, 10 };

		System.out.println(
				Arrays.asList(intArray2).stream().distinct().filter(x -> x % 2 == 0).reduce(Integer::sum).orElse(0));

		System.out.println(Arrays.asList(intArray2).stream().filter(x -> x % 2 == 0).max((x, y) -> {
			if (x == y)
				return 0;
			else if (x > y)
				return 1;
			else
				return -1;
		}).orElse(0));

		System.out.println(Arrays.asList(intArray2).stream().filter(x -> x % 2 == 0).min((x, y) -> {
			if (x == y)
				return 0;
			else if (x > y)
				return 1;
			else
				return -1;
		}).orElse(0));
		
		System.out.println(Arrays.asList(intArray2).stream().distinct()
				.filter(x -> x % 2 == 0).mapToInt(i -> i).average().orElse(0));
		
		int[] arr = new int[10];
		 
        arr[0] = 20;
        arr[1] = 50;
        arr[2] = 99;
        arr[3] = 12;
        arr[4] = 94;
        arr[5] = 22;
        arr[6] = 43;
        arr[7] = 56;
        arr[8] = 55;
        arr[9] = 78;
        
        Arrays.asList(arr).forEach(x-> System.out.println(x));
        
	}

}
