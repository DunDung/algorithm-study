package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

//Åð»ç
//X
public class Q14501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		A [] arr = new A[n+1];
		int [] dp = new int[n+1];

		for(int i=1; i<=n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a+i > n+1)
				b = 0;
			arr[i] = new A(a, b);
		}

		for(int i=1; i<=n; i++) {
			dp[i] = arr[i].p;
			int max = 0;
			for(int j=1; j<i; j++) { //j<5·Î Æ²·È¾úÀ½.
				if(i>=(arr[i-j].t+(i-j))) 
					if(max < dp[i-j])
						max = dp[i-j];
			}
			dp[i]+=max;
		}
		Arrays.sort(dp);
		System.out.println(dp[n]);
	}
}


class A {
	int t;
	int p;

	public A(int t, int p) {
		this.t = t;
		this.p = p;
	}
}
