package baekjoon.etc;

import java.util.Scanner;

public class Q5622 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int result = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.substring(i, i+1).matches("[A-C]"))
				result+=3;
			else if(s.substring(i, i+1).matches("[D-F]"))
				result+=4;
			else if(s.substring(i, i+1).matches("[G-I]"))
				result+=5;
			else if(s.substring(i, i+1).matches("[J-L]"))
				result+=6;
			else if(s.substring(i, i+1).matches("[M-O]"))
				result+=7;
			else if(s.substring(i, i+1).matches("[P-S]"))
				result+=8;
			else if(s.substring(i, i+1).matches("[T-V]"))
				result+=9;
			else if(s.substring(i, i+1).matches("[W-Z]"))
				result+=10;
		}
		System.out.println(result);
	}
}
