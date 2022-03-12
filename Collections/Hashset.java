package Collections;

import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		HashSet <String> hs=new HashSet<String>();
		hs.add("Amit");
		hs.add("Vijay");
		hs.add("Vikram");
	
		
		HashSet <String> set=new HashSet(hs);
	 	set.add("Surya");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
