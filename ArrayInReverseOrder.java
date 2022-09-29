package com.Bridgelabz.Day3;

public class ArrayInReverseOrder {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		System.out.print("Element of Array :");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\nReserve Element of Array :");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

}