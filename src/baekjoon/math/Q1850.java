package baekjoon.math;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//최대공약수
//X
//문제 이해를 못함
public class Q1850 {
	static long gcd(long a, long b) {
		if(b==0)
			return a;
		return gcd(b, a%b);
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		long a = sc.nextLong();
		long b = sc.nextLong();

		
		long ans = gcd(a, b);
		for(long i=0; i<ans; i++) {
			writer.write("1");
		}
		writer.flush();
	}
}
