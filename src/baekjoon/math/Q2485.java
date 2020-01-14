package baekjoon.math;

import java.util.*;
import java.io.*;

// °¡·Î¼ö
// 20.01.15
public class Q2485 {
	static int n;
	static int[] a;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(a);
		int gcd = a[1] - a[0];
		for (int i = 2; i < n; i++) {
			gcd = calculateGcd(gcd, a[i] - a[i - 1]);
		}
		
		int cnt = 0;
		for(int i = a[0]; i <= a[n-1]; i += gcd) {
			cnt++;
		}
		
		System.out.println(cnt - n);
	}
	
	static int calculateGcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return calculateGcd(b, a % b);
	}
}