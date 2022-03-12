package Taskcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class Example1 {

	public static void main(String[] args) {
  ArrayList <String> al=new ArrayList <String>();
  al.add("Vikram");
  al.add("Surya");
  al.add("Vijay"); 
  al.add("Ajay");
  System.out.println(al);
  
  HashMap<Integer,String> hm=new HashMap<Integer,String>();
  hm.put(1,"one");
  hm.put(2,"Two");
  hm.put(3,"Three");
  hm.put(4,"Four");
  System.out.println(hm);
 
  HashSet<String> hs=new HashSet<String>();
  hs.add("Lion");
  hs.add("Tiger");
  hs.add("Deer");
  hs.add("Elephant");
  System.out.println(hs);
	}

}
