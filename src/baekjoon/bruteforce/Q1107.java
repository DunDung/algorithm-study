package baekjoon.bruteforce;

import java.util.Scanner;

//¸®¸ðÄÁ
//X
public class Q1107 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		int m = scan.nextInt();
		int ch = 100;
		int [] a = new int[10];
		int min = 0;
		for(int i=0; i<m; i++) 
			a[scan.nextInt()] = -1;

		if(n.equals("100"))
			System.out.println(0);
		else {
			String v = "";
			String closer = "";
			min = Integer.MAX_VALUE;
			for(int i = 0; i<=1000000; i++) {
				boolean isOk = true;
				v = i+"";
				for(int j=0; j<v.length(); j++) {
					if(a[v.charAt(j)-'0'] == -1) {
						isOk = false;
						break;
					}
				}
				if(isOk) {
					if(min > Math.abs(Integer.parseInt(n)-Integer.parseInt(v))) {
						min = Math.abs(Integer.parseInt(n)-Integer.parseInt(v));
						closer = v;
					}
				}
			}
			int result1 = Math.abs(Integer.parseInt(n)-ch);
			System.out.println(closer);
			if(closer.equals(""))
				System.out.println(result1);
			else {
				int result2 = Math.abs(Integer.parseInt(n)-Integer.parseInt(closer))+closer.length();
				if(result1>result2)
					System.out.println(result2);
				else
					System.out.println(result1);
			}
		}
	}
}
