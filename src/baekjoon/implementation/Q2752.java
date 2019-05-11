package baekjoon.implementation;

import java.util.Arrays;
import java.util.Scanner;

//세수정렬
public class Q2752 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] a = new int[3];
		
		for(int i=0; i<3; i++)
			a[i]=scan.nextInt();
		
		Arrays.sort(a);
		for(int k : a)
			System.out.print(k+" ");
	}

}
