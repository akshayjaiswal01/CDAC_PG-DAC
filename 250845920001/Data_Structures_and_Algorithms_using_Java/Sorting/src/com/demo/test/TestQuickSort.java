package com.demo.test;

import java.util.Scanner;

import com.demo.sort.BubbleSortAlgorithm;
import com.demo.sort.QuickSortAlgorithm;

public class TestQuickSort {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr [] = new int[size];
		
		System.out.println("Enter the Array: ");
		QuickSortAlgorithm.acceptData(arr);
		
		System.out.println("Your Array is: ");
		QuickSortAlgorithm.displayArray(arr);
		
		QuickSortAlgorithm.quickSort(arr, 0, arr.length-1);
		System.out.println("After Sorting using quick sort algorithm sorted array is: ");
		QuickSortAlgorithm.displayArray(arr);

	}

}
