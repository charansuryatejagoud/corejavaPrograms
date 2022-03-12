package Garbage;

public class method {
 public void finalize(){System.out.println("object is one method");}
  public static void main(String args[]) {
  method m1=new method();
  method m2=new method();
  m1=null;
  m2=null;
  System.gc();
   }
}

