package com.chainsys.overload;

public class Kite {
	void fly(int distance) {
		System.out.println("Fly1 "+distance);
	}
	void fly(double time,int speed) {
		System.out.println("Fly1 "+time);
	}
	void fall(String time) {
		System.out.println("Fall1 "+time);
	}
	int fall(int distance) {
		System.out.println("Fall2 "+distance);
		return distance;
	}
	void glide(int time) {
		System.out.println("Glide1 "+time);
	}
	void glide(double time) {
		System.out.println("glide 2 "+time);
	}

}
