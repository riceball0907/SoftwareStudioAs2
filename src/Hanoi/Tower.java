package Hanoi;

import java.util.Stack;

public class Tower {
	
	String name;
	Stack<Integer> rings;
	
	  public Tower(String name, Stack<Integer> rings) {
		this.name = name;
		this.rings = rings;
	}

	public void initialize(String name, Stack rings){
	    this.name = name;
	    this.rings = rings;
	  }
	  
	  public String printString(){
		  return this.name;
	  }
	  
	  public Integer pop(){
		  return rings.pop();
	  }
	  
	  public void push(int ring){
		  rings.push(ring);
	  }
	  
	  public int height(){
		  return rings.size();
	  }
	  
}
