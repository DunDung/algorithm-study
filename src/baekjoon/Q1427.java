package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1427 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int [] a = new int[s.length()];
		for(int i =0; i<s.length(); i++) 
			a[i] = Integer.parseInt(s.substring(i, i+1));
		
		Arrays.sort(a);
		for(int i=a.length-1; i>=0; i--)
			System.out.print(a[i]);
	}
}
