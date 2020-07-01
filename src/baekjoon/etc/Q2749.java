package baekjoon.etc;

import java.util.Scanner;
//�Ǻ���ġ�� �� 3
//�Ǻ���ġ ���� ���� ���������� �ݵ�� �ֱ⸦ ������, �̸� �ǻ�� �ֱ��� �Ѵ�
//�Ǻ���ġ ���� k=10�� n���̶�� �� �� �ǻ�� �ֱ��15*10��n-1���̴�.
//10�� 6������ ���� �������� ���϶�� ������ �ǻ�� �ֱ�� 1,500,000�̴�.
//���� �Է��� �� �ִ� �ִ밪�� �ƹ��� Ŀ�� 1,500,000��° ������ 10�� 6������ ���� ������ ���� �˸� �� �ڿ��� ����� �ʿ����.
//X
public class Q2749 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();

		int p = 1500000; // �Ǻ���ġ ������ 10^6�� �������� �� �ֱ�

		long[] modArray = new long[p];

		modArray[0] = 0;
		modArray[1] = 1;

		for (int i = 2; i < p; i++) {
			if (i > n) //n�� �ǻ�� �ֱ⺸�� ������ 1,500,000��° ���� ���� �ʿ䵵 ����.
				break;

			modArray[i] = modArray[i - 1] + modArray[i - 2]; //�Ǻ���ġ ���ϴ� ��
			modArray[i] %= 1000000; //1,000,000���� ���� ������ ���ϱ�
		}

		if(n >= p) 
			n %= p; //n % �ǻ�� �ֱ⸦ ���� �ε����� �˾Ƴ���.
		
		System.out.println(modArray[(int)n]); 
	}
}
