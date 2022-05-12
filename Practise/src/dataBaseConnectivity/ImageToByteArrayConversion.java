package dataBaseConnectivity;

import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class ImageToByteArrayConversion {
	
      public static void main(String args[]) throws Exception{
    
	  BufferedImage bImage = ImageIO.read(new File("d://kowsi.jpg"));
      ByteArrayOutputStream bos = new ByteArrayOutputStream();   // store a data in the form of  bytearray form using 
                                                                // ByteArrayOutputStream 
      ImageIO.write(bImage, "jpg", bos );
      byte [] data = bos.toByteArray();                        // toByteArray method is used to call th bytearray.
      
      for(byte i:data)
    	  System.out.println(i);
   }
}
