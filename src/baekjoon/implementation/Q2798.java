package baekjoon.implementation;

import java.util.Scanner;

public class Q2798 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int [] card = new int[n];
		int sum = 0;
		int minus = m;

		for(int i=0; i<n; i++)
			card[i] = scan.nextInt();

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for(int l=0; l<n; l++) {
					if(i!=j && i!=l && j!=l) {
						if(m>=card[i]+card[j]+card[l])
							if(minus > Math.abs(m-(card[i]+card[j]+card[l]))) {
								minus = Math.abs(m-(card[i]+card[j]+card[l]));
										sum = card[i]+card[j]+card[l];
							}
					}
				}
			}
		}
		System.out.println(sum);
	}
}
