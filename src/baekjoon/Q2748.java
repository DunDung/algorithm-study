package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//피보나치의 수 2
//O
public class Q2748 {
	static long [] a = new long[100];
	static long fibonacci(int n) {
		if(a[n]!=0)
			return a[n];
		if(n==1||n==2)
			a[n] = 1;
		else a[n]= fibonacci(n-1)+fibonacci(n-2);
		return a[n];
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine());
		writer.write(String.valueOf(fibonacci(n)));
		writer.flush();
	}
}
