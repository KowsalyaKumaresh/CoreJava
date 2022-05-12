package com.chainsys.unittest;


import com.chainsys.interfaces.InterfaceA;
import com.chainsys.interfaces.InterfaceC;
import com.chainsys.interfaces.InterfaceCImpl;

public class TestInterfaceA {
	   public static void main(String[] args) 
	    {
	        InterfaceA.echo();
	        InterfaceA a1=new InterfaceCImpl();
	        a1.print();
	       a1. print("Hello");
	        
	       InterfaceC c1= new InterfaceCImpl();
	       c1.show();
	       
	    }
	

}
