package practice3;

abstract class Food {
	abstract void rice();
}
    class Sambar extends Food{
    	void rice() {System.out.println("yummy");}
    }
    class curd extends Food{
    	void rice() {System.out.println("it is tasty");}
    }
    class testabstract{
    	public static void main(String[] args) {
      Food o=new Sambar();
      o.rice();
    
	}

}
