package baekjoon.implementation;

import java.util.*;
import java.io.*;

//수빈이와 수열
public class Q10539 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] a = new int[n];
		int[] b = new int[n];
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		a[0] = b[0];
		sb.append(a[0]+" ");
		for(int i=1; i<n; i++) {
			a[i] = b[i]*(i+1) - a[i-1];
			sb.append(a[i]+" ");
			a[i] += a[i-1];
		}
		System.out.print(sb.toString());
	}
}