package baekjoon.stack;

import java.util.*;

//단어 뒤집기2
public class Q17413 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		boolean isTag = false;

		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='<') {
				isTag = true;
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
			}
			if(isTag) {
				sb.append(s.charAt(i));
			}
			if(!isTag) {
				if(s.charAt(i) != ' ') {
					stack.push(s.charAt(i));
				} else {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(" ");
				}
			}
			if(s.charAt(i)=='>') {
				isTag = false;
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb.toString());

	}

}
