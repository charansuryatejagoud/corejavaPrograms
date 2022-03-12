package Taskcollection;

import java.util.*;
public class Countries3 {

	public static void main(String[] args) {
 Map<String,String> country=new HashMap<>();
 country.put("India", "Delhi");
 country.put("Japan", "Tokyo");
 country.put("Nepal", "Kathmandu");
 country.put("Bangladesh", "Dhaka");
 System.out.println("Using foreach");
 for(String i : country.keySet()) {
	 System.out.println(i+ " "+country.get(i));
 }
    System.out.println("Iterating Hashmap using entry set");
    for(Map.Entry m : country.entrySet()) {
    System.out.println(m.getKey()+" "+m.getValue());
  }
    System.out.println("hashmap using entryset in java iterator");
    Iterator itr = country.entrySet().iterator();
    while(itr.hasNext()) {
   System.out.println(itr.next());
   }
}
} 