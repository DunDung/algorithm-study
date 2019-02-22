package baekjoon;

import java.util.Scanner;

public class Q2935 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String operator = scan.next();
		String b = scan.next();
		int acount = 0;
		int bcount = 0;
		
		for(int i=0; i<a.length(); i++) 
			if(a.substring(i,i+1).equals("0"))
				acount++;
		for(int i=0; i<b.length(); i++) 
			if(b.substring(i,i+1).equals("0"))
				bcount++;
		
			
		if(operator.equals("+")) {
			if(acount<bcount) {
				int index = b.length()-acount-1;
				StringBuilder s = new StringBuilder(b);
				s.replace(index, index+1, "1");
				System.out.println(s.toString());

			}
			else if(acount == bcount) {
				for(int i=0; i<a.length(); i++)
					if(a.substring(i, i+1).equals("1")) {
						System.out.print("2");
						for(int j=0; j<acount; j++)
							System.out.print("0");
					}
			}
			else {
				int index = a.length()-bcount-1;
				StringBuilder s = new StringBuilder(a);
				s.replace(index, index+1, "1");
				System.out.println(s.toString());
			}
		}
		else {
			StringBuilder s = new StringBuilder(a);
			for(int i=0; i<bcount; i++)
				s.append("0");
			System.out.println(s.toString());
		}
	}
}
