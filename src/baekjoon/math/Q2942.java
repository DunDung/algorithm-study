package baekjoon.math;

import java.util.*;
import java.io.*;

//퍼거슨과 사과
public class Q2942 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long R = Long.parseLong(st.nextToken());
		long G = Long.parseLong(st.nextToken());
		long P = gcd(R, G);
		
		StringBuilder sb = new StringBuilder();
		if(P==1) {
			sb.append(1+" "+R+" "+G+"\n");
			if(R==G) {
				sb.append(R+" "+R+" "+G+"\n");
			}
		} else {
			for(int i=1; i<=P; i++) {
				if(R%i==0 && G%i==0)
				sb.append(i+" "+(R/i)+" "+(G/i)+"\n");
			}
		}

		System.out.print(sb.toString());
	}
	static long gcd(long a, long b) {
		if(b==0) return a;
		return gcd(b, a%b);
	}
}