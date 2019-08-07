package codeforce.round70_div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YouAreGivenTwoBinaryStrings {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(reader.readLine());
		while(tc-- >0) {
			String x = reader.readLine();
			String y = reader.readLine();
			int tx = 0;
			int ty = 0;
			int two = 1;
			for(int i=x.length()-1; i>=0; i--) {
				tx+= (x.charAt(i)-'0') * two;
				two*=2;
			}
			two = 1;
			for(int i=y.length()-1; i>=0; i--) {
				ty+= (y.charAt(i)-'0') * two;
				two*=2;
			}
			int k = 0;
			int ans = 0;
			String result = "9999999999999999";
			for(int i=0; i<=y.length(); i++) {
				int temp = ty*2*k;
				String s = new StringBuilder(String.valueOf(Integer.toBinaryString(tx+temp))).reverse().toString();
				if(s.compareTo(result)<0) {
					ans = k;
					result = s;
				}
				k++;
			}
			System.out.println(ans);
		}
	}

}
