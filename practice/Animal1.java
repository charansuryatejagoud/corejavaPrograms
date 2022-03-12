package practice;

public class Animal1 {
	Animal1() {System.out.println("animal1 is created");}
}
	class Dog extends Animal1{
	
		Dog() {System.out.println("dog is created");}
	}
    class Testsuper{
    public static void main(String []args) {
    	Dog d=new Dog();
    	
    }
	}
	
