package baekjoon.exhaustive_search;

import java.util.Scanner;

//µ¢Ä¡
public class Q7568 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Big [] a = new Big[n];
		
		for(int i=0; i<n; i++) {
			a[i] = new Big(scan.nextInt(), scan.nextInt());
		}
		
		for(int i=0; i<n; i++) {
			int cnt = 1;
			for(int j=0; j<n; j++) {
				if(i==j)
					continue;
				if(a[i].g < a[j].g && a[i].k < a[j].k)
					cnt++;
			}
			System.out.print(cnt+" ");
		}
	}
}

class Big{
	int g; //¸ö¹«°Ô
	int k; //Å°
	
	public Big(int g, int k) {
		this.g = g;
		this.k = k;
	}
}
