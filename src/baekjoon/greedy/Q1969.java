package baekjoon.greedy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//DNA
public class Q1969 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		String [] a = new String[n];
		scan.nextLine();
		for(int i=0; i<n; i++) {
			a[i] = scan.nextLine();
		}

		String s = "";

		for(int i=0; i<m; i++) {
			Map<Character, Integer> map = new HashMap<>();
			char c = 'c';
			int max = 0;
			for(int j=0; j<n; j++) {
				if(map.containsKey(a[j].charAt(i))) {
					map.replace(a[j].charAt(i), map.get(a[j].charAt(i)), map.get(a[j].charAt(i))+1);
				} else {
					map.put(a[j].charAt(i), 1);
				}
				if(max < map.get(a[j].charAt(i))) {
					max = map.get(a[j].charAt(i));
					c = a[j].charAt(i);
				} else if(max == map.get(a[j].charAt(i))) {
					c = (a[j].charAt(i)-'A'<c-'A') ? a[j].charAt(i) : c ; 
				}
			}
			s+=c;
		}
		int cnt = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(a[i].charAt(j) != s.charAt(j))
					cnt++;
			}
		}
		System.out.println(s);
		System.out.println(cnt);
	}

}
