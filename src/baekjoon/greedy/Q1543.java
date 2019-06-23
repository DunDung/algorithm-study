package baekjoon.greedy;

import java.util.Scanner;

//문서 검색
public class Q1543 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		int ans = 0;
		
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)==b.charAt(0)) {
				boolean ok = true;
				for(int j=0; j<b.length(); j++) {
					if(i+j >= a.length() || a.charAt(i+j) != b.charAt(j)) {
						ok = false;
						break;
					}
				}
				if(ok) {
					ans++;
					i+=b.length()-1;
				}
			}
		}
		System.out.println(ans);
	}

}
