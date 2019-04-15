package baekjoon.math;

import java.util.Scanner;

public class Q1978 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int count = 0;
		int n =scan.nextInt();
		for(int i=0; i<n; i++) {
			int x = scan.nextInt();
			boolean b = false;
			if(x==1)
				continue;
			for(int j=2; j<x; j++) {
				if(x%j==0) {
					b = true;
					break;
				}
			}
			if(!b)
				count++;
		}
		System.out.println(count);
	}
}
