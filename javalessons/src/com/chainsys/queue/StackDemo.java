package com.chainsys.queue;

import java.util.EmptyStackException;

import java.util.Iterator;
import java.util.Stack;
/* pop, peek, push methods are used in stack
 * Allow the duplicate value. */

public class StackDemo {
	public static void main(String[]args) {
		Stack<Integer>st=new Stack<Integer>();
		System.out.println("stack "+st.size());
		st.push(42);
		st.push(66);
		st.push(99);
		st.push(66);
		System.out.println("Stack: "+st.size());
		Iterator<Integer> int_itr=st.iterator();
		while(int_itr.hasNext()) {
			System.out.print(int_itr.next()+" ");
		}
		System.out.println();
	      Integer a=st.pop();
		System.out.println(a);
		System.out.println("After pop stack: "+st.size());
		a=st.pop();
		System.out.println(a);
		System.out.println("After pop stack: "+st.size());
		a=st.pop();
		System.out.println(a);
		System.out.println("After pop stack: "+st.size());
		try {
			a=st.pop();
			System.out.println(a);
		}catch(EmptyStackException e) {
			System.out.println("empty stack "+e.getMessage());
		}
		
		//Peek simply returns the value of what is on top of the stack.
		//In contrast to this, pop will remove the value from the stack and then return it
		
		System.out.println();
		st.push(42);
		st.push(66);
		st.push(99);
		System.out.println("Stack: "+st.size());
		
		System.out.println(st);
		Iterator<Integer> int_itr1=st.iterator();
		while(int_itr1.hasNext()) {
			System.out.print(int_itr1.next()+" ");
		}
		
	  
		a=st.peek();
		System.out.println("\n"+ a);
		System.out.println("After peek stack: "+st.size());
		a=st.peek();
		System.out.println(a);
		System.out.println("After peek stack: "+st.size());
	
			a=st.peek();
			System.out.println(a);
		
		
		
	}

}
