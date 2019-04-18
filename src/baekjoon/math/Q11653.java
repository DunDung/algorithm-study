package baekjoon.math;

import java.util.Scanner;

//소인수 분해
//X
public class Q11653 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
	
		for(int i=2; i*i<=n; i++)
			while(n%i == 0) {
					System.out.println(i);
					n /= i;
				}
		
		if(n>1)//인수가 루트n보다 큰경우
			System.out.println(n);
	}

}
