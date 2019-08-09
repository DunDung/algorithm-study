package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//ÆĞ¼Ç¿Õ ½ÅÇØºó
//X
public class Q9375 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();
		while(tc-- > 0) {
			int n = Integer.parseInt(reader.readLine());
			Map<String, Integer> map = new HashMap<>();
			for(int i=0; i<n; i++) {
				String [] s = reader.readLine().split(" ");
				if(map.containsKey(s[1])) {
					map.replace(s[1], map.get(s[1]), map.get(s[1])+1);
				} else {
					map.put(s[1], 1);
				}
			}
			int ans = 1;
			for(int v : map.values()) {
				ans *= v+1;
			}
			sb.append(ans-1+"\n");
		}
		System.out.print(sb.toString());
	}

}
