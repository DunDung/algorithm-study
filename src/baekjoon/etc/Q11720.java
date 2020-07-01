package baekjoon.etc;

import java.util.Scanner;

public class Q11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = 0;
		if(n>=1 && n<=100) {
			String s = scan.next();

			if(s.length() == n) {
				for(int i=0; i<n; i++) 
					result +=Integer.parseInt(s.substring(i,i+1)); //IntegerŬ������ parseInt�޼ҵ带 ���� String->int�� �ٲ��.
				System.out.println(result);
			}
		}
	}
}

