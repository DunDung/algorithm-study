package baekjoon.implementation;

import java.util.Arrays;
import java.util.Scanner;
//°ø¾à¼ö
public class Q5618 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];
		for(int i=0; i<n; i++)
			a[i] = scan.nextInt();
		Arrays.parallelSort(a);
		if(n==2) {
			for(int i=1; i<a[0]; i++)
				if(a[0]%i==0 && a[1]%i==0)
					System.out.println(i);
		}
		if(n==3) {
			for(int i=1; i<=a[0]; i++)
				if(a[0]%i==0 && a[1]%i==0 && a[2]%i==0)
					System.out.println(i);
		}
	}

}
