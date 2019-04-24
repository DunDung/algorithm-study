package baekjoon.implementation;

import java.util.Scanner;

//»ï°¢±è¹ä
//O
public class Q2783 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int n = scan.nextInt();
		double min = 0;
		int [][] array = new int[n+1][2];
		
		
		array[0][0] = x;
		array[0][1] = y;
		
		for(int i=1; i<array.length; i++) 
			for(int j=0; j<array[i].length; j++)
				array[i][j] = scan.nextInt();
		
		min = array[0][0]*((double)1000/array[0][1]);
		for(int i=1; i<array.length; i++) {
				double result = array[i][0]*((double)1000/array[i][1]);
				if(min > result)
					min = result; 
		}
		
		System.out.printf("%.2f", min);
		scan.close();
	}
}
