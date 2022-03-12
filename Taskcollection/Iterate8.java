package Taskcollection;

import java.util.*;
public class Iterate8 {

	public static void main(String[] args) {
 TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
  tm.put(10,"Mango");
  tm.put(30,"Grapes");
  tm.put(15,"Watermelon");
  tm.put(20,"Pineapple");
   
  for(Map.Entry m:tm.entrySet()) {
	  System.out.println(m.getKey()+" "+m.getValue());
  }
	}
}
