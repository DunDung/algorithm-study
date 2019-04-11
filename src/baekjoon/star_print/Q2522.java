package baekjoon.star_print;

import java.util.Scanner;

//º°Âï±â -12
public class Q2522 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int blank = n-1;
		int star = 1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<blank; j++)
				System.out.print(" ");
			for(int j=0; j<star; j++)
				System.out.print("*");
			System.out.println();
			blank--;
			star++;
		}
		blank+=2;
		star -= 2;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<blank; j++)
				System.out.print(" ");
			for(int j=0; j<star; j++)
				System.out.print("*");
			System.out.println();
			blank++;
			star--;
		}
			
	}

}
