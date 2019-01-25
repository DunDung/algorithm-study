package baekjoon;

import java.util.Scanner;

public class Q10809 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		int [] n = new int[a.length];
		String s = scan.next();
		for(int i=0; i<a.length; i++) {
			if(s.contains(a[i])) 
				n[i] = s.indexOf(a[i]);
			else
				n[i] = -1;
			System.out.print(n[i]+ " ");
		}
	}
}
