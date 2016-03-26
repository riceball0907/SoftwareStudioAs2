package Hanoi;

import java.util.Scanner;
import java.util.Stack;

public class HanoiMain {
		
	public static void main(String args[]){
		while(true){
			Scanner scanner = new Scanner(System.in);
			int level = scanner.nextInt();
			
			Stack<Integer> ringsLeft = new Stack<Integer>();
			for(int i = level; i >= 1; i--){
				ringsLeft.push(i);
			}
			Stack<Integer> ringsMiddle = new Stack<Integer>();
			Stack<Integer> ringsRight = new Stack<Integer>();
			
			Tower left = new Tower("Left", ringsLeft);
			Tower middle = new Tower("middle", ringsMiddle);
			Tower right = new Tower("right", ringsRight);
			
			HanoiMain honai = new HanoiMain();
			honai.move(left.height(), left, right, middle);
		}
	}
	
	public void move(int rings, Tower from, Tower to, Tower other){
		if (rings == 1){
			   Integer ring = from.pop();
			   System.out.println("Move ring " + ring + " from " + from.printString() +  " to " + to.printString());
			   to.push(ring);
		}else{
			   move(rings-1, from, other, to);
			   move(1, from, to, other);
			   move(rings-1, other, to, from);
		}
	}
}
