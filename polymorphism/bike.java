package polymorphism;

public class bike{
	   void run(){System.out.println("running");}
}
	 class Splender extends bike{
	   void run(){System.out.println("running safely with 60km");}
	   
	   public void main(String args[])  {
	     Splender b = new Splender();
	     b.run();
	   }
	 }
	 
	
	 
	