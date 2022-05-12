package com.chainsys.studypurpose;

public class Customer {
	String name;
   String  size;
   double total=0;
     public  Customer(String name, int measurement) {
    	 this.name=name;
    	 setsize(measurement);
     }
   
   Clothing items[];
   public void addItems(Clothing[] someItems) {
	   items=someItems;
   }
   public Clothing [] getItems() {
	   return items;
   }
   public double getTotalClothingCost() {
		
		for(Clothing item:items) {
			//if(size.equals(item.size)) {
			
			
		//	total+=item.getprice();
			System.out.println("item"+item.description+item.price+item.size);
			//if(total>15) break;
			
			}
		return total;
			
		}
	   
   
   
   
   public String getname() {
	   return name;
   }
   
   public void setsize(String size) {
	   this.size=size;
   }
 
   public String  getsize() {
	   return size;
   }
   
    
   public void setsize(int measurement) {
	   switch(measurement) {
	   case 1:
	   case 2:
	   case 3:
		 setsize("S");  
		 break;
	   case 4:
	   case 5:
	   case 6:
		 setsize("M");  
		 break;
	   case 7:
	   case 8:
	   case 9:
		 setsize("L");  
		 break;
		 
		 default:
		setsize("K");
	   
	   }
		
		
	   
   }

}
