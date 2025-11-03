package com.demo.sort;

import java.util.Scanner;

public class QuickSortAlgorithm 
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

	public static void quickSort(int[] arr, int start, int end) 
	{
		if(start<end)
		{
			int pivot = partition(arr, start, end);
			quickSort(arr, start, pivot-1);
			quickSort(arr, pivot+1, end);
		}
		
	}

	private static int partition(int[] arr, int start, int end) 
	{
		int pivot = start;
		int i = start;
		int j = end;
		
		while(i < j)
		{
			while(i<end && arr[i]<=arr[pivot])
			{
				i++;
			}
			
			while(j>start && arr[j] > arr[pivot])
			{
				j--;
			}
			
			if(i<j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		if(pivot != j)
		{
			int temp = arr[j];
			arr[j] = arr[pivot];
			arr[pivot] = temp;
		}
		return j;
		
	}

}
