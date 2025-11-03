package com.demo.test;

import java.util.Scanner;

import com.demo.sort.InsertionSortAlgorithm;
import com.demo.sort.QuickSortAlgorithm;

public class TestInsertionSort {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr [] = new int[size];
		
		System.out.println("Enter the Array: ");
		InsertionSortAlgorithm.acceptData(arr);
		
		System.out.println("Your Array is: ");
		InsertionSortAlgorithm.displayArray(arr);
		
		InsertionSortAlgorithm.insertionSort(arr);
		System.out.println("After Sorting using insertion sort algorithm sorted array is: ");
		InsertionSortAlgorithm.displayArray(arr);

	}

}
