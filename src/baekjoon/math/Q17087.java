package baekjoon.math;

import java.util.*;
import java.io.*;

//¼û¹Ù²ÀÁú 6
public class Q17087 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int[] gaps = new int[n];
		
		st = new StringTokenizer(reader.readLine());
		for(int i=0; i<n; i++) {
			gaps[i] = Math.abs(s-Integer.parseInt(st.nextToken())); 
		}
		for(int i=1; i<n; i++) {
			gaps[i] = gcd(gaps[i], gaps[i-1]);
		}
		System.out.println(gaps[n-1]);
	}
	
	static int gcd(int a, int b) {
		while(b!=0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}
