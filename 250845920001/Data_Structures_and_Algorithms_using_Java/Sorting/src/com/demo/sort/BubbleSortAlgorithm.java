package com.demo.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortAlgorithm 
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

	
	//bubble sort normal method
	public static void bubbleSort(int[] arr) 
	{
		
		for(int i=0; i<arr.length; i++)
		{
			int swap = 0;
			for(int j=1; j<arr.length-i; j++)
			{
				if(arr[j-1] > arr[j])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swap++;
				}
			}
			
			System.out.println("Iteration "+i);
			System.out.println(Arrays.toString(arr));
			System.out.println("Swapped "+swap+" times");
			System.out.println("----------------------------------");
		}
		
	}

	
	//bubble sort improved version
	public static void bubbleSortImproved(int[] arr) 
	{
		for(int i=0; i<arr.length; i++)
		{
			boolean flag = false;
			int swap = 0;
			for(int j=1; j<arr.length-i; j++)
			{
				if(arr[j-1] > arr[j])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					flag = true;
					swap++;
				}
			}
			System.out.println("Iteration "+i);
			System.out.println(Arrays.toString(arr));
			System.out.println("Swapped "+swap+" times");
			System.out.println("----------------------------------");
			
			if(!flag)
			{
				break;
			}
		}
	}

	public static void bubbleSortImprovedDescending(int[] arr) 
	{
		for(int i=0; i<arr.length; i++)
		{
			boolean flag = false;
			int swap = 0;
			for(int j=1; j<arr.length-i; j++)
			{
				if(arr[j-1] < arr[j])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					flag = true;
					swap++;
				}
			}
			System.out.println("Iteration "+i);
			System.out.println(Arrays.toString(arr));
			System.out.println("Swapped "+swap+" times");
			System.out.println("----------------------------------");
			
			if(!flag)
			{
				break;
			}
		}
		
	}
	
	
	
}
