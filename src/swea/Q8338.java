package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//°è»ê±â
public class Q8338 {
	static int ans = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(reader.readLine());
		for(int t=1; t<=tc; t++) {
			int n = Integer.parseInt(reader.readLine());
			int [] a = new int[n];
			StringTokenizer st = new StringTokenizer(reader.readLine());
			for(int i=0; i<n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			backTrack(a, n, 1, a[0]);
			sb.append("#"+t+" "+ans+"\n");
			ans = Integer.MIN_VALUE;
		}
		System.out.print(sb.toString());
	}

	public static void backTrack(int [] a, int n, int cnt, int result) {
		if(cnt==n) {
			ans = Math.max(ans, result);
			return;
		}
		backTrack(a, n, cnt+1, result+a[cnt]);
		backTrack(a, n, cnt+1, result*a[cnt]);
	}
}
