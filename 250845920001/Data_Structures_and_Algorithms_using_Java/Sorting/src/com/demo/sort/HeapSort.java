package com.demo.sort;

import java.util.Arrays;
import java.util.Scanner;

	public class HeapSort 
	{
	public static void acceptData(int[] arr) 
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("Enter "+i+" element: ");
			arr[i] = sc.nextInt();
		}
		
	}

	public static void displayArray(int[] arr) 
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

	public static void maxHeapSort(int[] arr) 
	{
		for(int i= (arr.length/2)-1; i>=0; i--)
		{
			heapify(arr, arr.length, i);
		}
		
		int n = arr.length;
		
		for(int i=n-1; i>=0; i--)
		{
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			System.out.println(Arrays.toString(arr));
			System.out.println("-------------------------------");
			
			heapify(arr, i, 0);
		}
	}

	private static void heapify(int[] arr, int length, int i) 
	{
		int left = 2 * i + 1;
		int right =  2 * i + 2;
		int largest = i;
		
		if(left < length && arr[left] > arr[largest])
		{
			largest = left;
		}
		
		if(right < length && arr[right] > arr[largest])
		{
			largest = right;
		}
		
		if(largest != i)
		{
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, length, largest);
		}
		
		
		
	}
}
