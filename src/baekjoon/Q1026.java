package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1026 {
//	static void swap(int []a, int i, int j) {
//		int temp = a[i];
//		a[i] = a[j];
//		a[j] = temp;
//	}
//	static void bubbleSort(int [] a) {
//		for(int i=a.length-1; i>=1; i--) {
//			boolean finish = true;
//			for(int j=0; j<i; j++) {
//				if(a[j]<a[j+1]) {
//					swap(a, j, j+1);
//					finish=false;
//				}	
//			}
//			if(finish)
//				break;
//		}
//	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];
		int [] b = new int[n];
		int sum = 0;

		for(int i=0; i<n; i++)
			a[i] = scan.nextInt();
		for(int i=0; i<n; i++)
			b[i] = scan.nextInt()*-1; //b배열에 입력받을 때 -1 곱해주기

		Arrays.sort(a);
		Arrays.parallelSort(b);
		
		for(int i=0; i<n; i++)
			sum += a[i]*(b[i]*-1);

		System.out.println(sum);
	}
}
