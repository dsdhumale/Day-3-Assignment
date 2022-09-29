package com.Bridgelabz.Day3;

public class OddPosition {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println("Print array in odd postion:");
		for (int i = 0; i < array.length; i = i + 2) {
			System.out.print(array[i] + " ");
		}

	}

}
