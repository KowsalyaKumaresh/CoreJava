package com.chainsys.studypurpose;
import java.util.Arrays;

public class ShopApp {

	public static void main(String[] args) {
		double total=0;
		int count=0;
		double average = 0;

		// TODO Auto-generated method stub
		Customer c1=new Customer("pinkey",9);
	
		Clothing item1=new Clothing("Bule jacket",23.1,"M");
		Clothing item2=new Clothing("Orange T shirt",20.1,"S");
	    Clothing	items[]= {item1,item2,new Clothing("Yellow T shirt",35.6,"L"), new Clothing("red T shirt",35.6,"S")};
	
		
		System.out.println("Min price: "+Clothing.MIN_PRICE);
		
		
	/*	System.out.println("Item1 , "+item1.description+item1.cost+item1.size);
		System.out.println("Item2 , "+item2.description+item2.cost+item2.size);*/
		
		
			/*total=item1.cost+item2.cost*(1+tax);
		System.out.println(total);*/
		
		

			//	c1.setsize(8);
				c1.addItems(items);
		
		
	
		System.out.println("The total cost: "+c1.getTotalClothingCost());
		System.out.println("Customer name: "+c1.getname()+" "+"Customer size: "+" "+ c1.getsize()+"Total: "+c1.getTotalClothingCost());
	/*for(Clothing item:items) {
		
		//System.out.println(item.);
		}
		
		for(Clothing item:items) {
			if(item.size.equals("U")) {
			
			count++;
			average+=item.getprice();}
			
		}
		try { 
			average=(count==0)?0:7879/count;
		
		System.out.println("Count"+count+"Average: "+average);}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}*/
		
		
		Arrays.sort(c1.getItems());
		for(Clothing item:c1.getItems()) {
			System.out.println("output: "+item);
		}
	

		
		
		
	}

}
