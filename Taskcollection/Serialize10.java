package Taskcollection;

import java.util.*;
import java.io.*;
public class Serialize10 {

	public static void main(String[] args) {
 HashMap<Integer,String> hash=new HashMap<Integer,String>();
 hash.put(11,"value1");
 hash.put(12,"value2");
 hash.put(13,"value3");
 hash.put(14,"value4");
 hash.put(15,"value5");
 try
  {
	FileOutputStream fos=new FileOutputStream("hash.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	Object hmap = null;
	oos.writeObject(hmap);
	oos.close();
	fos.close();
	System.out.println("Serialized HashMap data is saved in hashmap.ser");
  }catch(IOException ioe)
 {
	  ioe.printStackTrace();
 }
	}
}
