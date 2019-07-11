package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//접미사 배열
public class Q11656 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();
		String [] a = new String[s.length()];
		for(int i=0; i<s.length(); i++) {
			a[i] = s.substring(i); 
		}
		Arrays.sort(a);
		StringBuilder sb = new StringBuilder();
		for(String k : a) {
			sb.append(k+"\n");
		}
		System.out.print(sb);
	}

}
