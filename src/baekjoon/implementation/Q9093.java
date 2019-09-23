package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9093 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		while(n-- > 0) {
			String[] words = bf.readLine().split(" ");
			for(String s : words) {
				sb.append(new StringBuilder(s).reverse()+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
