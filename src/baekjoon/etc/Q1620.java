package baekjoon.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		Map<String, Integer> map = new HashMap<>();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String [] pocketmon = new String[n];
		
		for(int i=0; i<n; i++) {
			pocketmon[i] = bf.readLine();
			map.put(pocketmon[i], i+1);
		}
		
		for(int i=0; i<m; i++) {
			String name = bf.readLine();
			if(!name.substring(0, 1).matches("[A-Z]"))
				bw.write(pocketmon[Integer.parseInt(name)-1]+"\n");
			else 
				bw.write(map.get(name)+"\n");
		}
		
		bw.flush();
		bw.close();
		bf.close();
	}
}
