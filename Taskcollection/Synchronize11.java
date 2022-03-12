package Taskcollection;

import java.util.*;
public class Synchronize11 {

	public static void main(String[] args) {
 HashMap<Integer,String> map=new HashMap<Integer,String>();
 map.put(1,"A");
 map.put(2,"B");
  
 map.get(1);
 Iterator<Integer> it=map.keySet().iterator();
 synchronized (map)
 {
	 while(it.hasNext()) {
		 System.out.println(map.get(it.next()));
          }
       } 
     }
  }
