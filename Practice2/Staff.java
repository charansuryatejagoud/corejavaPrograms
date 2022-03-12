package Practice2;

public class Staff {
	public void employee() {System.out.println("hard worker");}
	public static void main(String[] args) {
    Staff s1=new Staff();
    Staff s2=new Staff();
    s1=null;
    s2=null;
    System.gc();
	}

}
