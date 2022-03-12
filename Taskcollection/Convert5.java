package Taskcollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Convert5 {

	public static void main(String[] args) {
    LinkedList<String> ll=new LinkedList<String>();
    ll.add("Surya");
    ll.add("Vikram");
    ll.add("Vijay");
    ll.add("Ajay");
    List<String>List=new ArrayList<String>(ll);
    
    for(String str:List) {
    	System.out.println(str);
    }
	}

}
