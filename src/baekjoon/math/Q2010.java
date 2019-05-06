package baekjoon.math;

import java.util.Scanner;

//ÇÃ·¯±×
public class Q2010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;

		for(int i=0; i<n; i++) {
			int k = scan.nextInt();
			if(i!=n-1 && k!=0)
				k--;
			sum += k;
		}
		if(sum==0)
			System.out.println(1);
		else
			System.out.println(sum);
	}

}
