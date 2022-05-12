package com.chainsys.arraylist;

import java.util.Iterator;
import java.util.LinkedList;
// we can add element in anyoder like first and last arraylist doesn't support.

public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList<String> stringLinkedList= new LinkedList();
		stringLinkedList.add("F");
		stringLinkedList.add("B");
		stringLinkedList.add("D");
		stringLinkedList.add("E");
		stringLinkedList.add("C");
		stringLinkedList.add("B");
		stringLinkedList.add("D");
		stringLinkedList.add("E");
		stringLinkedList.add("C");
		stringLinkedList.addLast("Z"); // not in Arraylist
		stringLinkedList.addFirst("A");
		stringLinkedList.add(1,"A2");
		Iterator<String> stringIterator=stringLinkedList.descendingIterator();
	    while(stringIterator.hasNext()) {
	    	System.out.print(stringIterator.next()+" ");
	    }
	    System.out.println();
	    stringLinkedList.remove("F");
		stringLinkedList.remove(2);
		stringIterator=stringLinkedList.iterator();
		  while(stringIterator.hasNext()) {
		    	System.out.print(stringIterator.next()+" ");
		    }
		  System.out.println();
		  stringLinkedList.removeFirst();
			stringLinkedList.removeLast();
			stringIterator=stringLinkedList.iterator();
			  while(stringIterator.hasNext()) {
			    	System.out.print(stringIterator.next()+" ");
			    }
			  
		  
	}

}
