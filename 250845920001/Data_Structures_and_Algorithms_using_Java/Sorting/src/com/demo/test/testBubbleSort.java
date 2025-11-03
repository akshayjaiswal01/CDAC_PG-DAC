package com.demo.test;

import java.util.Scanner;

import com.demo.sort.BubbleSortAlgorithm;

public class testBubbleSort 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr [] = new int[size];
		
		System.out.println("Enter the Array: ");
		BubbleSortAlgorithm.acceptData(arr);
		
		System.out.println("Your Array is: ");
		BubbleSortAlgorithm.displayArray(arr);
		
//		BubbleSortAlgorithm.bubbleSort(arr);
//		System.out.println("After Sorting using bubble sort algorithm sorted array is: ");
//		BubbleSortAlgorithm.displayArray(arr);
		
		BubbleSortAlgorithm.bubbleSortImproved(arr);
		System.out.println("After Sorting using bubble sort Improved algorithm sorted array is: ");
		BubbleSortAlgorithm.displayArray(arr);
		
//		BubbleSortAlgorithm.bubbleSortImprovedDescending(arr);
//		System.out.println("After Sorting using bubble sort Improved algorithm sorted array in descending order is: ");
//		BubbleSortAlgorithm.displayArray(arr);
		
	}
}
