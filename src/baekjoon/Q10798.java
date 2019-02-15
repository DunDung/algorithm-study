package baekjoon;

import java.util.Scanner;

public class Q10798 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] s = new String[5];
		for(int i=0; i<5; i++) 
			s[i] = scan.next();

		for(int i=0; i<10; i++)
			for(int j=0; j<s.length; j++) {
				System.out.print(s[j].charAt(i));
			}
	}
}
