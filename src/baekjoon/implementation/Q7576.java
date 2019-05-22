package baekjoon.implementation;

import java.util.Scanner;

//±×¸©
public class Q7576 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		int ans = 10;
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i) != s.charAt(i-1))
				ans+=10;
			else
				ans+=5;
		}
		System.out.println(ans);
	}

}
