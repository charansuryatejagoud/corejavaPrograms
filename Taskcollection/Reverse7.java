package Taskcollection;

import java.util.*;
public class Reverse7 {
 public static void main(String []args) {
	 ArrayList<String> al=new ArrayList<String>();
	 al.add("Lion");
	 al.add("Tiger");
	 al.add("deer");
	 al.add("Elephant");
	 System.out.println("Before reverse ArrayList:");
	 System.out.println(al);
	 
	 Collections.reverse(al);
	 System.out.println("After reverse ArrayList:");
	 System.out.println(al);
 }
}
