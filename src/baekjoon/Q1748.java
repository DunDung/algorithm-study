package baekjoon;

import java.util.Scanner;

public class Q1748 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int count = 0;
		StringBuilder s = new StringBuilder();
		for(int i=1; i<=t; i++) {
			if(i>=1000000000)
				count +=11;
			else if(i>=1000000000)
				count +=10;
			else if(i>=100000000)
				count +=9;
			else if(i>=10000000)
				count +=8;
			else if(i>=1000000)
				count +=7;
			else if(i>=100000)
				count +=6;
			else if(i>=10000)
				count +=5;
			else if(i>=1000)
				count +=4;
			else if(i>=100)
				count +=3;
			else if(i>=10)
				count += 2;
			else
				count++;
			
		}
		System.out.println(count);
	}
}
