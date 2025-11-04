package com.list.singly;

import org.w3c.dom.Node;

public class SinglyLinkedList 
{
	Node head;
	
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
	
	public SinglyLinkedList()
	{
		head = null;
	}
	
	public void addNode(int value)
	{
		Node newNode = new Node(value);
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void displayData()
	{
		if(head == null)
		{
			System.out.println("Empty");
		}
		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+"--->");
				temp = temp.next;
			}
			System.out.println("null");
		}
	}
	
	
	public void addByPos(int pos, int value)
	{
		Node newNode = new Node(value);
		
		if(pos == 1)
		{
			head = newNode;
		}
		else
		{
			Node temp = head;
			
			for(int i=1; temp != null && i<=pos-2; i++)
			{
				temp = temp.next;
			}
			
			if(temp != null)
			{
				newNode.next = temp.next;
				temp.next = newNode;
			}
			else
			{
				System.out.println("position is beyond the length of list");
			}
			
		}
	}
	
	
	
}
