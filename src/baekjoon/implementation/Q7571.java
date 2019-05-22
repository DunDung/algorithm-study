package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//점 모으기
//X
public class Q7571 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int [] xArr = new int[m];
		int [] yArr = new int[m];
		
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(reader.readLine());
			xArr[i] = Integer.parseInt(st.nextToken());
			yArr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(xArr);
		Arrays.sort(yArr);
		
		int xMid = xArr[m/2];
		int yMid = yArr[m/2];
		
		int ans = 0;
		for(int i=0; i<m; i++) {
			ans += Math.abs(xMid - xArr[i]) + Math.abs(yMid - yArr[i]);
		}
		
		System.out.println(ans);
	}
}

