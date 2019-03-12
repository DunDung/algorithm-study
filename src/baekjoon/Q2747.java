package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2747 {
	static int [] a = new int[46];

	static int fibonacci(int n) {
		if(a[n] != 0)
			return a[n];
		if(n==1||n==2)
			a[n] = 1;
		else
			a[n] = fibonacci(n-1)+fibonacci(n-2);
		return a[n];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		bw.write(fibonacci(n)+"\n");
		bw.flush();
	}
	
	
}

