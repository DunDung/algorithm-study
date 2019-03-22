package baekjoon;

import java.util.Scanner;
//피보나치의 수 3
//피보나치 수를 나눈 나머지들은 반드시 주기를 가지며, 이를 피사노 주기라고 한다
//피보나치 수를 k=10의 n승이라고 할 때 피사노 주기는15*10의n-1승이다.
//10의 6승으로 나눈 나머지를 구하라고 했으니 피사노 주기는 1,500,000이다.
//따라서 입력할 수 있는 최대값이 아무리 커도 1,500,000번째 까지의 10의 6승으로 나는 나머지 값만 알면 그 뒤에는 계산할 필요없다.
public class Q2749 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();

		int p = 1500000; // 피보나치 수열을 10^6로 나누었을 때 주기

		long[] modArray = new long[p];

		modArray[0] = 0;
		modArray[1] = 1;

		for (int i = 2; i < p; i++) {
			if (i > n) //n이 피사노 주기보다 작으면 1,500,000번째 까지 구할 필요도 없다.
				break;

			modArray[i] = modArray[i - 1] + modArray[i - 2]; //피보나치 구하는 법
			modArray[i] %= 1000000;
		}

		if(n >= p) {
			n %= p;
		}

		System.out.println(modArray[(int)n]);

	}

}
