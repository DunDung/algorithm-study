package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//K번째 수
//입출력이 큰 문제에서는 Scanner로 절대 못맞춘다.
//StringTokenizer를 기억하자. 한줄마다 new 해줘야 한다.
//X
public class Q11004 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken()); 
		int k = Integer.parseInt(st.nextToken()); 
		int [] array = new int[n];
		
		st = new StringTokenizer(reader.readLine());
		for(int i=0; i<n; i++)
			array[i] = Integer.parseInt(st.nextToken());
		Arrays.parallelSort(array);
		System.out.println(array[k-1]);
		
	}

}
