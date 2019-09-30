package baekjoon.implementation;

import java.io.*;
import java.util.*;

//µÚÁýÈù µ¡¼À
public class Q1357 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		int sum = Integer.parseInt(new StringBuilder(a).reverse().toString());
		sum += Integer.parseInt(new StringBuilder(b).reverse().toString());
		String v = String.valueOf(sum);
		System.out.println(Integer.parseInt(new StringBuilder(v).reverse().toString()));
	}
}
