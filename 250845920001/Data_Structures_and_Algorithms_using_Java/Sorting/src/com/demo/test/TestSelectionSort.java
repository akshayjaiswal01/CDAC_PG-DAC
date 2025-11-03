package com.demo.test;

import java.util.Scanner;

import com.demo.sort.InsertionSortAlgorithm;
import com.demo.sort.SelectionSortAlgorithm;

public class TestSelectionSort {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr [] = new int[size];
		
		System.out.println("Enter the Array: ");
		SelectionSortAlgorithm.acceptData(arr);
		
		System.out.println("Your Array is: ");
		SelectionSortAlgorithm.displayArray(arr);
		
		SelectionSortAlgorithm.insertionSort(arr);
		System.out.println("After Sorting using selection sort algorithm sorted array is: ");
		SelectionSortAlgorithm.displayArray(arr);

	}

}
