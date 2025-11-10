package com.demo.hashing;

public class MyHashTable 
{
	Node [] heads;
	
	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public MyHashTable()
	{
		heads = new Node[10];
		for(int i=0; i<heads.length; i++)
		{
			heads[i] = null;
		}
	}
	
	public MyHashTable(int size)
	{
		heads = new Node[size];
		for(int i=0; i<heads.length; i++)
		{
			heads[i] = null;
		}
	}
	
	public void insertData(int val)
	{
		Node newNode = new Node(val);
		
		int pos = val % heads.length;
		
		if(heads[pos] != null)
		{
			newNode.next = heads[pos];
		}
		
		heads[pos] = newNode;
	}
	
	public void displayData()
	{
		for(int i=0; i<heads.length; i++)
		{
			Node temp = heads[i];
			System.out.print("i ---> ");
			while(temp != null)
			{
				System.out.print(temp.data+ "---> ");
				temp = temp.next;
			}
			System.out.println("null");
		}
	}
}
