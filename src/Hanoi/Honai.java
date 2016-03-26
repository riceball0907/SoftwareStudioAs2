package Hanoi;

import java.util.Scanner;
import java.util.Stack;

public class Honai {
	
	public void move(int rings, Tower from, Tower to, Tower other){
		if(rings == 1){
			int ring = from.Pop();
			System.out.println("Move ring" + ring + " from " + from.toTowerString() + " to " + to.toTowerString());
			to.Push(ring);
		}else{
			move(rings-1, from, other, to);
			move(1, from, to, other);
			move(rings-1, other, to, from);
		}
	}
	
	public static void main(String[] args){
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please input a number:");
			int num = scanner.nextInt();
			Stack<Integer> initLeft = new Stack<Integer>();
			Stack<Integer> initMid = new Stack<Integer>();
			Stack<Integer> initRight = new Stack<Integer>();
			for(int i=num; i>=1; i--){
				initLeft.push(i);
			}
			
			Tower left = new Tower("left", initLeft);
			Tower middle = new Tower("middle", initMid);
			Tower right = new Tower("right", initRight);
			Honai honai = new Honai();
			honai.move(left.height(), left, right, middle);
		}
	}
}
