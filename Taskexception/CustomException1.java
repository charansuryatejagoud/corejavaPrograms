package Taskexception;

import java.util.ArrayList;
import java.util.Scanner;
class InvalidEmployeeIDException extends Exception{
	 public InvalidEmployeeIDException(String str) {
		 super(str);
	 }
}
public class CustomException1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PojoTask1 pj=new PojoTask1("Vikram", 100,"Banjara");
		PojoTask1 pj1=new PojoTask1("Surya", 110,"Manikonda");
		PojoTask1 pj2=new PojoTask1("Vijay", 120,"Kondapur");
		ArrayList<PojoTask1> list=new ArrayList<PojoTask1>();
		list.add(pj);
		list.add(pj1);
		list.add(pj2);
		System.out.println("Enter your ids:");
		int id= sc.nextInt();
		try {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).id_no==id) {
					System.out.println("welcome to office");
					return;
				}
			}
			throw new InvalidEmployeeIDException("Invalid ID");
		}	
			catch(InvalidEmployeeIDException ieie) {
				System.out.println("Caugh the exception");
				System.out.println("Exception occured"+ieie);
			}
		System.out.println("Print remaining code");		
		}
}
