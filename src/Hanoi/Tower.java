package Hanoi;

import java.util.Stack;

public class Tower {
	String name;
	Stack<Integer> rings;
	
	Tower(String name, Stack<Integer> rings){
		this.name = name;
		this.rings = rings;
	}
	
	public String toTowerString(){
		return name;
	}
	
	public Integer Pop(){
		return rings.pop();
	}
	
	public void Push(Integer ring){
		rings.push(ring);
	}
	
	public int height(){
		return rings.size();
	}
}