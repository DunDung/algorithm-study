package baekjoon.implementation;

import java.io.*;
import java.util.*;

//¾ËÆÄºª °Å¸®
public class Q5218 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			
			sb.append("Distances: ");
			for(int i=0; i<a.length(); i++) {
				if(b.charAt(i) >= a.charAt(i)) {
					sb.append(b.charAt(i)-a.charAt(i)+" ");
				} else {
					sb.append((b.charAt(i)+26)-a.charAt(i)+" ");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}

}
