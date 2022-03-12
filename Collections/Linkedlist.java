package Collections;
import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
LinkedList <String>ln=new LinkedList<String> ();
ln.add("Mango");
ln.add("Watermelon");
ln.add("Grapes");
ln.add("Banana");
Iterator it=ln.descendingIterator();
while (it.hasNext())
{
	System.out.println(it.next());
}
	}

}
