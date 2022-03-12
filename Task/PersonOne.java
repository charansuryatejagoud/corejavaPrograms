package Task;

import java.util.Scanner;

  
 class Phone {
	 static String n;
	 static Long no1,no2;
	 
	 Phone(String n){
		
		 Phone.n=n;
		 
		 }
	 void number(Long no1) {
		 Phone.no1=no1;

	 }
	 void number1( Long no2) {
		 Phone.no2=no2;
		 }
 }
 public class PersonOne {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter person name:  ");
		 Phone m1=new Phone (sc.next());
		 System.out.println("enter phone numbers: ");
		 m1.number(sc.nextLong());
		 System.out.println("enter more phone numbers: ");
		 m1.number1(sc.nextLong());
		 System.out.println("person name: "+Phone.n);
		 System.out.println("phone numbers: "+Phone.no1+" "+Phone.no2);
		 sc.close();
	}
}
 
