package baekjoon.implementation;

import java.io.*;
import java.util.*;

//归汲 傍林客 老蚌 抄里捞
public class Q3040 {

	public static void main(String[] args)  throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nine = new int[9];
		for(int i=0; i<9; i++) {
			nine[i] = Integer.parseInt(br.readLine());
		}
		StringBuilder sb = new StringBuilder();
		loop:
			for(int k=0; k<9; k++) {
				for(int i=0; i<9; i++) {
					int cnt = 0;
					int sum = 0;
					sb = new StringBuilder();
					for(int j=0; j<9; j++) {
						if(i==j || k==j) continue;
						sb.append(nine[j]+"\n");
						cnt++;
						sum += nine[j];
						if(cnt>7 || sum>100) continue;
						if(cnt==7 && sum == 100) break loop;
					}
				}
			}
		System.out.print(sb.toString());
	}

}
