package baekjoon.implementation;

import java.util.Arrays;
import java.util.Scanner;

//주사위 네개
public class Q2484 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			int [] k = new int[7];
			for(int j=0; j<4; j++)
				k[scan.nextInt()]++;

			int count = 0;
			for(int j=1; j<7; j++) {
				if(k[j]==4) 
					arr[i] = 50000+(j*5000);
				if(k[j]==3)
					arr[i] = 10000+(j*1000);
				if(k[j]==2) {
					count ++;
					arr[i] = 1000+(j*100);
				}
				if(k[j]==2 && count==2) {
					arr[i] = 0;
					for(int c=1; c<7; c++)
						if(k[c]==2)
							arr[i]+=c*500;
					arr[i]+=2000;
				}
			}
			
			if(arr[i] == 0) {
				int max = 0;
				for(int j=0; j<7; j++)
					if(k[j] == 1)
						if(max < j)
							max = j;
				arr[i] = max*100;
			}
		}
		
		Arrays.sort(arr);
		System.out.println(arr[n-1]);
	}
}
