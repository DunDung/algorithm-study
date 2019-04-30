package baekjoon.implementation;

import java.util.Scanner;

//¿Àºì ½Ã°è
public class Q2525 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		int u = scan.nextInt();
		
		m+=u;
		if(m>=60) {
			h+= m/60;
			m = m%60;
		}
		if(h>=24) {
			h%=24;
		}
		System.out.println(h+" "+m);
	}

}
