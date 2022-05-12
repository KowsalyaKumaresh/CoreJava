package com.chainsys.set;

import java.util.Iterator;

import java.util.TreeSet;
/* TreeSet does not allow null values
 * it throws NullPointerException*/

public class SetTreeSetDemo {
	public static void main(String[]args) {
		demoA();
	}

	public static void demoA() {
		TreeSet<String> ts= new TreeSet<String>();
		ts.add("Cut");
		ts.add("fun");
		ts.add("Assam");
		ts.add("Ball");
		ts.add("dog");
		ts.add("Aag");
		ts.add("AAg");
		ts.add("Event");
	//	ts.add(null);
		ts.add("Delhi");
		ts.add("carrot");
		ts.add("boll");
		ts.add("Apple");
		ts.add("boy");
		ts.add("egg");
		ts.add("fool");
		System.out.println("Size "+ts.size());
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(ts);
	}

}
