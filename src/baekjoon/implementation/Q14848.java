package baekjoon.implementation;

import java.io.*;
import java.util.*;

//정수 게임
public class Q14848 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] a = new int[k];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<k; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		long ans = n;
		for(int i=0; i<k; i++) {
			long cnt = n/a[i];
			for(int j=0; j<i; j++) {
				if(a[i]%a[j] == 0) {
					cnt = 0;
					break;
				} else {
					cnt-= n/(a[i]*a[j]/gcd1(a[i],a[j]));
				}
			}
			ans -= cnt;
		}
		System.out.println(ans);
		
	}
	static int gcd1(int a, int b) { //재귀 사용
		if(b==0)
			return a;
		return gcd1(b, a%b);
	}
}
