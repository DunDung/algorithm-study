package baekjoon.exhaustive_search;

import java.util.Scanner;

//날짜 계산
public class Q1476 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int e = scan.nextInt();
		int s = scan.nextInt();
		int m = scan.nextInt();
		
		int a=0;
		int b=0;
		int c=0;
		int cnt = 0;
		while(true) {
			if(a==e && b==s && c==m)
				break;
			cnt++;
			a++;
			b++;
			c++;
			if(a>15)
				a = 1;
			if(b>28)
				b = 1;
			if(c>19)
				c = 1;
				
		}
		System.out.println(cnt);
	}

}
