package Multithreading;

public class Multi {

	static class multi extends Thread {
		public void run(){
			System.out.println("It is running");
		}
	
	public static void main(String[] args) {
  multi m1=new multi();
  Thread t1=new Thread(m1);
  t1.start();
	}
  }
}