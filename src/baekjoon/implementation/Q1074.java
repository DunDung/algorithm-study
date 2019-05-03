package baekjoon.implementation;

import java.util.Scanner;

//Z
public class Q1074 {
	static long cnt = 0;
	static int r;
	static int c;
	static void add( long n, int x, int y) {
		if(x==r && y ==c)
			System.out.println(cnt);
		cnt++;
		if(x==r && y+1 ==c)
			System.out.println(cnt);
		cnt++;
		if(x+1==r && y ==c)
			System.out.println(cnt);
		cnt++;
		if(x+1==r && y+1 ==c)
			System.out.println(cnt);
		cnt++;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		n = (int)Math.pow(2, n);
		r = scan.nextInt();
		c = scan.nextInt();

		for(int i=0; i<n; i+=2)
			for(int j=0; j<n; j+=2) 
				add(n, i, j);
	}
}
