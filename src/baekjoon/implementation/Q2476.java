package baekjoon.implementation;

import java.util.Arrays;
import java.util.Scanner;

//주사위 게임
public class Q2476 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			int [] k = new int[3];
			for(int j=0; j<3; j++)
				k[j] = scan.nextInt();
			if(k[0]==k[1] && k[1]==k[2])
				arr[i] = 10000+(k[0]*1000);
			else if(k[0]==k[1])
				arr[i] = 1000+(k[0]*100);
			else if(k[0]==k[2])
				arr[i] = 1000+(k[0]*100);
			else if(k[1]==k[2])
				arr[i] = 1000+(k[2]*100);
			else {
				Arrays.sort(k);
				arr[i] = k[2]*100;
			}
		}
		Arrays.sort(arr);
		System.out.println(arr[n-1]);
		
	}
}
