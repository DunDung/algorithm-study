package baekjoon.implementation;

import java.util.*;
import java.io.*;

//°ËÁõ¼ö
public class Q2475 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		for(int i=0; i<5; i++) {
			int v = Integer.parseInt(st.nextToken());
			sum += v * v;
		}
		System.out.println(sum%10);
	}
}