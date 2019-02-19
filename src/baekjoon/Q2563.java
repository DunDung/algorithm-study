package baekjoon;

import java.util.Scanner;

public class Q2563 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int [][] array = new int[100][100];
		int count = 0;
		for(int i=0; i<t; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			for(int a = x; a<x+10; a++)
				for(int b=y; b<y+10; b++) {
					if(array[a][b]==0) {
						array[a][b]=1;
						count++;
					}
				}
		}
		System.out.println(count);
	}
	
}
