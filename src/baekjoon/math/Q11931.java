package baekjoon.math;


import java.util.*;
import java.io.*;

// 수 정렬하기 4
public class Q11931 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> nums = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			nums.add(Integer.parseInt(br.readLine()) * -1);
		}
		nums.stream()
				.sorted()
				.forEach(a -> builder.append(a * -1 + "\n"));
				
		System.out.println(builder.toString());
	}
}
