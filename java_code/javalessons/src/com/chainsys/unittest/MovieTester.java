package com.chainsys.unittest;

import com.chainsys.ClassandMethods.Movie;

public class MovieTester {
	public static void testMovie() {
		Movie firstMovie=new Movie();
		
		firstMovie.setMovieName("Master");
		
		firstMovie.setHero("Vijay");
		firstMovie.setHeroine("Malavika");
		firstMovie.setYearOfRelease(2021);
		firstMovie.setDirector("Lokesh Kanagaraj");
		
		
		System.out.println("Movie Name: "+firstMovie.getMovieName());
		System.out.println("Movie Hero Name: "+firstMovie.getHero());
		System.out.println("Movie Heroin Name: "+ firstMovie.getHeroine());
		System.out.println("Movie Director Name: "+firstMovie.getDirector());
		System.out.println("Year of Release: "+ firstMovie.getYearOfRelease());
	}
	
	
	

}
