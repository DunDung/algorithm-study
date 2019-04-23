package baekjoon.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//반복수열
//dfs문제인데 dfs로 풀지않음..
public class Q2331 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int p = scan.nextInt();
		int index = 0;
		
		List<Integer> list = new ArrayList<>();
		list.add(a);
		
		while(true) {
			String s = String.valueOf(list.get(index++));
			int num = 0;
			for(int i=0; i<s.length(); i++) {
				int temp = 1;
				for(int j=0; j<p; j++) {
					temp *= Integer.parseInt(s.substring(i, i+1));
				}
				num+=temp;
			}
			if(list.contains(num)) {
				index = num;
				break;
			}
			list.add(num);
		}
		for(int i=0; i<list.size(); i++)
			if(list.get(i) == index) {
				System.out.println(i);
				break;
			}
				
	}
}
