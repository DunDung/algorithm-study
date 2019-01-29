package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q10828 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		int t = scan.nextInt();
		for(int i=0; i<t; i++) {
			String s = scan.next();
			switch(s) {
			case "push":
				stack.push(scan.next());
				break;
			case "pop":
				if(stack.empty())
					System.out.println(-1);
				else
					System.out.println(stack.pop());
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if(stack.empty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "top":
				if(stack.empty())
					System.out.println(-1);
				else
					System.out.println(stack.peek());
				break;
			}
		}
		
	}
}
