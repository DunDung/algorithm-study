package baekjoon.etc;

import java.util.Scanner;

public class Q1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if(s.trim().length() == 0)
			System.out.println("0");
		else {
			String [] a = s.trim().split(" ");
			System.out.println(a.length);
		}
	}
}
