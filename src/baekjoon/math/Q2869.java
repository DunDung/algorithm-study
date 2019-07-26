package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//달팽이는 올라가고 싶다
public class Q2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long v = Long.parseLong(st.nextToken());

		v-=a;
		long result = v/(a-b)+1;
		if(v%(a-b) > 0) {
			System.out.println(result+1);
		} else {
			System.out.println(result);
		}
	}

}
