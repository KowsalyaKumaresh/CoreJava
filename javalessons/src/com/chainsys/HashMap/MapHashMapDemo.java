package com.chainsys.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapHashMapDemo {
	public static void main(String[]args) {
		usingGenericMapDemoA();
	}
	public static void usingGenericMapDemoA() {
		HashMap<String, String> secondMap = new HashMap<String, String>();
		System.out.println("Size" + secondMap.size());
		secondMap.put("k1", "ABcd");
		secondMap.put("k2", "ABcd");
		secondMap.put("k3", "ABcd");
		secondMap.put("k4", "ABcd");
		System.out.println("Size" + secondMap.size());
		Set<Map.Entry<String, String>> setofMapEntry = secondMap.entrySet(); //A Map is not a collection, so iteration is not supported by the MAP.
		
		/*That returns all the key and values as a Set of Map.Entry Object
		Each Map.Entry Object has a key and a corresponding value to it
		So here Map.Entry has a key of type String , and the value is also of type String*/


		Iterator<Map.Entry<String, String>> mapIterator = setofMapEntry.iterator();
		while (mapIterator.hasNext())
			
		{
			Map.Entry<String, String> mapEntry = (Map.Entry<String, String>) mapIterator.next();
			System.out.println(mapEntry.getKey());
			System.out.println(mapEntry.getValue());

		}
	}
}
