package baekjoon.implementation;

import java.io.*;

//¸¶¹æÁø
public class Q1307 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] a = new int[n][n];
		
		int i = 0;
		int j = n / 2;
		
		for(int k=1; k<=(n*n); k++) {
			a[i][j] = k;
			if(k%n == 0) {
				i++;
				continue;
			}
			i--;
			j++;
			if(i<0) i = n-1;
			if(j>n-1) j = 0;
		}
		StringBuilder sb = new StringBuilder();
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				sb.append(a[i][j]+" ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}

}
