package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//°ñµå¹ÙÈå ÆÄÆ¼¼Ç
public class Q17103 {
	static boolean[] prime = new boolean[1000001];
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		eratos();
		int tc = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		while(tc-- > 0) {
			int n = Integer.parseInt(bf.readLine());
			int cnt = 0;
			for(int i=1; i<=n/2; i++) {
				if(prime[i] && prime[n-i]) {
					cnt++;
				}
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb.toString());
	}

	public static void eratos() {
		int max = 1000000;
		Arrays.fill(prime, 2, max, true);
		for(int i=2; i*i<=max; i++) {
			if(prime[i]) {
				for(int j=i*i; j<=max; j+=i) {
					prime[j] = false;
				}
			}
		}
	}
}
