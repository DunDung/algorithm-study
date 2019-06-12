package baekjoon.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//LCS
public class Q9251 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		List<Integer> a = new ArrayList<>();
		int cnt = 0;
		for(int k=0; k<s1.length(); k++) {
			int index = 0;
			cnt = 0;
			for(int i=k; i<s1.length(); i++) {
				for(int j=index; j<s2.length(); j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						index = j;
						cnt++;
						break;
					}
				}
			}
			a.add(cnt);
		}
		Collections.sort(a);
		System.out.println(a.get(a.size()-1));
	}
}
