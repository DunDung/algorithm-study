package baekjoon;

import java.util.Scanner;

public class Q15873 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		if(s.length()==4)
			System.out.println(Integer.parseInt(s.substring(0,2))+Integer.parseInt(s.substring(2,4)));
		else if(s.length()==3)
			if(s.indexOf("0")==1)
				System.out.println(Integer.parseInt(s.substring(0,2))+Integer.parseInt(s.substring(2,3)));
			else
				System.out.println(Integer.parseInt(s.substring(0,1))+Integer.parseInt(s.substring(1,3)));
		else
			System.out.println(Integer.parseInt(s.substring(0,1))+Integer.parseInt(s.substring(1,2)));
	}
}
