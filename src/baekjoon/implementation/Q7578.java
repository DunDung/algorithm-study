package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7578 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String [] x = reader.readLine().split(" ");
		String [] y = reader.readLine().split(" ");
		int ans = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(x[i].equals(y[j])) {
					if(j>i) {
						ans+=j-i;
					}
					break;
				}
			}
		}
		System.out.println(ans);
		
	}

}
