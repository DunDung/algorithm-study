package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//¹Ý¿Ã¸²
public class Q2033 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int round = 10;
		double z = 0.1;
		int ans = n;
		while(round<ans) {
			ans = (int)(Math.round((ans*z))*round);
			round*=10;
			z/=10;
		}
		System.out.println(ans);
		
	}
}
