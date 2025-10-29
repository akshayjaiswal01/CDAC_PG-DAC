package com.demo.arrays;

import java.util.Arrays;

public class My1DArray 
{
	private int [] arr;
	private int count;
	
	public My1DArray()
	{
		arr = new int[10];
		count = 0;
	}
	
	public My1DArray(int [] arr, int count)
	{
		this.arr = arr;
		this.count = count;
	}
	
	public My1DArray(int size)
	{
		arr = new int[size];
		count = 0;
	}
	
	public int getCapacity()
	{
		return arr.length;
	}
	
	public int getSize()
	{
		return count;
	}
	
	
	
	// add element at the end of the array 
	public boolean add(int value)
	{
		if(count < arr.length)
		{
			arr[count] = value;
			count++;
			return true;
		}
		return false;
	}
	
	
	// add element at the given position in the array
	public boolean add(int value, int pos)
	{
		if(count < arr.length && pos < count)
		{
			for(int i = count; i>pos; i--)
			{
				arr[i] = arr[i-1];
			}
			arr[pos] = value;
			count ++;
			return true;
		}
		return false;
	}
	
	
	//search the value and return the position
	public int searchByValue(int value)
	{
		for(int i=0; i<count; i++)
		{
			if(arr[i] == value)
			{
				return i;
			}
		}
		return -1;
	}
	
	//delete the value at the given position
	public boolean deleteByPos(int pos)
	{
		if(pos < count)
		{
			for(int i=pos; i<count-1; i++)
			{
				arr[i] = arr[i+1];
			}
			arr[count-1] = 0;
			count--;
			return true;
		}
		return false;
	}
	
	// delete the first occurrence of the given value
	public boolean deleteByValue(int value)
	{
		int index = searchByValue(value);
		
		if(index != -1)
		{
			deleteByPos(index);
			return true;
		}
		return false;
	}
	
	
	//rotate array num times
	// if flag = true then rotate right
	// if flag = false then rotate left
	public void rotateArray(boolean flag, int num)
	{
		if(flag)
		{
			for(int cnt=0; cnt<num; cnt++)
			{
				int temp = arr[count-1];
				for(int i=count-1; i>0; i--)
				{
					arr[i] = arr[i-1];
				}
				arr[0] = temp;
			}
		}
		else
		{
			for(int cnt = 0; cnt<num; cnt++)
			{
				int temp = arr[0];
				for(int i=0; i<count-1; i++)
				{
					arr[i] = arr[i+1];
				}
				arr[count-1] = temp;
			}
		}
	}
	
	//reverse the array
	// if flag = true then reverse the original array
	// if flag = false then reverse on new array
	public int [] reverseArray(boolean flag)
	{
		if(flag)
		{
			int start = 0;
			int end = count-1;
			
			while(start<end)
			{
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				
				start++;
				end--;
			}
			return arr;
		}
		
		else
		{
			int revarr [] = new int[count];
			
			int end = count-1;
			for(int i=0; i<revarr.length; i++)
			{
				revarr[i] = arr[end];
				end--;
			}
			return revarr;
			
		}
		
	}
	
	
	public int findMax(int [] arr)
	{
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<count; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	
	// replace index with values in the array
	public int [] exchangeIndexValue()
	{
		int max = findMax(arr);
		int temparr [] = new int [max+1];
		
		for(int i=0; i<temparr.length; i++)
		{
			temparr[i] = -1;
		}
		
		for(int i=0; i<count; i++)
		{
			int ind = arr[i];
			temparr[ind] = i;
		}
		return temparr;
		
	}
	
	//find sum
	public int findSum()
	{
		int sum = 0;
		for(int i=0; i<count; i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString()
	{
		return " Array:  "+ Arrays.toString(arr)+" ";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
