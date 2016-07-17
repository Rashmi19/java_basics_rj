package com.rashmi.util;

public class SumOfArray {
	public static void main(String[] args) {
		sum1();
	}

	public static void sum1() {
		int[] numbers = { 1, 2, 3, 4 };
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}

		System.out.println(sum);

		}
}
