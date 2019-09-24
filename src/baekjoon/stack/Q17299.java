package baekjoon.stack;

import java.util.*;
import java.io.*;

//오등큰수
public class Q17299 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] count = new int[1000001];
		int[] a = new int[n];
		int[] ans = new int[n];

		for(int i=0; i<n; i++) {
			int v = Integer.parseInt(st.nextToken());
			count[v]++;
			a[i] = v;
		}

		Stack<Integer> stack = new Stack<>();
		for(int i=n-1; i>=0; i--) {
			if(!stack.isEmpty() && count[stack.peek()] <= count[a[i]]) {
				while(!stack.isEmpty()) {
					if(count[a[i]] < count[stack.peek()]) break;
					stack.pop();
				}
			}
			if(stack.isEmpty()) {
				ans[i] = -1;
			} else {
				ans[i] = stack.peek();
			}
			stack.push(a[i]);
		}
		for(int k : ans) {
			System.out.print(k+" ");
		}
	}

}
