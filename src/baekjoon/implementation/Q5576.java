package baekjoon.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class Q5576 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] a = new int[10];
		int [] b = new int[10];
		
		for(int i =0; i<10; i++)
			a[i] = scan.nextInt(); 
		for(int i =0; i<10; i++)
			b[i] = scan.nextInt();
		
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		
		int sum = 0;
		for(int i =9; i>6; i--)
			sum+=a[i];
		System.out.print(sum+" ");
		sum = 0;
		for(int i=9; i>6; i--)
			sum+=b[i];
		System.out.print(sum);
		
	}

}
