package com.creativity.example.calculator;

import java.util.Collections;

/**
 *
 * @author H4ns3L
 */
public class Sum {

    public static int summation(int[] nums) {
		int sum = 0;
		if (nums.length == Collections.emptyList().size()) {
			throw new RuntimeException("LISTA VACIA");
		}
			for (int num : nums)
				sum += num;

		return sum;

	}
/*	public static void main(String[] args){
		//int sumas[]= {15,47,100,3};
		int sumas[]= {};
		System.out.println(summation(sumas));
	}*/
}
