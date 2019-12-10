package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 오르막길
public class Q2846 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int startValue = arr[0];
		for(int i = 1; i < n; i++) {
			if(arr[i] > arr[i-1]) {
				continue;
			} else {
				max = Math.max(max, arr[i-1] - startValue);
				startValue = arr[i];
			}
		}
		max = Math.max(max, arr[n-1] - startValue);
		System.out.println(max);
	}
}
