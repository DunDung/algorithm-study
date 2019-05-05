package baekjoon.implementation;

import java.util.Scanner;

//쉽게 푸는 문제
public class Q1292 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] a = new int[1001];
		int start = scan.nextInt();
		int end = scan.nextInt();
		int index = 1;
		int num = 1;
		
		while(index<1001) {
			for(int i=0; i<num; i++) {
				if(index>1000)
					break;
				a[index++] = num;
			}
			num++;
		}

		int sum = 0;
		for(int i=start; i<=end; i++)
			sum+=a[i];
		System.out.println(sum);
	}

}
