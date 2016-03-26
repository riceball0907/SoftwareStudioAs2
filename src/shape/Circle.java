package shape;

public class Circle extends Shape{

	private double r;
	
	public Circle(double r){
		this.r = r;
	}
	
	public double getarea(){
		return r*r*3.14;	
	}

	public String toString(){
		return "I am a Circle and the area is "+getarea();
	}

	
}
