package baekjoon.stack;

import java.util.*;
import java.io.*;

//후위 표기식2
public class Q1935 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String input = bf.readLine();
		int[] num = new int[26];
		for(int i=0; i<n; i++) {
			int v = Integer.parseInt(bf.readLine());
			num[i] = v;
		}

		Stack<Double> stack = new Stack<>();
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			if(c=='+' || c=='-' || c=='*' || c=='/') {
				double a = stack.pop();
				double b = stack.pop();
				if(input.charAt(i)=='+') {
					stack.push(b+a);
				} else if(input.charAt(i)=='-') {
					stack.push(b-a);
				} else if(input.charAt(i)=='*') {
					stack.push(b*a);
				} else if(input.charAt(i)=='/') {
					stack.push(b/a);
				} 
			}else {
				stack.push((double)num[input.charAt(i)-'A']);
			}
		}
		System.out.printf("%.2f", stack.pop());
	}
}