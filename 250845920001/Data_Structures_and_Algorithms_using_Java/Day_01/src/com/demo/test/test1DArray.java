package com.demo.test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.demo.arrays.My1DArray;

public class test1DArray 
{
	public static void main(String[] args) 
	{
		My1DArray obj = new My1DArray();
		obj.add(1);
		obj.add(2);
		obj.add(6);
		obj.add(8);
		obj.add(5);
		
		System.out.println(obj);
		
//		obj.add(35, 3);
//		System.out.println(obj);
		
		// System.out.println(obj.searchByValue(20));
		
		// System.out.println(obj.deleteByPos(3));
		
//		obj.deleteByValue(35);
//		
//		System.out.println(obj);
//		
//		obj.rotateArray(false, 1);
//		
//		System.out.println(obj);
		
//		int [] arr1 = obj.reverseArray(false);
//		IntStream.of(arr1).forEach(e -> System.out.print(e+", "));
		
		int [] arr2 = obj.exchangeIndexValue();
		IntStream.of(arr2).forEach(e -> System.out.print(e+", "));
		
		
	}
}
