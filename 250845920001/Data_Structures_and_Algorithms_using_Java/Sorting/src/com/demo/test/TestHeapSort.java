package com.demo.test;

import java.util.Scanner;

import com.demo.sort.HeapSort;
import com.demo.sort.SelectionSortAlgorithm;

public class TestHeapSort {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr [] = new int[size];
		
		System.out.println("Enter the Array: ");
		HeapSort.acceptData(arr);
		
		System.out.println("Your Array is: ");
		HeapSort.displayArray(arr);
		
		HeapSort.maxHeapSort(arr);
		System.out.println("After Sorting using heap sort algorithm sorted array is: ");
		HeapSort.displayArray(arr);

	}

}
