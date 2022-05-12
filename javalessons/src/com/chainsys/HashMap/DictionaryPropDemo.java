package com.chainsys.HashMap;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class DictionaryPropDemo {

	public static void main(String[] args) {
		Properties capitals=new Properties();
		//Properties<Object> capitals=new Properties();
		 Set<Object> states;
		// Set<String> states;
		String str;
		capitals.put("illinois", "Springfield");
		capitals.put("illinois", "Springfield");
		capitals.put("illinois", "Springfield");
		capitals.put("kowsi   ", "Springfield");
		capitals.put("illinois", "Springfield");
        
		states=capitals.keySet();// get set-view of keys
		Iterator<Object>itr=states.iterator();
		while(itr.hasNext()) {
		str=(String) itr.next();
		System.out.println("The capital of: "+ str+" is "+capitals.getProperty(str)+".");
		  
		}
		// look for state not in list==specify default
		str=capitals.getProperty("TamilNadu","Not found");
		// str=capitals.getproperty("Fioride");
        System.out.println("Capital of tamilnadu is "+str);
	

}}
