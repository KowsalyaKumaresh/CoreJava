package com.chainsys.unittest;

import com.chainsys.usingfinal.ShapePrivateConstructor;

public class TestPrivateConstructor {
	
	public static void testPrivateConstructor() {
		ShapePrivateConstructor refShapeA=
				ShapePrivateConstructor.getObject();
		refShapeA.height=123;
		refShapeA.width=500;
		refShapeA.echo();
	}

}
