package baekjoon.divide_and_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11728 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int [] a = new int[n];
		int [] b = new int[m];
		
		st = new StringTokenizer(reader.readLine());
		for(int i=0; i<n; i++)
			a[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(reader.readLine());
		for(int i=0; i<m; i++)
			b[i] = Integer.parseInt(st.nextToken());
		
		int i=0;
		int j=0;
		int k=0;
		int [] temp = new int[n+m];
		
		while(i<n && j<m) {
			if(a[i]<b[j])
				temp[k++] = a[i++];
			else
				temp[k++] = b[j++];
		}
		while(i<n)
			temp[k++] = a[i++];
		while(j<m)
			temp[k++] = b[j++];
		
		for(int z : temp)
			System.out.print(z+" ");
	}
}
