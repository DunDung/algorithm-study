package baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

//°Ë¿­
//X
public class Q3111 {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		String key = scan.next();
		String text = scan.next();
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();

		int start = 0;
		int end = text.length()-1;
		boolean isRemove = false;
		int leftKeyIdx = 0;
		int rightKeyIdx = key.length()-1;
		while(start <= end) {
			while(start <= end) {
				left.push(text.charAt(start++));
				if(left.peek() == key.charAt(leftKeyIdx)) {
					leftKeyIdx++;
				}else {
					leftKeyIdx = 0;
					if(left.peek() == key.charAt(0)) {
						leftKeyIdx = 1;
					} 
				}
				if(leftKeyIdx == key.length()) {
					leftKeyIdx = 0;
					isRemove = true;
					for(int j=0; j<key.length(); j++) {
						left.pop();
					}
					if(!left.isEmpty() && left.peek()==key.charAt(0)) {
						leftKeyIdx++;
					}
					break;
				}
			}


			while(start <= end) {

				right.push(text.charAt(end--));
				if(right.peek() == key.charAt(rightKeyIdx)) {
					rightKeyIdx--;
				}else {
					rightKeyIdx = key.length()-1;
					if(right.peek() == key.charAt(key.length()-1)) {
						rightKeyIdx--;
					}
				} 
				if(rightKeyIdx == -1) {
					rightKeyIdx = key.length()-1;
					isRemove = false;
					for(int j=0; j<key.length(); j++) {
						right.pop();
					}
					if(!right.isEmpty() && right.peek() == key.charAt(key.length()-1)) {
						rightKeyIdx--;
					}
					break;
				}
			}
		}
		while(!right.isEmpty()) {
			left.push(right.pop());
		}

		String ans = "";
		for(int i=0; i<left.size(); i++) {
			ans+=left.get(i);
		}
		while(true) {
			int idx = ans.indexOf(key);
			if(idx < 0) break;
			ans = new StringBuilder(ans).delete(idx, idx+key.length()).toString();
		}
		System.out.println(ans);
	}
}
