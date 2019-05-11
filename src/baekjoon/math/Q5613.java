package baekjoon.math;

import java.util.Scanner;
import java.util.Stack;

//계산기 프로그램
public class Q5613 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int ans = 0;
		int a = 0;
		while(true) {
			String s = scan.next();
			if(s.equals("=")) {
				System.out.println(stack.pop());
				break;
			}
			if(s.equals("+")) {
				stack.push((stack.pop() + scan.nextInt()));
			}
			else if(s.equals("-")) {
				stack.push((stack.pop() - scan.nextInt()));
			}
			else if(s.equals("*")) {
				stack.push((stack.pop() * scan.nextInt()));
			}
			else if(s.equals("/")) {
				stack.push((stack.pop() / scan.nextInt()));
			}
			else {
				stack.push(Integer.parseInt(s));
			}	
		}
	}

}
