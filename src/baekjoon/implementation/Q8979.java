package baekjoon.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class Q8979 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		int goal=scan.nextInt();
		int [][] a = new int[t][3];
		int count = 1;
		
		for(int i=0; i<t; i++) {
			int k = scan.nextInt();
			for(int j=0; j<3; j++) { 
				a[k-1][j] = scan.nextInt();
			}
		}				


		for(int i=0; i<t; i++) { 
			if(a[goal-1][0]<a[i][0]) {
				count++;
			}
			else if(a[goal-1][0]==a[i][0]) {
				if(a[goal-1][1]<a[i][1])
					count++;
				else if(a[goal-1][1]==a[i][1])
					if(a[goal-1][2]<a[i][2])
						count++;
			}
		}
		System.out.println(count);
	}
}

