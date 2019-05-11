package baekjoon.samsung;

import java.util.Arrays;
import java.util.Scanner;

//°ø
public class Q1547 {
	static void swap(int [] arr, int a, int b) {
		int x=0, y=0;
		for(int i=0; i<3; i++) {
			if(arr[i] == a)
				x = i;
			if(arr[i] == b)
				y = i;
		}
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int [] arr = {1, 2 ,3};
		
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			swap(arr, a, b);
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(arr[0]);

	}

}
