package baekjoon;

import java.util.Scanner;

//�� ��� -16
public class Q10991 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int blank = n-1;
		int star = 1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<blank; j++)
				System.out.print(" ");
			for(int j=0; j<star; j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
			blank--;
			star++;
		}
			
	}

}
