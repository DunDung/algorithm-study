package baekjoon;

import java.util.Scanner;

//이항 계수1
//n! / k!*(n-k)! 
//이항 계수 검색후 풀이
public class Q11050 {
	static int [] a = new int [100]; 
	static int factorial(int n) {
		System.out.println(n);
		if(a[n]!=0)
			return a[n];
		if(n==1||n == 0) //n==1 만 해서 계속 틀렸었음
			a[n] = 1;
		else
			a[n] = n*factorial(n-1);
		return a[n];
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), k=scan.nextInt();
		System.out.println(factorial(n)/(factorial(n-k)*factorial(k)));
		scan.close();
	}
}
