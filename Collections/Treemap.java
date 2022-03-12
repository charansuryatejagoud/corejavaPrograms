package Collections;

import java.util.*;
public class Treemap {

	public static void main(String[] args) {
TreeMap <Integer,String> map=new TreeMap<Integer,String>();
    map.put(1,"Amit");
    map.put(2,"Surya");
    map.put(3,"Dude");
    map.put(4,"Kanna");
    for(Map.Entry m:map.entrySet()) {
    	System.out.println(m.getKey()+" "+m.getValue());
    }
	}

}
