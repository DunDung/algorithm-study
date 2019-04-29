package baekjoon.implementation;

import java.util.Scanner;

//연속구간
public class Q2495 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			int [] a = new int[8];
			String s = scan.next();
			for(int j=1; j<8; j++)
				if(s.charAt(j)-'0'==s.charAt(j-1)-'0')
					a[j] = a[j-1]+1;
			int max = 0;
			for(int j=1; j<8; j++)
				if(a[j]>max)
					max = a[j];
			
			System.out.println(max+1);
		}
	}
}
