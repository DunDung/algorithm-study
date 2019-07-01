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

		while(start <= end) {
			
			if(!isRemove) {
				left.push(text.charAt(start++));
				if(left.size() >= key.length() && left.peek() == key.charAt(key.length()-1)) {
					int keyLen = key.length()-1;
					boolean check = true;
					for(int j=left.size()-1; j>=left.size()-key.length(); j--) {
						if(left.get(j) != key.charAt(keyLen--)) {
							check = false;
							break;
						}
					}
					if(check) {
						isRemove = true;
						for(int j=0; j<key.length(); j++) {
							left.pop();
						}

					}
				}
			}
			if(isRemove && start <= end) {
				String keyRev = new StringBuilder(key).reverse().toString();
				right.push(text.charAt(end--));
				if(right.size() >= key.length() && right.peek() == keyRev.charAt(key.length()-1)) {
					int keyLen = key.length()-1;
					boolean check = true;
					for(int j=right.size()-1; j>=right.size()-key.length(); j--) {
						if(right.get(j) != keyRev.charAt(keyLen--)) {
							check = false;
							break;
						}
					}
					if(check) {
						for(int j=0; j<key.length(); j++) {
							right.pop();
						}
						isRemove = false;
					}

				}
			}
//			System.out.println(start +" "+end);
//			System.out.println(left.toString());
//			System.out.println(right.toString());
		}
		int leftSize = left.size();
		for(int i=0; i<leftSize; i++) {
			right.push(left.pop());
		}
		int rightSize = right.size();
		for(int i=0; i<rightSize; i++) {
			if(right.size() >= i+key.length() && right.get(i) == key.charAt(key.length()-1)) {
				boolean check = true;
				int keyLen = key.length()-1;
				for(int j=i; j<i+key.length(); j++) {
					if(right.get(j) != key.charAt(keyLen--)){
						check = false;
						break;
					}
				}
				if(check) {
					for(int j=0; j<key.length(); j++) {
						right.remove(i);
					}
					rightSize -= key.length();
				}
			}
		}
		while(!right.isEmpty()) {
			System.out.print(right.pop());
		}
	}
}

