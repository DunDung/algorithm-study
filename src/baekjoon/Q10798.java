package baekjoon;

import java.util.Scanner;

public class Q10798 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] s = new String[5];
		for(int i=0; i<5; i++) 
			s[i] = scan.next();
		int maxLength = maxLength(s);
		for(int i=0; i<maxLength; i++)
			for(int j=0; j<s.length; j++) {
				if(i>=s[j].length())
					continue;
				
				System.out.print(s[j].charAt(i));
			}
	}
	static int maxLength(String [] s) {
		int max = s[0].length();
		for(int i=1; i<s.length; i++)
			if(s[i].length()>max)
				max = s[i].length();
		return max;
	}
}
