package com.demo.sort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortAlgorithm 
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
		for(int i=0; i<arr.length-1; i++)
		{
			int minpos = findNthMinPos(arr, i);
			
			int temp = arr[minpos];
			arr[minpos] = arr[i];
			arr[i] = temp;
			
			System.out.println("Iteration "+i);
			System.out.println(Arrays.toString(arr));
			System.out.println("------------------------------------");
		}
		
	}

	private static int findNthMinPos(int[] arr, int start) 
	{
		int minpos = start;
		
		for(int i=start; i<arr.length; i++)
		{
			if(arr[i] < arr[minpos])
			{
				minpos = i;
			}
		}
		
		return minpos;
	}
}
