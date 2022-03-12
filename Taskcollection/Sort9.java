package Taskcollection;

import java.util.*;
import java.util.Map.Entry;
public class Sort9 {

	public static void main(String[] args) {
 HashMap<String, Integer> hm=new HashMap<String, Integer>();
 hm.put("One",1);
 hm.put("Two",2);
 hm.put("Three",3);
 hm.put("Four",4);
 
 Integer value=2;
 for(Entry<String,Integer>entry:hm.entrySet()) {
	 if(entry.getValue()==value) {
		 System.out.println(" The key for value " + value + " is " + entry.getKey());
		 break;
	 }
 }
	}
}
