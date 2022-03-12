package practice;

public class Society {
    void Fight(){System.out.println("Fighting..");}
}
class People extends Society{
	void Talk() {System.out.println("Talking..");}
}
class RichPeople extends People{
	void Culture() {System.out.println("Culture...");}

	public static void main(String[] args) {
       RichPeople p=new RichPeople();
       p.Culture();
       p.Fight();
       
       
	}

}
