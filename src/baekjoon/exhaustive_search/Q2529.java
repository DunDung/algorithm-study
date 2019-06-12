package baekjoon.exhaustive_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2529 {
	static List<String> list = new ArrayList<>();
	public static boolean check(String key, String [] s) {
		for(int i=1; i<key.length(); i++) {
			if(s[i-1].equals("<")) {
				if(!(key.charAt(i-1)-'0' < key.charAt(i)-'0')) {
					return false;
				}
			}
			else {
				if(!(key.charAt(i-1)-'0' > key.charAt(i)-'0')) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void go(String [] a, String[] s, String key, int i, int size){
		System.out.println(key);
		if(key.length() == size) {
			if(check(key, s)) {
				list.add(key);
			}
			return;
		}
		if(key.length() > size || i>9)
			return;
		go(a, s, key+a[i], i+1, size);
		go(a, s, key, i+1, size);
		i-=1;
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String [] s = scan.nextLine().split(" ");
		String [] a = new String[10];
		for(int i=0; i<=9; i++)
			a[i] = i+"";
		go(a, s, "", 0, n+1);
		System.out.println(list.toString());
	}

}
