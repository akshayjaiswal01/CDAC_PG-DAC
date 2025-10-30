package com.demo.search;

public class SearchingService 
{
	public static int sequestialSearch(int [] arr, int search)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == search)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int [] arr, int search)
	{
		int low = 0;
		int high = arr.length-1;
		int cnt = 0;
		
		while(low <= high)
		{
			int mid = (low + high)/2;
			cnt++;
			if(arr[mid] == search)
			{
				System.out.println("no of comparison: "+cnt);
				return mid;
			}
			
			else if(search > arr[mid])
			{
				low = mid+1;
			}
			
			else
			{
				high = mid-1;
			}
		}
		return -1;
	}
	
	public static int binarySearchRecurssive(int arr[], int search, int low, int high)
	{
		if(low <= high)
		{
			int mid = (low+high)/2;
			if(arr[mid] == search)
			{
				return mid;
			}
			else if(search > arr[mid])
			{
				return binarySearchRecurssive(arr, search, mid+1, high);
			}
			else
			{
				return binarySearchRecurssive(arr, search, low, mid-1);
			}
		}
		return -1;
	}
}
