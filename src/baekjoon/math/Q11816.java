package baekjoon.math;

import java.util.Scanner;

//8진수, 10진수 16진수
public class Q11816 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int b = 0;
		if(s.charAt(0)-'0' == 0) {
			if(s.charAt(1)=='x') {
				b=16;
				s = s.substring(2, s.length());
			}
			else {
				b=8;
				s=s.substring(1, s.length());
			}
		}
		else
			b = 10;
		
		int ans = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)-'0'<10)
				ans = ans*b+(s.charAt(i)-'0');
			else
				ans = ans*b+(s.charAt(i)+10-'a');
		}
		System.out.println(ans);
		
	}

}
