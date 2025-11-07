package com.linked.list;

import com.linked.list.SinglyCircularLinkedList.Node;

public class DoublyCircularLinkedList 
{
	Node head;
	
	class Node
	{
		int data;
		Node prev;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	
	public DoublyCircularLinkedList()
	{
		head = null;
	}
	
	
	
	public void addNode(int value)
	{
		Node newNode = new Node(value);
		
		if(head == null)
		{
			head = newNode;
			head.prev = head;
			head.next = head;
		}
		else
		{
			Node temp = head.prev;
			newNode.next = head;
			newNode.prev = temp;
			temp.next = newNode;
			head.prev = newNode;
		}
	}
	
	
	public void addbyPos(int pos, int value)
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node newNode = new Node(value);
			
			if(pos == 1)
			{
				Node temp = head.prev;
				temp.next = newNode;
				newNode.next = head;
				newNode.prev = temp;
				head.prev = newNode;
				head = newNode;
			}
			else
			{
				Node temp = head;
				
				int i=1;
				
				for(; temp.next != head && i<=pos-2; i++)
				{
					temp = temp.next;
				}
				if(i > pos-2)
				{
					newNode.prev = temp;
					newNode.next = temp.next;
					temp.next = newNode;
					newNode.next.prev = newNode;
				}
				else
				{
					System.out.println("Position beyond limit");
				}
			}
			
		}
	}
	
	
	
	
	public void addAfterNum(int num, int value)
	{
	
			Node newNode = new Node(value);
			
			Node temp = head;
			
			while(temp.next != head && temp.data != num)
			{
				temp = temp.next;
			}
			
			if(temp.data == num)
			{
				newNode.prev = temp;
				newNode.next = temp.next;
				temp.next = newNode;
				newNode.next.prev = newNode;
			}
			else
			{
				System.out.println("Number not found");
			}
	}
	
	
	public void deleteByPos(int pos)
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node tail = head.prev;
			
			if(pos == 1)
			{
				if(head == tail)
				{
					head = null;
				}
				else
				{
					head.next.prev = tail;
					tail.next = head.next;
					
					Node temp = head;
					head = temp.next;
					temp.next = null;
				}
			}
			else
			{
				Node temp = head;
				
				int i=1;
				for(; temp.next != head && i<=pos-1; i++)
				{
					temp = temp.next;
				}
				
				if(pos > pos-1)
				{
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
					temp.prev = null;
					temp.next = null;
				}
				else
				{
					System.out.println("Position beyond limit");
				}
				
			}
		}
	}
	
	
	
	public void deleteByValue(int value)
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node tail = head.prev;
			
			if(head.data == value)
			{
				if(head == tail)
				{
					head = null;
				}
				else
				{
					head.next.prev = tail;
					tail.next = head.next;
					
					Node temp = head;
					head = head.next;
					temp.next = null;
				}
			}
			else
			{
				Node temp = head;
				
				while(temp.next != head && temp.data != value)
				{
					temp = temp.next;
				}
				
				if(temp.data == value)
				{
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
					temp.prev = null;
					temp.next = null;
				}
				else
				{
					System.out.println("Number not found");
				}
			}
		}
	}
	
	
	
	
	public void displayData()
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp = head;
			
			do
			{
				System.out.print(temp.data+"---->");
				temp = temp.next;
			}
			while(temp != head);
			System.out.println();
		}
	}
	
	public void displayDataReverse()
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp = head.prev;
			do
			{
				System.out.print(temp.data+"---->");
				temp = temp.prev;
			}
			while(temp != head.prev);
			System.out.println();
		}
	}
	
	
	
	
	
}
