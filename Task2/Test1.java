package Task2;



class Shape{
	double pi=3.14, radius;
	float breath, height;
	int a, b, c;
}
class Circle extends Shape{
    void area(double pi, double radius) {
    	System.out.println("The area of the circle :"+pi*radius*radius);
    	}
    void perimeter(double pi, double radius ) {
    	System.out.println("The perimeter of the circle :"+2*pi*radius);
    	} 
    		
}
class Triangle extends Shape{
    void area(float breath, float height) {
    	System.out.println("The area of the triangle : "+(breath*height)/2);
    	}
    void perimeter(int a, int b, int c) {
    	System.out.println("The perimeter of the triangle :"+a+b+c);
    	}
}
class Square extends Shape{
	void area(int a) {
		System.out.println("The area of the square :"+a*a);
		}
	void perimeter(int a) {
		System.out.println("The perimeter of the square :"+4*a);
		}

}

public class Test1{

 public static void main(String[] args) {
	 Test1 s=new Test1();
	Circle c = new Circle();
	Triangle t = new Triangle();
	Square sq = new Square();
	c.area(3.14d,12.2d);
	c.perimeter(3.14d,10.36d);
	t.area(16.6f,15.6f);
	t.perimeter(4,7,3);
	sq.area(2);
	sq.perimeter(3);

}
}
