package baekjoon.exhaustive_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q6603_ver2 {
	public static List<Integer> list = new ArrayList<>(); 
	public static void go(int [] a, int index, int cnt) {
		if(cnt==6) {
			for(int v : list)
				System.out.print(v+" ");
			System.out.println();
			return;
		}
		if(index >= a.length) return;
		
		list.add(a[index]);
		go(a, index+1, cnt+1); //사용하는 경우
		list.remove(list.size()-1);
		go(a, index+1, cnt); //사용하지 않는 경우
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int n = scan.nextInt();
			if(n == 0) break;
			int [] a = new int[n];
			boolean [] b = new boolean[n];
			for(int i=0; i<n; i++) {
				a[i] = scan.nextInt();
			}
			go(a, 0, 0);
			System.out.println();
			list.clear();
		}
	}

}
