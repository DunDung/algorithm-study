package baekjoon.implementation;

import java.io.*;

//¾ÏÈ£
public class Q1718 {
	static final int MAX_ARPABET = 26;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String key = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<input.length(); i++) {
			char tempChar = input.charAt(i);
			if(Character.isLetter(tempChar)) {
				int tempNum = tempChar - key.charAt(i%key.length());
				if(tempNum <= 0) {
					tempNum += MAX_ARPABET; 
				}
				tempChar = (char)(tempNum+'a' - 1);
			}
			sb.append(tempChar);
		}
		System.out.println(sb.toString());
	}
}