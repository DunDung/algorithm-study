package step_by_step;

import java.util.Scanner;

public class Q1193 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int z1 = n/10 + 1;
		int z2 = n%10;
		System.out.print(z1+"/"+z2);
		
	}

}
