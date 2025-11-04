package com.list.test;

import com.list.singly.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) 
	{
		SinglyLinkedList list1 = new SinglyLinkedList();
		list1.addNode(10);
		list1.addNode(20);
		list1.addNode(30);
		
		list1.displayData();
		
		list1.addNode(40);
		list1.displayData();
		
		list1.addByPos(5, 50);
		list1.displayData();

	}

}
