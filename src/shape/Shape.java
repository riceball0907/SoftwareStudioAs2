package shape;

public abstract class Shape implements Comparable<Shape>{
	
	abstract double getarea();
	public abstract String toString();

	public int compareTo(Shape a){
		Shape b = (Shape)a;
		if(this.getarea() > b.getarea()){
			return 1;
		}
		else if(this.getarea() == b.getarea()){
		   return 0;
		}
		else
		   return 0;
	}
	
	
	
			
}
