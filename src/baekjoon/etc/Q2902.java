package baekjoon.etc;

import java.util.Scanner;

public class Q2902 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		String [] lastName = s.split("-");
		for(String name : lastName)
			System.out.print(name.substring(0, 0+1));
		
	}

}
