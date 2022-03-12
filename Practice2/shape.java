package Practice2;

public class shape {
	void draw() {System.out.println("drawing..");}
}
class rectangle extends shape{
    void draw() {System.out.println("drawing rectangle");}
}
class triangle extends shape{
    void draw() {System.out.println("drawing triangle");}
}
class circle extends shape{
	void draw() {System.out.println("drawing circle");}
	}
class square extends shape{
	void  draw() {System.out.println("drawing square");}
}
class testpolymorphism{
 public static void main(String[] args) {
	shape s;
	s=new rectangle();
	s.draw();
	s=new triangle();
	s.draw();
	s=new circle();
	s.draw();
	s=new square();
	s.draw();
   }
}
	
	
	
	
	
	
	



	


