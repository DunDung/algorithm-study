package baekjoon.implementation;

import java.util.Scanner;

//인공지능 시계
public class Q2530 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		c += d%60;
		b += d/60;
		
		if(c>=60){
			b += c/60;
			c %= 60;
		}
		if(b>=60) {
			a += b/60;
			b %= 60;
		}
		if(a>= 24)
			a = a%24;
		
		System.out.println(a+" "+b+" "+c);
		
	}

}
