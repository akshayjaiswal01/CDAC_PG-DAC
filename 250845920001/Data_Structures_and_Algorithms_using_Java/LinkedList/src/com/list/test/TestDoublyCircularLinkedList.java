package com.list.test;

import com.linked.list.DoublyCircularLinkedList;

public class TestDoublyCircularLinkedList {

	public static void main(String[] args) 
	{
		DoublyCircularLinkedList list = new DoublyCircularLinkedList();
		
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.displayData();
		
		list.addbyPos(3, 25);
		list.displayData();
		
		list.addAfterNum(30, 35);
		list.displayData();
		
		list.deleteByPos(3);
		list.displayData();
		
		list.deleteByValue(35);
		list.displayData();
		
		list.displayDataReverse();

	}

}
