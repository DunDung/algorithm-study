package baekjoon;

import java.util.Scanner;

//º°Âï±â -7
public class Q2444 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int star = 1;
		
		for(int i=n; i>0; i--) {
			for(int j=i-1; j>0; j--)
				System.out.print(" ");
			for(int j=0; j<star; j++)
				System.out.print("*");
			System.out.println();
			star += 2;
		}
		star -= 2;
		for(int i=1; i<n; i++) {
			star -= 2;
			for(int j=i; j>0; j--)
				System.out.print(" ");
			for(int j=0; j<star; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
