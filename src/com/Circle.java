package com.rashmi.util;

import java.util.Scanner;

public class Circle {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		area();

	}

	private static void area() {
		System.out.print("Enter the radius : ");
		double radius = sc.nextDouble();
		double area = Math.PI * (radius * radius);
		System.out.println("The area of circle is : " + area);
	}
}