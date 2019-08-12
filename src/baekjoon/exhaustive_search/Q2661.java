package baekjoon.exhaustive_search;

import java.util.Scanner;

//좋은 수열
//X
public class Q2661 {
	public static int n;
	
	public static boolean isCheck(String s) {
		int len = s.length();
		int k = 2;
		for(int i=0; i<len/2-1; i++) {
			if(s.substring(len-k, len).equals(s.substring(len-(2*k), len-k))){
				return false;
			}
			k++;
		}
		return true;
	}
	
	public static void backtrack(String s) {
		if(s.length() == n) {
			System.out.println(s);
			System.exit(1);
		}
		for(int i=1; i<=3; i++) {
			if(s.charAt(s.length()-1)-'0' == i) continue;
			if(s.length() < 3) {
				backtrack(s+i);
			}else if(isCheck(s+i)) {
				backtrack(s+i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		backtrack("1");
		
	}

}
