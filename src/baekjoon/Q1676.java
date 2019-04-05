package baekjoon;

import java.util.Scanner;

//팩토리얼 0의 개수
//X
//2를 인자로 가진 개수와 5를 인자로 가진 개수중 작은것이 0의 자리수를 나타낸다.

public class Q1676 {
	static int two = 0;
	static int five = 0;
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	    for (int i = 2; i <= n; i *= 2) 
	        two += n / i;
	    
	    for (int i = 5; i <= n; i *= 5) 
	        five += n / i;
	 
	    System.out.printf("%d\n", (two < five) ? two : five);
		scan.close();
	}
}
