package com.demo.test;

import java.util.Scanner;

import com.demo.sort.InsertionSortAlgorithm;
import com.demo.sort.MergeSortAlgorithm;

public class TestMergeAlgorithm {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr [] = new int[size];
		
		System.out.println("Enter the Array: ");
		MergeSortAlgorithm.acceptData(arr);
		
		System.out.println("Your Array is: ");
		MergeSortAlgorithm.displayArray(arr);
		
		MergeSortAlgorithm.mergeSort(arr, 0, arr.length-1);
		System.out.println("After Sorting using merge sort algorithm sorted array is: ");
		MergeSortAlgorithm.displayArray(arr);
		
		
		
		

	}

}
