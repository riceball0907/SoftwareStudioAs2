package shape;

public class Square extends Shape{
	   double length;
       		
		public Square(double length){
			this.length = length;
		}
		
		public double getarea(){			
			return length * length;
		}
		
		public String toString(){
			return "I am a Square and the area is " + getarea();
		}

}
