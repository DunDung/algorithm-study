package baekjoon.etc;

import java.util.Scanner;

//�����۽� ����
//�ܰ躰���� ť
//O
public class Q11866 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int index = 1;
		int [] q = new int[n+1];
		StringBuilder builder = new StringBuilder("<");

		for(int i=1; i<=n; i++)
			q[i] = i;

		for(int i=0; i<n; i++) {
			int count = 1;
			while(true) {
				if(index>n) //���� ť�̱� ������ n���� ũ�� %����
					index %= n;

				if(count == m) { //m�� ° ����� ���
					if(q[index]==0) { //m��° ��������� 0�ΰ��
						index++; //�ε��� �߰�
						continue;
					}
					builder.append(q[index]);
					q[index] = 0;
					break;
				}
				else if(q[index]!=0) { //0�� �ƴϸ� ī��Ʈ �� �ε��� ++
					index++;
					count++;
				}
				else if(q[index]==0) {
					index++;
					continue;
				}
			}
			if(i!=n-1)
				builder.append(", ");
		}
		scan.close();
		builder.append(">");
		System.out.println(builder.toString());
	}
}

