package Collections;

import java.util.*;
public class Treeset {

	public static void main(String[] args) {
  TreeSet<String> ts=new TreeSet<String>();
  ts.add("Mango");
  ts.add("Watermelon");
  ts.add("Grapes");
  ts.add("Pineapple");
  
  System.out.println("Traversing element through Iterator in descending order");
  Iterator it=ts.descendingIterator();
  while(it.hasNext()) {
	  System.out.println(it.next());
  }

	}

}
