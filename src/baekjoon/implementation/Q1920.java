package baekjoon.implementation;

import java.util.Arrays;
import java.util.Scanner;

//¼ö Ã£±â
public class Q1920 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		
		Arrays.sort(a);
		
		int m = scan.nextInt();
		for(int i=0; i<m; i++) {
			int k = scan.nextInt();
			if(Arrays.binarySearch(a, k)>=0)
				System.out.println(1);
			else
				System.out.println(0);
		}
	
	}

}
