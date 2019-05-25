package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ÃÖ´ñ°ª
public class Q2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.MIN_VALUE;
		int index = 0;
		
		for(int i=0; i<9; i++) {
			int k = Integer.parseInt(reader.readLine());
			if(max < k) {
				max = k;
				index = i+1;
			}
		}
		System.out.println(max +"\n"+ index);
	}
}
