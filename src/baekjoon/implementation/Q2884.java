package baekjoon.implementation;

import java.util.Scanner;

public class Q2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		if(m-45<0) {
			m= m-45+60;
			h--;
			if(h<0)
				h=23;
		}
		else
			m-=45;
		System.out.println(h+" "+m);	
	}

}
