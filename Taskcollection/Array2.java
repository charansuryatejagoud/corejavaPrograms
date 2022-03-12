package Taskcollection;

import java.util.*;
public class Array2 {

	public static void main(String[] args) {
   ArrayList friut =new ArrayList<>();
   friut.add("Mango");
   friut.add("Banana");
   friut.add("Pineapple");
   friut.add("Apple");
   System.out.println("ArrayList:"+ friut);
   String[] arr=new String[friut.size()];
   
   friut.toArray(arr);
   System.out.println("Array:");
   for(String item:arr) {
	   System.out.println(item+", ");
   }
	}
}

