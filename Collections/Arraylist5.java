package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist5 {

	public static void main(String[] args) {
 ArrayList<String> list=new ArrayList<String>();
 list.add("Mango");
 list.add("Grapes");
 list.add("Watermelon");
 
 Iterator<String> itr=list.iterator();
 while (itr.hasNext()) {
 System.out.println(itr.next());
 }
	}
	}


