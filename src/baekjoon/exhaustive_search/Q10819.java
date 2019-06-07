package baekjoon.exhaustive_search;

import java.util.Arrays;
import java.util.Scanner;

//차이를 최대로
//X
public class Q10819 {

	public static void swap (int[]a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static boolean nextPermutation(int[]a) {
		int i = a.length-1;
		while(i>0 && a[i] <= a[i-1]) {
			i--;
		}

		if(i <= 0) { //i가 0이면 false
			return false;
		}

		int j = a.length-1;
		while(a[j] <= a[i-1]) {
			j--;
		}
		swap(a, i-1, j);

		j = a.length-1;
		while(i < j) {
			swap(a, i , j);
			j--;
			i++;
		}
		return true;

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];

		for(int i=0; i<n; i++)
			a[i] = scan.nextInt();

		Arrays.sort(a);
		int max = Integer.MIN_VALUE;
		do {
			int sum = 0;
			for(int i=1; i<n; i++) { //센스가 참 부족해
				sum+=Math.abs(a[i] - a[i+1]);
			}
			max = Math.max(max, sum);
		}while(nextPermutation(a));
		System.out.println(max);
	}

}
