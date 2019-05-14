package codeforce.round560_div3;

import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		String k = scan.next();
		long dx = 1;
		long dy = 1;
		for(int i=0; i<x; i++) {
			dx*=10;
		}
		if(y>0) {
			for(int i=0; i<y; i++) {
				dy*=10;
			}
		}

		long sum = dx+dy;
		String s = String.valueOf(sum);
		String result = k.substring(0, k.length()-s.length())+s;

		int cnt = 0;
		if(result.length()==k.length()) {
			for(int i = 0; i<k.length(); i++) {
				if(result.charAt(i) != k.charAt(i)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
