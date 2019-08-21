package baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//K¹øÂ° ¼ö
public class Q1300 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int k = Integer.parseInt(reader.readLine());
		int [] a = new int[n*n];
		int cnt = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				a[cnt++] = i*j;
			}
		}
		Arrays.sort(a);
		System.out.println(a[k]);
	}

}
