package Abstract;

abstract class Parts {
		
	String n;
	Parts(String n)
	{
		this.n=n;
	}
	abstract void function();
	 public void f()
	 {
		 System.out.println(n);
	 }
	 class Brakes extends Parts
	 {
		 Brakes(String n)
		 {
			 super(n);
			 
		 }
		  public void function()
		 {
			 System.out.println("car shd be halted");
			 
		 }
	 }
	
	class Gear extends Parts
	{
		int ge;
		Gear(String n,int ge)
		{
			super(n);
		this.ge=ge;
		}
		 public void function()
		{
		 System.out.println("car shd be changed"+ge);
	}
 }
  public  class car{
	  public  void main(String args[]){
	  
		  Parts b=new Brakes("Brakes");
		   b.function();
		   b.f();
		  
		   Parts g=new Gear("Gear",5);
		   g.function();
		   g.f();
		   
	  }
  }   
}
  

