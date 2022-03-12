package practice;

public class Location {
	String village,town,city;
	 
	public Location(String village,String town,String city) {
	this.village=village;
	this.town=town;
	this.city=city;	
}

  }
class Emp1{
	  int id;
	  String name;
	  String address;
  
  
	  public Emp1(int id,String name,String address2) {
		  this.id=id;
		  this.name=name;
		  this.address=address2;
	  }
	  
		  public Emp1(int id2, String name2, Location address2) {
		  }

		void display() {
		  System.out.println(id+" "+name);
		  System.out.println(address); 
	  }
		  
		  public static void main(String[] args) {
		    Location address=new Location("sr","am","hy");
		    Location address2=new Location("mn","jh","hy");
			  
		    Emp1 e= new Emp1(1,"cha",address);
		    Emp1 e2= new Emp1(2,"sur",address);
		 
		    e.display();
		    e2.display();
	  }
  }
	
	
	
	
	
	
