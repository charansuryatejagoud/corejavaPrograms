package Taskcollection;

import java.io.*;
import java.util.*;
public class Convert6 {

	public static void main(String[] args) {
 HashSet<String> hs=new HashSet<String>();
 hs.add("10");
 hs.add("12");
 hs.add("20");
 hs.add("30");
  System.out.println("Hash Set contains :"+ hs);
  String arr[] =new String [hs.size()];
  
  int i=0;
  for(String st:hs) {
	  arr[i++]=st;
  }
  for(String n:arr)
	  System.out.println(n);
  }
}
