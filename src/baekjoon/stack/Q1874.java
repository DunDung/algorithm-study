package baekjoon.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Q1874 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> s = new Stack<>();
		List<String> list = new ArrayList<>();
		int n = scan.nextInt();
		int [] a = new int[n];
		for(int i=0; i<n; i++)
			a[i] = scan.nextInt();
		int count = 0;
		int index = 1;
		int end = n*2;
		while(end-- != 0 ) {
			if(!s.empty())
				if(a[count]==s.peek()) {
					s.pop();
					count++;
					list.add("-");

					continue;
				}
			s.push(index++);
			list.add("+");
		}
		
		if(s.empty()) {
			for(String m : list)
				System.out.println(m);
		}
		else
			System.out.println("NO");

	}
}
