package baekjoon.etc;

import java.util.Scanner;

//�м�ã��
//X
public class Q1193 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		int sum = 0;
		int n=0;
		int b =0;
		while(sum<a){
			n++;
			sum = sum + n;
		}
		b = a - sum + n;
		if((n+1)%2==0){
			System.out.println(n+1-b+"/"+b);
		}
		else{
			System.out.println(b+"/"+(n+1-b));
		}
	}
}