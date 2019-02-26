package baekjoon;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Q2504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		String s = scan.next();
		for(int i=0; i<s.length(); i++) {
			if(s.substring(i,i+1).equals("(")||s.substring(i,i+1).equals("["))
				stack.add(s.substring(i,i+1));
			else if(s.substring(i, i+1).equals(")")) {
				if(stack.peek().equals("[")) {
					System.out.println(0);
					break;
				}
				if(stack.peek().equals("(")) {
					stack.pop();
					stack.push("2");
				}
				if(!stack.peek().equals("(")) {
					String n = stack.pop();
					if(stack.peek().equals("("))
						stack.push(Integer.parseInt(n)*2+"");
					if(stack.peek().equals("[")) {
						System.out.println(0);
						break;
					}
					else {
						stack.push(Integer.parseInt(stack.pop())+n+"");
					}
				}
				
			}
			else if(s.substring(i, i+1).equals("]")) {
				if(stack.peek().equals("[")) {
					stack.pop();
					stack.push("3");
				}
				if(!stack.peek().equals("[")) {
					String n = stack.pop();
					if(stack.peek().equals("["))
						stack.push(Integer.parseInt(n)*3+"");
					if(stack.peek().equals("(")) {
						System.out.println(0);
						break;
					}
					else {
						stack.push(Integer.parseInt(stack.pop())+n+"");
					}
				}
				
			}
			
		}
		System.out.println(stack);
	}
}