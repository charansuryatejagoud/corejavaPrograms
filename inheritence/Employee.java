package inheritence;

public class Employee {
	
	float salary=200000;
  }
class programmer extends Employee{
	int bonus=10000;
	public static void main(String[] args) {
	   programmer p=new programmer();
	   System.out.println("programmer salary is :+p.salary");
	   System.out.println("bonus og programmer is :+p.bonus");
	    
	}
}
