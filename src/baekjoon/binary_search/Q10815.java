package baekjoon.binary_search;

import java.io.*;
import java.util.*;

//숫자 카드
public class Q10815 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<m; i++) {
			int v = Integer.parseInt(st.nextToken());
			if(set.contains(v)) sb.append("1 ");
			else sb.append("0 ");
		}
		System.out.println(sb.toString());
	}

}
