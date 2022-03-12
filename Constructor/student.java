package Constructor;

public class student {
	private static Object hai;
	int Id;
	String name;
	 
	void display() {System.out.println(Id+" "+name);
		}
	
	public static void main(String args [] ) {

student s1=new student ();
  student s2=new student ();
  s1.display();
  s2.display();
}

	
}

