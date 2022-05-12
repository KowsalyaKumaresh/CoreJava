package com.chainsys.studypurpose;

public class Clothing implements Comparable<Clothing>{

	double price;
	String size;
	int total;
    public  final static int  MIN_PRICE=    10;
	
    private final double TAX_RATE=0.2;
	public String description;
	
    
    
    public Clothing(String description, double price, String size) {
    	this.description=description;
    	this.price=price;
    	this.size=size;
    }
    
   public void setprice(double price) {
	   
	   this.price=(price>MIN_PRICE)? price:MIN_PRICE;
    	
    }
   public double getprice() {
	   return price+(price*TAX_RATE);
   }
   
 //  @Override
   //public String toString(){
	 //  return getDescription()+","+ getCost()+" ,"+getSize();
	   
   
  @Override
  public int compareTo(Clothing c) {
	  return this.description.compareTo(c.description);
  
   




   
  }
    
    

}
