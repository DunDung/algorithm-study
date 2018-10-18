package step_by_step;

import java.util.Arrays;
import java.util.Scanner;

public class Q1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n<=1000) {
			int [] a = new int[n];
			for(int i=0; i<n; i++)
				a[i] = scan.nextInt();
				
			double result = 0;
			Arrays.sort(a);
			int max = a[n-1];
			for(int i=0; i<n; i++)
				result += (double)a[i]/max*100;
			
			System.out.printf("%.2f", result/n);
		}
	}
}
