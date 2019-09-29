package baekjoon.math;

import java.io.*;
import java.util.*;

//제곱 ㄴㄴ 수
//X
//start부분이 이해가 잘안감
public class Q1016 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long min = Long.parseLong(st.nextToken());
		long max = Long.parseLong(st.nextToken());
		boolean[] arr = new boolean[(int)(max-min+1)];
		long cnt = max - min +1;

		for(long i = 2; i*i <= max; i++) {
			long powNum = i*i;
			long start = min + (powNum -(min%powNum))%powNum;
			for(long j = start; j <= max; j += powNum) {
				if(!arr[(int)(j - min)]) {
					arr[(int)(j - min)] = true;
					cnt--;
				}
			}
		}
		System.out.println(cnt);
	}
}
