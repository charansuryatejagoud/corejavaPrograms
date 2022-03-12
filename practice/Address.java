package practice;

public class Address {
	String city,state,country;
	
	public Address(String city,String state, String country) {
	this.city=city;
	this.state=state;
	this.country=country;
}
		
	}
  
class Emp {
	 int id;
	 String name;
	 Address address;
	 
	 public Emp(int id, String name, Address address) {
	 
	  this.id=id;
	  this.name=name;
	  this.address=address;
	 }
	  
	 void display() {
	  System.out.println(id+" "+name);
	  System.out.println(address.city+" "+address.state+" "+address.country);
	 }
	 
	 public static void main(String[] args) {
	  Address address1=new Address("kuk","hyd","TG");
	  Address address2=new Address("mkd","hyd","TG");
	  
	  Emp e=new Emp(11,"cha",address1);
	  Emp e2=new Emp(12,"sur",address2);
	  
	  
	  e.display();
	  e2.display();
	  
 
 


	}

}
 
 
 
 

