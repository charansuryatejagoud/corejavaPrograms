package Task3;



 interface Test {
	  void square();
 }
		 class Arithmetic implements Test {
			public void square() {System.out.println("It is a square");}
		 }
			 public class ToTestInt {
			 public static void main(String []args) {
				 Arithmetic ar=new Arithmetic();
				 ar.square();
			 }
		 }
	 
