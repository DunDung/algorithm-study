package baekjoon.samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//시험 감독
public class Q13458 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int [] a = new int[n];
		String [] input = reader.readLine().split(" "); 
		String [] viewer = reader.readLine().split(" "); 
		int major = Integer.parseInt(viewer[0]);
		int minor = Integer.parseInt(viewer[1]);
		long ans = n;
		
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(input[i])-major;
			if(a[i] > 0) {
				ans += a[i]/minor;
				if(a[i]%minor != 0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
