package com.list.test;

import com.linked.list.SinglyCircularLinkedList;

public class TestSinglyCircularLinkedList {

	public static void main(String[] args) 
	{
		SinglyCircularLinkedList list1 = new SinglyCircularLinkedList();
		
		list1.addNode(10);
		list1.addNode(20);
		list1.addNode(30);
		list1.addNode(40);
		
		list1.displayData();
		
		
		list1.addNodeByPos(3, 25);
		list1.displayData();
		
		list1.addNodeByPos(6, 50);
		list1.displayData();
		
		list1.addNodeAfterNumber(40, 45);
		list1.displayData();
		
		list1.deleteByPos(7);
		list1.displayData();
		
		list1.deleteByValue(45);
		list1.displayData();

	}

}
