package baekjoon.exhaustive_search;

import java.util.Scanner;

//¿µÈ­°¨µ¶ ¼ò
public class Q1436 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = 666;
		int cnt = 1;
		while(cnt != n) {
			int temp = ++k;
			int sixCount = 0;
			while(temp > 0) {
				if(temp % 10 == 6) {
					sixCount++;
				} else {
					sixCount = 0;
				}
				if(sixCount == 3) {
					cnt++;
				}
				temp/=10;
			}
		}
		System.out.println(k);
	}
}
