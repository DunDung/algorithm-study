package baekjoon.etc;

import java.util.Scanner;

public class Q2941 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		StringBuilder b = new StringBuilder(s);
		int result = 0;
		for(int i=0; i<s.length(); i++) {
				if(s.substring(i, i+1).equals("=")){
					if(s.substring(i-1,i).matches("[csz]"))
						result++;
					if(i>=2) {
						if(s.substring(i-2,i).equals("dz")) {
							result++;
						}
					}
				}
				if(s.substring(i,i+1).equals("-"))
					if(s.substring(i-1, i).matches("[cd]")) 
						result++;
				
				if(s.substring(i,i+1).equals("j"))
						if(s.substring(i-1, i).matches("[ln]"))
							result++;
			}

		System.out.println(s.length()-result);
	}
}
