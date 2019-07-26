package baekjoon.math;

import java.util.Scanner;

//°ö¼À
public class Q2588 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int ans = a*b;
		
		StringBuilder sb = new StringBuilder();
		while(b>0) {
			sb.append(a*(b%10)+"\n");
			b/=10;
		}
		sb.append(ans);
		System.out.println(sb.toString());
		
	}

}
