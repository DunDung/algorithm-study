package baekjoon;

import java.util.Scanner;

//A+B -5
public class Q10952 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if(a==0 && b==0)
				break;
			
			System.out.println(a+b);
		}
	}
}
