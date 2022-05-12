package com.chainsys.variables;
/**@author kows3140
 * created on: 25 march 2022
 * @author kows3140
 *
 */

public class Calculator {

	/** Add methods will take 2 values using the following parameters
	 * and will add the values. The result of totaling will be returned back to the caller
	 * This a static method, onject regerence is not required.
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type in
	 */
	
	public static int add(int param1, int param2) {
		int result=param1+param2;
		return result;
	}
      
	
	/** multiply methods will take 2 values using the following parameters
	 * and will product the values. The result of totaling will be returned back to the caller
	 * This a static method, onject regerence is not required.
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type in
	 */
	
	  public static int multiply(int param1, int param2) {
		int result=param1*param2;
		return result;
	}
	
	  public static int  divide(int param1, int param2) {
		  if(param2==0) {
			  System.out.println("enter non zero value");
		  }
			int result=param1/param2;
			return result;
		}
	  public static int subtract(int param1, int param2) {
		  int result=param1-param2;
		  return result;
	  }
		
}
