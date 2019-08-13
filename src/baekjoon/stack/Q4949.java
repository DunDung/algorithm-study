package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//±ÕÇüÀâÈù ¼¼»ó
public class Q4949 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = reader.readLine();
			if(s.equals(".")) break;
			Stack<Character> stack = new Stack<>();
			s = s.trim();
			boolean isOk = true;
			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				if(c=='(' || c=='[') {
					stack.push(c);
				} else if(c==')') {
					if(stack.isEmpty() || stack.peek()!='(') {
						isOk = false;
						break;
					}else {
						stack.pop();
					}
				} else if(c==']') {
					if(stack.isEmpty() || stack.peek()!='[') {
						isOk = false;
						break;
					}else {
						stack.pop();
					}
				}
			}
			if(!stack.isEmpty() || !isOk) {
				sb.append("no\n");
			} else {
				sb.append("yes\n");
			}
		}
		System.out.print(sb.toString());
	}
}
