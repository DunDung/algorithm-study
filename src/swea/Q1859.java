package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백만 장자 프로젝트
//X
public class Q1859 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();
		for(int k=1; k<=tc; k++) {
			int n = Integer.parseInt(reader.readLine());
			int [] a = new int[n];
			String [] input = reader.readLine().split(" ");
			for(int i=0; i<n; i++) {
				a[i] = Integer.parseInt(input[i]);
			}
			int max = a[n-1];
			long ans = 0;
			for(int i=n-2; i>=0; i--) {
				if(max>a[i]) {
					ans += max-a[i];
				} else {
					max = a[i];
				}
			}
			sb.append("#"+k+" "+ans+"\n");
		}
		System.out.print(sb.toString());
	}
}

