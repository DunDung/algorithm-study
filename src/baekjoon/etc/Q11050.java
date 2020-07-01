package baekjoon.etc;

import java.util.Scanner;

//���� ���1
//n! / k!*(n-k)! 
//���� ��� �˻��� Ǯ��
public class Q11050 {
	static int [] a = new int [100]; 
	static int factorial(int n) {
		if(a[n]!=0)
			return a[n];
		if(n==1||n == 0) //n==1 �� �ؼ� ��� Ʋ�Ⱦ��� ���� ���ǿ� k�� 0�� �ɼ��� ������ n==0�� �־�� ��!
			a[n] = 1;
		else
			a[n] = n*factorial(n-1);
		return a[n];
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), k=scan.nextInt();
		System.out.println(factorial(n)/(factorial(n-k)*factorial(k)));
		scan.close();
	}
}
