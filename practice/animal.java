package practice;

public class animal {
	void eat(){System.out.println("eating...");}
   }
   class Lion extends animal {
	   void sleep(){System.out.println("sleeping..");}
	   }
   class BabyLion extends Lion {
	void roar(){System.out.println("roaring..");}
   }
  class inheritance{
	public static void main(String[] args) {
		BabyLion d1=new BabyLion();
		d1.eat();
		d1.roar();
		d1.sleep();
		
	}

}
