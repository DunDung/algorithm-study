package baekjoon.star_print;

import java.util.Scanner;

//º°Âï±â  -17
public class Q10992 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int blank1 = n-1;
		int blank2 = 1;
		int star = (n*2)-1;

		for(int i=0; i<n-1; i++) {
			for(int j=0; j<blank1; j++)
				System.out.print(" ");
			System.out.print("*");
			if(i>0) {
				for(int j=0; j<blank2; j++)
					System.out.print(" ");
				System.out.print("*");
				blank2+=2;
			}
			System.out.println();
			blank1 --;
		}
		for(int i=0; i<star; i++)
			System.out.print("*");
	}

}

