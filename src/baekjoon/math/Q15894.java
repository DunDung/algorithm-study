package baekjoon.math;

import java.util.Scanner;

//수학은 체육과목 입니다
public class Q15894 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long ans = (n*2)+(2*n);
		System.out.println(ans);
	}
}
