package baekjoon.implementation;

import java.util.Scanner;

public class Q10886 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int yes=0;
		int no=0;
		for(int i=0; i<n; i++) {
			int v = scan.nextInt();
			if(v == 1)
				yes++;
			else
				no++;
		}
		if(yes>no)
			System.out.println("Junhee is cute!");
		else
			System.out.println("Junhee is not cute!");
	}

}
