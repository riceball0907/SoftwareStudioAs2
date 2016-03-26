package shape;

public class Rectangle extends Shape{
	
    private double height;
    private double width;
   
	public Rectangle(double height, double width){
		this.height = height;
		this.width = width;
	}
	
	public double getarea(){ 
		return height*width;		
	}
	
	public String toString(){
		return "I am a Rectangle and the area is " + getarea();
	}
}
