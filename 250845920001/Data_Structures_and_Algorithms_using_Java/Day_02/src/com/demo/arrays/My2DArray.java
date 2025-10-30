package com.demo.arrays;

import java.util.Scanner;

public class My2DArray 
{
	private int [][] arr;
	
	public My2DArray()
	{
		arr = new int [3][3];
	}
	
	public My2DArray(int row, int col)
	{
		arr = new int[row][col];
	}
	
	
	//accept array elements
	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("Enter value "+i+","+j);
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	
	//display array
	public void displayData()
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void display1DArray(int [] arr1d)
	{
		for(int i=0; i<arr1d.length; i++)
		{
			System.out.print(arr1d[i]+" ");
		}
		System.out.println();
	}
	
	public void display2DArray(int [][] arr2d)
	{
		for(int i=0; i<arr2d.length; i++)
		{
			for(int j=0; j<arr2d[i].length; j++)
			{
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//find sum of matrix row wise
	public int [] findSumRowWise()
	{
		int temp [] = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			int sum = 0;
			for(int j=0; j<arr[i].length; j++)
			{
				sum = sum + arr[i][j];
			}
			temp[i] = sum;
		}
		return temp;
	}
	
	//find sum of matrix col wise
	public int [] findSumColWise()
	{
		int temp [] = new int [arr[0].length];
		for(int i=0; i<arr.length; i++)
		{
			int sum = 0;
			for(int j=0; j<arr[i].length; j++)
			{
				sum = sum + arr[j][i];
			}
			temp[i] = sum;
		}
		return temp;
	}

	
	//add 2 matrix
	public int[][] add2DArrays(My2DArray ob1) 
	{
		if(this.arr.length == ob1.arr.length && this.arr[0].length == ob1.arr[0].length)
		{
			int temp[][] = new int[ob1.arr.length][ob1.arr[0].length];
			for(int i=0; i<ob1.arr.length; i++)
			{
				for(int j=0; j<ob1.arr[i].length; j++)
				{
					temp[i][j] = this.arr[i][j] + ob1.arr[i][j];
				}
			}
			return temp;
		}
		return null;
	}

	
	//substract 2 matrix
	public int[][] substract2DArrays(My2DArray ob1) 
	{
		if(this.arr.length == ob1.arr.length && this.arr[0].length == ob1.arr[0].length)
		{
			int temp[][] = new int[ob1.arr.length][ob1.arr[0].length];
			for(int i=0; i<ob1.arr.length; i++)
			{
				for(int j=0; j<ob1.arr[i].length; j++)
				{
					temp[i][j] = this.arr[i][j] - ob1.arr[i][j];
				}
			}
			return temp;
		}
		return null;
	}
	
	
	// rotate row to upward to n number of times
	public void upwardRotation(int n)
	{
		for(int cnt=0; cnt<n; cnt++)
		{
			int temp [] = arr[0];
			for(int i=0; i<arr.length-1; i++)
			{
				arr[i] = arr[i+1];
			}
			arr[arr.length-1] = temp;
		}
	}
	
	// rotate row to downward to n number of times
	public void downwardRotation(int n)
	{

		for(int cnt=0; cnt<n; cnt++)
		{
			int temp [] = arr[arr.length-1];
			for(int i=arr.length-1; i>0; i--)
			{
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
		}
	}
	
	// column rigth rotation
	public void columnRithtRotation(int n)
	{
		for(int cnt = 0; cnt<n; cnt++)
		{
			int[] temp=new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				temp[i]=arr[i][arr[0].length-1];
			}
			
			for(int i=0;i<arr.length;i++) {
				for(int j=arr[0].length-2;j>=0;j--) {
					arr[i][j+1]=arr[i][j];
				}
			}
			
			for(int i=0;i<arr.length;i++) {
				arr[i][0]=temp[i];
			}
		}
	}
	
	
	//column left rotation
	public void columnLeftRotation(int n)
	{
		for(int cnt = 0; cnt<n; cnt++)
		{
			int[] temp=new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				temp[i]=arr[i][0];
			}
			
			for(int i=0;i<arr.length;i++) {
				for(int j=1;j<arr[0].length;j++) {
					arr[i][j-1]=arr[i][j];
				}
			}
			
			for(int i=0;i<arr.length;i++) {
				arr[i][arr[0].length-1]=temp[i];
			}
		}
	}
	
	//transpose of matrix
	public int [][] transposeMatrix()
	{
		int temp [][] = new int[arr[0].length][arr.length];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				temp[j][i] = arr[i][j];
			}
		}
		return temp;
	}
	
	
	
	
	
	
	
	
}
