package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//Ä«µå
public class Q11652 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Map<Long, Integer> map = new HashMap<>();
		int max = 0;
		long value = 0;
		
		for(int i=0; i<n; i++) {
			long s = Long.parseLong(reader.readLine());
			if(map.containsKey(s)) 
				map.replace(s, map.get(s), map.get(s)+1);
			
			else 
				map.put(s, 1);
			
			if(map.get(s) > max) {
				max = map.get(s);
				value = s;
			}
			if(map.get(s) == max)
				if(value>s)
					value = s;	
		}
		System.out.println(value);
	}
}
