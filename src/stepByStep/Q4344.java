package stepByStep;

import java.util.Scanner;

public class Q4344 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		double [] v = new double[c];
		for(int i=0; i<c; i++) {
			int n = scan.nextInt();
			int [] a = new int[n];
			int sum = 0;
			int count =0;
			double avg = 0.0; 
			for(int j=0; j<a.length; j++) {
				a[j] = scan.nextInt();
				sum += a[j];
			}
			avg = (double)sum/a.length;
			for(int j=0; j<a.length; j++) {
				if((double)a[j] > avg)
					count ++;
			}
			v[i] = (double)count/a.length*100;
		}
		for(int i=0; i<v.length; i++) {
			System.out.printf("%.3f", v[i]);
			System.out.println("%");
		}
	}
}