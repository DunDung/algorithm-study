package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5598 {

	public static void main(String[] args) throws IOException{
		String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			int v = s.charAt(i)-'A'-3;
			if(v>25) {
				v = v-25;
			} else if(v<0) {
				v = 25+v+1;
			}
			sb.append((char) (v+'A'));
		}
		System.out.print(sb.toString());
	}

}
