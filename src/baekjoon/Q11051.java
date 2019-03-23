package baekjoon;

import java.util.Scanner;

public class Q11051 {
	static int [] a = new int [1001]; 
	static int factorial(int n) {
		if(a[n]!=0)
			return a[n];
		if(n==1||n == 0) //n==1 만 해서 계속 틀렸었음 문제 조건에 k가 0이 될수도 있으니 n==0이 있어야 함!
			a[n] = 1;
		else
			a[n] = n*factorial(n-1);
		return a[n];
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), k=scan.nextInt();
		System.out.println(factorial(n)/factorial(n-k)*factorial(k));
		scan.close();
	}
}
