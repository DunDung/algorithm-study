package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//¸µ
public class Q3036 {
	
	public static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b, a%b);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(reader.readLine());
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int first = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n-1; i++) {
			int second = Integer.parseInt(st.nextToken());
			int k = gcd(first, second);
			sb.append(first/k+"/"+second/k+"\n");
		}
		System.out.print(sb.toString());
	}
}
