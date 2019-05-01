package baekjoon.implementation;

import java.util.Scanner;

//사파리 월드
public class Q2420 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		if(a>b) 
			System.out.println(a-b);
		else
			System.out.println(b-a);
	}

}
