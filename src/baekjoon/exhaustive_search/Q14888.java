package baekjoon.exhaustive_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//연산자 끼워넣기
public class Q14888 {
	public static int n;
	public static int [] a = new int[12];
	public static List<Character> list = new ArrayList<>();
	public static char [] type = {'+', '-', '*', '/'};
	public static boolean [] visited;
	public static int min = Integer.MAX_VALUE;
	public static int max = Integer.MIN_VALUE;
	
	public static void backtrack(String s) {
		if(s.length() == n-1) {
			int result = calculation(s);
			min = Math.min(min, result);
			max = Math.max(max, result);
		}
		for(int i=0; i<list.size(); i++) {
			if(!visited[i]) {
				visited[i] = true;
				backtrack(s+list.get(i));
				visited[i] = false;
			}
		}
	}
	
	public static int calculation(String s) {
		int index = 1;
		int result = a[0];
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='+') {
				result+=a[index++];
			} else if(s.charAt(i)=='-') {
				result-=a[index++];
			} else if(s.charAt(i)=='*') {
				result*=a[index++];
			} else if(s.charAt(i)=='/') {
				result/=a[index++];
			}
		}
		return result;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(reader.readLine());
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(reader.readLine());
		for(int i=0; i<4; i++) {
			int k = Integer.parseInt(st.nextToken());
			for(int j=0; j<k; j++) {
				list.add(type[i]);
			}
		}
		visited = new boolean[list.size()];
		backtrack("");
		System.out.println(max);
		System.out.println(min);
	}

}
