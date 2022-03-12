package Collections;

import java.util.*;
public class Linkedhash {

	public static void main(String[] args) {
  LinkedHashMap <Integer,String> lh=new LinkedHashMap <Integer,String>();
       lh.put(10,"Amit");
       lh.put(20,"Surya");
       lh.put(30,"Vijay");
       lh.put(40,"Vikaram");
    
    	   System.out.println("Keys:"+lh.keySet());
    	   System.out.println("Values:"+lh.values());
    	   System.out.println("Key-Values Pairs:"+lh.entrySet());
       }
	}


