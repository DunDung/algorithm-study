package baekjoon.implementation;

import java.util.*;
import java.io.*;

//¼­¹ö
public class Q10409 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int ans = 0;
		for(int i=0; i<n; i++) {
			T -= Integer.parseInt(st.nextToken());
			if(T < 0) break;
			ans++;
		}
		System.out.println(ans);
	}
}