package baekjoon.math;

import java.util.Scanner;

public class Q1075 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		int f = scan.nextInt();
		int k = Integer.parseInt(n.substring(0, n.length()-2)+"00");
		for(int i=0; i<=99; i++) {
			if(k % f == 0) {
				if(i<10)
					System.out.println("0"+i);
				else
					System.out.println(i);
				break;
			}
			k++;
		}

	}

}
