package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q2504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		String result = null;
		String s = scan.next();
		for(int i=0; i<s.length(); i++) {
			if(s.substring(i, i+1).equals(")")) {
				if(stack.peek().equals("(")) {
					result += "2+";
					stack.pop();
				}
				else if(s.substring(i, i+1).equals("]")) {
					if(stack.peek().equals("[")) {
						result += "3+";
			}
		}
	}

}
