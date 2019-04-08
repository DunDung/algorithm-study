package baekjoon;

import java.util.Scanner;
//A+B -7
public class Q11021 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
	
		for(int i=0; i<t; i++)
			System.out.println("Case #"+ (i+1) +": "+ (scan.nextInt()+scan.nextInt()));
	}
}