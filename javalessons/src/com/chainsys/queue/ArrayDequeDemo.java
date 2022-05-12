package com.chainsys.queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> arraydeque=new ArrayDeque<String>();
         // Use an ArrayDeque like a stack.
		arraydeque.push("A");
		arraydeque.push("B");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("D");
		arraydeque.push("X");// duplicate value
		arraydeque.push("Z"); // duplicate value
		arraydeque.push("E");
		arraydeque.push("F");
		
	System.out.println("Before popping the deque: "+arraydeque.size());
	while(arraydeque.peek()!=null)
		System.out.print(arraydeque.pop()+" ");
	   System.out.println("\nAfter popping the deque: "+arraydeque.size());

	    Iterator<String>iterator=arraydeque.iterator();
	    while(iterator.hasNext()) {
	    	System.out.print(iterator.next());
	    }
	     System.out.println();
	    Iterator<String> striterator=arraydeque.descendingIterator();
        while(striterator.hasNext()) {
	    	System.out.print(striterator.next());
	    }
        System.out.println();
        arraydeque.addFirst("H");
        arraydeque.addLast("I");
        iterator=arraydeque.iterator();
        while(iterator.hasNext()) {
	    	System.out.print("\t"+iterator.next());
	    }
        
        //Rollfirst
        //Retrive and removes the first element of this deque,or
        //return null id this deque is empty
        System.out.println("************pollFirst: "+arraydeque.pollFirst());
        System.out.println(arraydeque);
        System.out.println("************pollLast: "+arraydeque.pollLast());
        System.out.println(arraydeque);
        
        // peekFirst
        //Retrieves but does not remove, the first element of this qeque, or
        //return null if thid deque is empty.
        System.out.println("************peekFirst: "+arraydeque.peekFirst());
        System.out.println(arraydeque);
        System.out.println("************peekLast: "+arraydeque.peekLast());
        System.out.println(arraydeque);
        
         // removeFirst
        //Retrieves and remove, the first element of this qeque
        //This method differs from pollfirst only in that is throws an exception
        // if thos deque is empty.
        System.out.println("************removeFirst: "+arraydeque.removeFirst());
        System.out.println(arraydeque);
        System.out.println("************removeLast: "+arraydeque.removeLast());
        System.out.println(arraydeque);
        
        
        System.out.println("************removeFirstOccurrence: X: "+arraydeque.removeFirstOccurrence("X"));
        System.out.println(arraydeque);
        System.out.println("************removeLastOccurence: Z: "+arraydeque.removeLastOccurrence("Z"));
        System.out.println(arraydeque);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	
	
	
	}

}
