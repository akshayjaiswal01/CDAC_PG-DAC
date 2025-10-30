package com.demo.test;

import com.demo.arrays.My2DArray;

public class Test2DArray {

	public static void main(String[] args) 
	{
		My2DArray ob = new My2DArray();
		
		System.out.println("Enter Array Details");
		ob.acceptData();
		
		System.out.println("Your Array is: ");
		ob.displayData();
		
		int temp [] = ob.findSumRowWise();
		System.out.println("Row wise Sum of matrix is : ");
		ob.display1DArray(temp);
		
		temp = ob.findSumColWise();
		System.out.println("Column  wise Sum of matrix is: ");
		ob.display1DArray(temp);
		
//		My2DArray ob1 = new My2DArray();
//		System.out.println("Enter 2nd Array Details");
//		ob1.acceptData();
//		
//		System.out.println("Your Matrix 1 is: ");
//		ob.displayData();
//		
//		System.out.println("Your Matrix 2 is: ");
//		ob1.displayData();
//		
//		int temp1 [][] = ob1.add2DArrays(ob);
//		System.out.println("Addition of matrix is: ");
//		ob.display2DArray(temp1);
//		
//		temp1 = ob1.substract2DArrays(ob);
//		System.out.println("Substraction of matrix is: ");
//		ob.display2DArray(temp1);
		
		ob.upwardRotation(1);
		System.out.println("Upward Rotation: ");
		ob.displayData();
		
		ob.downwardRotation(1);
		System.out.println("Downward Rotation: ");
		ob.displayData();
		
		int temp2 [][] = ob.transposeMatrix();
		System.out.println("Transpose of matrix is: ");
		ob.display2DArray(temp2);
		
		

	}

}
