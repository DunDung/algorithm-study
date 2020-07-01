package baekjoon.etc;

import java.util.Scanner;

//A+B-3
//����� ������ �˱� ���� ... 
public class Q10950 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
	
		for(int i=0; i<t; i++)
			System.out.println(scan.nextInt()+scan.nextInt());
	}
}
