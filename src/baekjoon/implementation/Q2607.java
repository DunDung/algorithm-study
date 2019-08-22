package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//비슷한단어
public class Q2607 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine())-1;
		int [] a = new int[100];
		String standard = reader.readLine();
		int ans = 0;
		
		for(int i=0; i<standard.length(); i++) {
			a[standard.charAt(i)]++;
		}
		for(int i=0; i<n; i++) {
			String compare = reader.readLine();
			for(int j=0; j<compare.length(); j++) {
				
			}
		}
	}

}
