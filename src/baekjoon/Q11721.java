package baekjoon;

import java.util.Scanner;

public class Q11721 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int ten =10;
		if(s.length()<=100 && s.length()>0) {
			for(int i=0; i<s.length(); i+=10) {
				if(s.length() < 10)
					ten = s.length();
				System.out.print(s.substring(i, ten));
				ten += 10;
				if(i+10 < s.length())
					System.out.println();
				if(ten > s.length())
					ten = s.length();
			}
		}
	}
}
