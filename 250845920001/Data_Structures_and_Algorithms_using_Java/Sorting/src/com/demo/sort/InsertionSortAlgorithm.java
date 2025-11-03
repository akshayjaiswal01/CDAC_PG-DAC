package com.demo.sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortAlgorithm 
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
	
	public static void insertionSort(int[] arr)
	{
		for(int i=1; i<arr.length; i++)
		{
			int j = i-1;
			int key = arr[i];
			
			while(j >= 0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
			
			System.out.println("Iteration "+i);
			System.out.println(Arrays.toString(arr));
		}
	}
}
