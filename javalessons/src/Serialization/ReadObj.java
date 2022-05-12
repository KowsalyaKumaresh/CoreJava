package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.chainsys.arraylist.Emp;


	public class ReadObj
	{
	    public static void main(String arg[])throws Exception
	    {
	         FileInputStream fis = 
	                 new FileInputStream("d:\\temp\\emp1.dat") ;
	         ObjectInputStream ois = new ObjectInputStream(fis) ;
	          Emp ob =null;
	         try
	        {
	            ob = (Emp) ois.readObject();
	        }
	        catch(Exception e)
	        {
	            System.out.println("Exception during deserialization: " +e);
	        }
	        finally
	        {
	            try
	            {
	                ois.close();
	            }
	            catch(Exception e)
	            {
	                System.out.println("Exception during ois close: " + e);
	            }
	        }
	        if(null!=ob)
	        {
	        	System.out.println(ob.getId() +" "+ ob.getName());
	           
	            System.out.println("HashCode "+ob.hashCode());            
	        }
	    }
	}


