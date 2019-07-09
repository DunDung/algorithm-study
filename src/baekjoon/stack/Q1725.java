package baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

//히스토그램
//x
public class Q1725 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		
		Stack<Integer> s = new Stack<>();
		int ans = 0;
		for(int i=0; i<n; i++) {
			while(!s.isEmpty() && a[s.peek()] > a[i]) {
				int height = a[s.pop()];
				int width = i;
				if(!s.isEmpty()) {
					width = i-s.peek()-1;
				}
				ans = Math.max(width*height, ans);
			}
			s.push(i);
		}
		
		while(!s.isEmpty()) {
			int height = a[s.pop()];
			int width = n;
			if(!s.isEmpty()) {
				width = n-s.peek()-1;
			}
			ans = Math.max(width*height, ans);
		}
		System.out.println(ans);
	}

}
