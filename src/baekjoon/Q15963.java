package baekjoon;

import java.util.Scanner;

//CASIO
//int로 해서 틀렸었음
public class Q15963 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong(); long m = scan.nextLong();
		if(n==m)
			System.out.println(1);
		else
			System.out.println(0);
	}
}
