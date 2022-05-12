
package com.chainsys.byteStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
public class BufferInputDemo {
    public static void main(String arg[]) {
    String s="99% is &approx equal to 100 but this is approx; not equal to 95";
    byte buf[]=s.getBytes(); //  encodes the string into a sequence of bytes and stores it in a byte array
                              
    for(byte x: buf)
    	System.out.println(x);
    ByteArrayInputStream in=new ByteArrayInputStream (buf);   //The ByteArrayInputStream class of the java.io package
                                                       //can be used to read an array of input data (in bytes).
    
    BufferedInputStream f= new BufferedInputStream (in); 
    int c;
    try
    {
    while ((c=f.read()) !=-1)
    {
    System.out.print ((char) c);
    }
    } catch (IOException ex)
    {
    ex.printStackTrace();
    }
    }}
