package baekjoon.implementation;


import java.util.*;
import java.io.*;

//Äµµð ±¸¸Å
public class Q2909 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		if(K == 0) {
			System.out.println(C);
		} else {
			StringBuilder sb = new StringBuilder("1");
			for(int i=0; i<K; i++) {
				sb.append("0");
			}
			K = Integer.parseInt(sb.toString());

			int mod = C%K;
			C -= mod;
			int ans = mod >= K/2 ? C+K : C ;
			System.out.println(ans);
		}
	}
}