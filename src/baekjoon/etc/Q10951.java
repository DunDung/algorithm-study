package baekjoon.etc;

import java.util.Scanner;

//A+B-4
//�׽�Ʈ ���̽��� ��õǾ� ���� �ʴٸ�
//Scanner Ŭ������ hasNext�� ����ϸ� �ȴ�. true�� X
public class Q10951 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt())
			System.out.println(scan.nextInt()+scan.nextInt());
	}

}
