package com.chainsys.usingfinal;

public class ShapePrivateConstructor {

	public int height;
	public int width;
	private ShapePrivateConstructor() {
		System.out.println("ShapeA ceatedA "+hashCode());
		
	}
	private ShapePrivateConstructor(int x) {
		height=x;width=x;
		System.out.println(x+" ShapeACreateB "+hashCode());
	}
	public void echo() {
		System.out.println("ShapeA Echo....");
		System.out.println(height+" "+width);
	}
	public static ShapePrivateConstructor getObject()  //factory method
	{
		return new ShapePrivateConstructor();   // call to private constructor
	}
	
}
