package shape;

abstract public class Shape implements Comparable<Object>{
	
	abstract double getarea();
	public abstract String toString();

	public  int compareTo(Object a){
		  Shape b=(Shape)a;
			if(this.getarea() > b.getarea()){
			   return 1;
			}
			else if(this.getarea() < b.getarea()){
			   return -1;
			}
			else
			   return 0;		
	}
			
}
