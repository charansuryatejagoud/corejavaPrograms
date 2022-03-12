package practice;

public class cat {
	int id;
 	String name;
      
 	cat(int a,String n){
 		id=a;
 		name=n;
 	}
 		
 		void display() { System.out.println(id+" "+name);}
 
	public static void main(String[] args) {

		cat c1=new cat(11,"dude");
		cat c2=new cat(12,"buddy");		
	    c1.display();
		c2.display();
		
				}
}

