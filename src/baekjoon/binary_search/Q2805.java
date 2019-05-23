package baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//나무 자르기
//랜선 자르기와 거의 똑같아서 풀 수 있었음
public class Q2805 {
	
	static boolean check(long[] a, int m, long h) {
		long k = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]-h > 0)
				k+=a[i]-h;
		}
		return k>=m;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long [] a = new long[n];
		long max = 0;
		
		st = new StringTokenizer(reader.readLine());
		for(int i=0; i<n; i++) {
			a[i] = Long.parseLong(st.nextToken());
			max = Math.max(max, a[i]);
		}
		
		long start = 1;
		long end = max;
		long ans = 0;
		while(start<=end) {
			long mid = (start+end)/2;
			if(check(a, m, mid)) {
				ans = Math.max(ans, mid);
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		System.out.println(ans);
		
		
	}

}
