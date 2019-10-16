package baekjoon.implementation;

import java.util.*;
import java.io.*;

//치킨 두 마리 (...) 
public class Q14489 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long c = Long.parseLong(br.readLine())*2;
		
		long sum = a+b;
		if(sum>=c) sum -= c;
		System.out.println(sum);
	}
}
