package baekjoon.implementation;

import java.io.*;
import java.util.*;

//숫자 카드2
public class Q10816 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		StringTokenizer st = new StringTokenizer(reader.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		
		while(n-- > 0) {
			int v = Integer.parseInt(st.nextToken());
			if(map.containsKey(v)) {
				map.replace(v, map.get(v)+1);
			} else {
				map.put(v, 1);
			}
		}
		
		int m = Integer.parseInt(reader.readLine());
		st = new StringTokenizer(reader.readLine());
		StringBuilder sb = new StringBuilder();
		while(m-- > 0) {
			int v = Integer.parseInt(st.nextToken());
			if(!map.containsKey(v)) {
				sb.append(0+" ");
			} else {
				sb.append(map.get(v)+" ");
			}
		}
		System.out.println(sb.toString());
	}

}
