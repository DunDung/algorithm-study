package baekjoon.implementation;

import java.util.Arrays;
import java.util.Scanner;

//주사위 세개
public class Q2480 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;

		int [] k = new int[3];
		for(int j=0; j<3; j++)
			k[j] = scan.nextInt();
		if(k[0]==k[1] && k[1]==k[2])
			n = 10000+(k[0]*1000);
		else if(k[0]==k[1])
			n = 1000+(k[0]*100);
		else if(k[0]==k[2])
			n = 1000+(k[0]*100);
		else if(k[1]==k[2])
			n = 1000+(k[2]*100);
		else {
			Arrays.sort(k);
			n = k[2]*100;
		}
		System.out.println(n);
	}
}
