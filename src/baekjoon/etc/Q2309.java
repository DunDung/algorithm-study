package baekjoon.etc;

import java.util.Arrays;
import java.util.Scanner;

public class Q2309 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] k = new int[9];
		for(int i=0; i<9; i++)
			k[i] = scan.nextInt();

		Arrays.sort(k);
		int sum = 0;
		for(int a : k)
			sum += a;

		outerloop:	
		for(int i=0; i<9; i++)
			for(int j=1; j<9; j++)
				if(sum-(k[i]+k[j]) == 100) {
					for(int a : k) 
						if(a != k[i] && a != k[j]) 
							System.out.println(a);
					break outerloop;
				}
	}
}
