package step_by_step;

import java.util.Scanner;

public class Q2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			int a = scan.nextInt();
			String s = scan.next();
			for(int z = 0; z<s.length(); z++) {
				for(int j=0; j<a; j++) {
					System.out.print(s.substring(z, z+1));
				}
			}
			System.out.println();
		}

	}
}
