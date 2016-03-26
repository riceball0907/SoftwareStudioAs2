package shape;

public class Circle extends Shape{

	double radius;
	double area;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getarea(){
		return radius*radius*3.14;	
	}
	
	public String toString(){
		return "I am a Circle and the area is " + getarea();
	}
	
}
