package Practice2;

class testoverloading{
	public static void main(String[] args) {
		
	System.out.println( multiplication.multiple1 (11,12));
	System.out.println( multiplication.multiple (11,12,13));
	}
}
	
public class multiplication {
	static int multiple1 (int a,int b){return a*b;}
	static int multiple (int a,int b, int c) {return a*b+c;}
	}
	


