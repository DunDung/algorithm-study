package stepByStep;

import java.util.Scanner;

public class Q2581 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int min = 10001;
		int sum = 0;
		boolean stop = false;
		
		for(int i=m; i<=n; i++) {
			if(i<2)
				continue;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					stop = true;
					break;
				}
			}
			if(!stop) {
				sum+=i;
				if(min>i)
					min = i;
			}
			stop = false;
		}
		if(sum == 0 && min==10001)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);

		}
	}
}
