package practice3;

public class school {
  void teacher() {System.out.println("good teaching..");}
}
  class principal extends school{
	  void teacher() {System.out.println("telling classes..");}
  
  
 	public static void main(String[] args) {
       school s1=new school();
       s1.teacher();
       
	}

}
