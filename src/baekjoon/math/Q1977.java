package baekjoon.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//완전 제곱수
public class Q1977 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		List<Integer> list = new ArrayList<>();

		for(int i=1; i*i<=10000; i++) {
			list.add(i*i);
		}

		boolean isFirst = false;
		int sum = 0;
		int first = 0;
		for(int i=n; i<=m; i++)
			if(list.contains(i)) {
				sum+=i;
				if(!isFirst) {
					first = i;
					isFirst = true;
				}
			}

		if(!isFirst)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(first);
		}
	}
}
