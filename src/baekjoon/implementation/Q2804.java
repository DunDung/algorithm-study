package baekjoon.implementation;

import java.util.*;
import java.io.*;

//크로스 워드
public class Q2804 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();

		int aPoint = 0;
		int bPoint = 0;
		loop: {
			for(int i=0; i<A.length(); i++) {
				for(int j=0; j<B.length(); j++) {
					if(A.charAt(i) == B.charAt(j)) {
						aPoint = i;
						bPoint = j;
						break loop;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<B.length(); i++) {
			for(int j=0; j<A.length(); j++) {
				if(i == bPoint) {
					sb.append(A.charAt(j));
				} else if(j == aPoint) {
					sb.append(B.charAt(i));
				} else {
					sb.append('.');
				}
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());

	}
}