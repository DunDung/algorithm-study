package stepByStep;

import java.util.Scanner;

public class Q1065 {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		if(n<=1000) {
			for(int i=1; i<=n; i++) {
				
				if(i>=100) {
					if((i/100 - i%100/10)==(i%100/10 - i%100%10))
						count ++;
				}
				else if(i<100) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
