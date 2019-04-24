package baekjoon.implementation;

import java.util.Scanner;

public class Q5575 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			int [] start = new int[3];
			int [] end = new int[3];
			int h,m,s = 0;
			for(int j=0; j<3; j++)
				start[j] = scan.nextInt();
			for(int j=0; j<3; j++)
				end[j] = scan.nextInt();

			s = end[2] - start[2];	
			m = end[1] - start[1];
			h = end[0] - start[0];
			if(s<0) {
				s += 60;
				m -= 1;
			}
			if(m<0) {
				m += 60;
				h -= 1;
			}
			System.out.printf("%d %d %d\n",h, m, s);
		}
	}

}
