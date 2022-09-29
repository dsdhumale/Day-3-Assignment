package com.Bridgelabz.Day3;

public class LargestElement {
	public static void main(String[] args) 
	{
		int[] array = new int[] { 17, 2, 23, 5, 8 };
		int large = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > large) {
				large = array[i];
			}
		}
		System.out.println("Largest element of Array  : " + large);
		
	}

}
