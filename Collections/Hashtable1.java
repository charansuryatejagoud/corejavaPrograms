package Collections;

import java.util.*;
public class Hashtable1 {

	public static void main(String[] args) {
 Hashtable <Integer,String>ht=new Hashtable <Integer,String> ();
  ht.put(10,"Vikram");
  ht.put(20,"Vijay");
  ht.put(30,"Surya");
   
  System.out.println("Before remove:"+ht);
  ht.remove(10);
  System.out.println("After remove:"+ht);
	}

}
