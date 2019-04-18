package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

//ATM
//O
//그리디 알고리즘..? 아직 모름
public class Q11399 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		sum += arr[0];
		for(int i=1; i<n; i++) {
			arr[i] += arr[i-1];
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
