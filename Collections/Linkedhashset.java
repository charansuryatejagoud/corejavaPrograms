package Collections;

import java.util.*;
public class Linkedhashset {

	public static void main(String[] args) {
  HashSet<String> lhs=new HashSet<String>();
    lhs.add("one");
    lhs.add("two");
    lhs.add("three");
    lhs.add("four");
   Iterator <String> it=lhs.iterator();
   while(it.hasNext()) {
   System.out.println(it.next());
	}
 }
}
