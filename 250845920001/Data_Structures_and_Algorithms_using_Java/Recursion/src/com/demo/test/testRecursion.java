package com.demo.test;

import java.util.Scanner;

import com.demo.recursion.Recursion;

public class testRecursion 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		int factorial = Recursion.factorial(num);
		System.out.println("Factorial of "+num+" is: "+factorial);

	}

}
