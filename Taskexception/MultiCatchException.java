package Taskexception;

public class MultiCatchException {
 public static void main(String args[]) {
	 
	 try
	 {
		 int[] a1 = new int[5];
		 a1[5] = 40/0;
	 }
		catch(ArithmeticException ae) {
			System.out.println("this is ae");
		}
			catch(ArrayIndexOutOfBoundsException aie)
			{
			System.out.println("Invalid elements");
			}
			
			catch(Exception e) {
				System.out.println("print remaining program");
			}
			System.out.println("normal flow");
 }
}
