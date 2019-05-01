package baekjoon.implementation;

import java.util.Arrays;
import java.util.Scanner;

//한조서열정리하고 옴 ㅋㅋ
public class Q14659 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];
		int [] b = new int[n];
		
		for(int i=0; i<n; i++)
			a[i] = scan.nextInt();
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++ ) {
				if(a[i]>a[j])
					b[i]++;
				else
					break;
			}
				
		}
		Arrays.sort(b);
		System.out.println(b[n-1]);
	}

}
