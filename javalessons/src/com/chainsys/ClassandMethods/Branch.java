/*ABC bank offers services to its various customers. The bank has various branches all over the country
 *  and therefore each of the branches has a unique id. The bank stores the details of its customers,
 * such as customer name, account number, address, phone number, and e-mail address. In addition,
 * the bank stores the various details of its employees, such as employee name, employee id, address,
 * phone number, and e-mail id. The bank offers its customers a choice of accounts, such as savings,
 *  and current account. Identify the various classes and their attributes. Upload the code. *
 */
package com.chainsys.ClassandMethods;

  public class Branch{
    private final int id;
    private String location;
    private int managerid;
    private final String  bank_name="ABC Bank";
    
   public Branch(int branchId) {
	   this.id =branchId;
   }
   public int getBranchId() {
	   return id;
   }
   public void setLocation(String location) {
	   this.location=location;
   }
   public String getLocation() {
	   return location;
	   
   }
   public void setManagerId(int managerid) {
	   this.managerid=managerid;
   }
   public int getManagerId() {
	   return managerid;
   }
   
   public String gerBankName() {
	   return bank_name;
   }
  
  }
    