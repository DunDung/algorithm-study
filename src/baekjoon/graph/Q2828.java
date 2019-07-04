package baekjoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//사과 담기 게임
public class Q2828 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken())-1;
		int tc = Integer.parseInt(reader.readLine());
		
		int idx = 1; //현재 위치
		int ans = 0;
		while(tc-- > 0) {
			int k = Integer.parseInt(reader.readLine());
			while(!(idx <= k && k <= idx+m)) {
				if(k > idx+m) {
					idx++;
					ans++;
				} else if(k < idx) {
					idx--;
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}
