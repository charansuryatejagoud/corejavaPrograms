package Trycatch;

public class Finallyblock {
	public static void main(String[] args) {
try {
	int data=100/5;
System.out.println(data);
}catch (ArithmeticException e)
{System.out.println(e);
}finally {System.out.println("Hello");
}
System.out.println("rest of the code");


}
	}


