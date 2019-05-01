package baekjoon.implementation;

import java.util.Scanner;

//16진수
//진법변환이 기억이 안났다..
public class Q1550 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int ans=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)-'0'>= 0 && s.charAt(i)-'0'<=9)
				ans = ans * 16 + (s.charAt(i)-'0');
			else
				ans = ans * 16 + (s.charAt(i)-'A'+10);
		}
		System.out.println(ans);
	}
}
