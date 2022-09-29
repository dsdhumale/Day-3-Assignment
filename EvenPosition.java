package com.Bridgelabz.Day3;

public class EvenPosition {
	public static void main(String[] args) 
	{
		int array[] = { 12, 13, 14, 15, 16 };
		System.out.println("Print Even Postion of Array :");
		for (int i = 1; i < array.length; i = i + 2) 
		{
			System.out.print(array[i] + " ");
		}
		
	}

}
