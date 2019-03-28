package baekjoon;

import java.util.Scanner;

//팩토리얼 0의 개수
public class Q1676 {
	static long factorial(int n) {
		if(n<=1)
			return 1;
		return n*factorial(n-1);
	}
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		System.out.println(factorial(n));
		String s = String.valueOf(factorial(n));
		for(int i=s.length()-1; i>=0; i--) {
			if(s.substring(i, i+1).equals("0"))
				count++;
			else
				break;
		}
		System.out.println(count);
		scan.close();
	}
}
