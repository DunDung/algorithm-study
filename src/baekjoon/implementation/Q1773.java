package baekjoon.implementation;

import java.util.*;
import java.io.*;

//ÆøÁ×¼î 
public class Q1773 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int[] cycles = new int[N];
		for(int i=0; i<N; i++) {
			cycles[i] = Integer.parseInt(br.readLine());
		}
		int ans = 0;
		for(int i=1; i<=C; i++) {
			for(int j=0; j<N; j++) {
				if(i%cycles[j] == 0){
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}