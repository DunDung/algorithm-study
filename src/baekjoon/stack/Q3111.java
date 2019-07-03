package baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

//검열
//X
public class Q3111 {
	실패
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
			if(!isRemove) {
				if(!left.isEmpty() && left.peek()==key.charAt(0)) {
					leftKeyIdx++;
				}
				left.push(text.charAt(start++));
				if(left.peek() == key.charAt(leftKeyIdx)) {
					leftKeyIdx++;
				}else {
					leftKeyIdx = 0;
				}
				if(leftKeyIdx == key.length()) {
					leftKeyIdx = 0;
					isRemove = true;
					for(int j=0; j<key.length(); j++) {
						left.pop();
					}
				}
			}
			
			if(isRemove && start <= end) {
				right.push(text.charAt(end--));
				if(right.peek() != key.charAt(rightKeyIdx)) {
					rightKeyIdx = key.length()-1;
				} 
				if(right.peek() == key.charAt(rightKeyIdx)) {
					rightKeyIdx--;
				}else {
					rightKeyIdx = key.length()-1;
				} 
				if(rightKeyIdx == -1) {
					rightKeyIdx = key.length()-1;
					isRemove = false;
					for(int j=0; j<key.length(); j++) {
						right.pop();
					}
				}
			}
		}
		while(!left.isEmpty()) {
			right.push(left.pop());
		}
		
		Stack<Character> ans = new Stack<>();
		int ansKeyLen = 0;
		while(!right.isEmpty()) {
			ans.push(right.pop());
			if(ans.peek() == key.charAt(ansKeyLen)) {
				ansKeyLen++;
			} else {
				ansKeyLen = 0;
			}
			if(ansKeyLen == key.length()) {
				ansKeyLen = 0;
				for(int j=0; j<key.length(); j++) {
					ans.pop();
				}
			}
		}
		for(int i=0; i<ans.size(); i++) {
			System.out.print(ans.get(i));
		}
	}
}

