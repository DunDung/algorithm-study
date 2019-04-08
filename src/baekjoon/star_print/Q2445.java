package baekjoon;

import java.util.Scanner;

//º°Âï±â -8
public class Q2445 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int star = 1;
		int blank = n*2-2;
		for(int i=0; i<n; i++) {
			for(int j=0; j<star; j++)
				System.out.print("*");
			for(int j=0; j<blank; j++) 
				System.out.print(" ");
			for(int j=0; j<star; j++)
				System.out.print("*");
			star++;
			blank-=2;
			System.out.println();
		}
		star-=2;
		blank+=4;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<star; j++)
				System.out.print("*");
			for(int j=0; j<blank; j++) 
				System.out.print(" ");
			for(int j=0; j<star; j++)
				System.out.print("*");
			star--;
			blank+=2;
			System.out.println();
		}
	}

}
