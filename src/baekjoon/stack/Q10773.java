package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//Á¦·Î
public class Q10773 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Stack<Integer> stack = new Stack<>();
		int sum = 0;
		for(int i=0; i<n; i++) {
			int k = Integer.parseInt(reader.readLine());
			if(k==0) {
				sum -= stack.pop();
			} else {
				sum+= k;
				stack.push(k);
			}
		}
		System.out.println(sum);
	}
}
