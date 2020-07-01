package baekjoon.etc;

import java.util.Scanner;

//A+B -6
public class Q10953 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			String [] s = scan.next().split(",");
			System.out.println(Integer.parseInt(s[0])+Integer.parseInt(s[1]));
		}
	}

}
