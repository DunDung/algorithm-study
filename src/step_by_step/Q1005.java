package step_by_step;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Q1005 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int n = scan.nextInt();
		int k = scan.nextInt();
		Map<Integer, Integer> m1 = new HashMap<>();
		Map<Integer, Integer> m2 = new HashMap<>();
		Stack<Integer> s = new Stack<>();
		
		
		for(int i=1; i<=n; i++) {
			int time = scan.nextInt();
			m1.put(i, time);
		}
		
		boolean [] z = new boolean[n+1];
		int [][] a = new int[k][2];
		Map<Integer, List> m3 = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		int max = 0;
		
		for(int i=0; i<k; i++) {
			for(int j=0; j<2; j++)
				a[i][j] = scan.nextInt();
		}
		
		for(int i=0; i<k; i++) {

			a[i][0] 
		}
		
		

	
		int last = scan.nextInt();
		

		
		System.out.println(m2.values());
		System.out.println(s.toString());
	}
}
