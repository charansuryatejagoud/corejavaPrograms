package practice;

public class tiger {
  String color="white";
}
 class babytiger extends tiger{
	 String color="black";
	 void printcolor() {
		 System.out.println(color);
		 System.out.println(super.color);
	 }
	 
	public static void main(String[] args) {
		babytiger b1=new babytiger();
		b1.printcolor();
		

	}

}
