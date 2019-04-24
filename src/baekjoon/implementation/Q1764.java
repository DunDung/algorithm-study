package baekjoon.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Q1764 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		String[] s = new String[n];
		List<String> list2 = new ArrayList<>();
		for(int i=0; i<n; i++)
			s[i]=scan.next();
		Arrays.sort(s);
		for(int i=0; i<m; i++) {
			String v = scan.next();
			if(Arrays.binarySearch(s, v)>=0)
				list2.add(v);
		}
		
		Collections.sort(list2);
		System.out.println(list2.size());
		for(String v : list2)
			System.out.println(v);
	}
}
