package step_by_step;

import java.util.Scanner;

public class Q2440 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count =0;
		for(int i=n; i>0; i--) {
			for(int j=i; j>0; j--) 
				System.out.print("*");
		if(i != 1)	
			System.out.println();
		}
	}
}
