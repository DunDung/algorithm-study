package baekjoon.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1747 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		List<Boolean> list = new ArrayList<>();
		int n =scan.nextInt();
		
		//0,1�� �Ҽ��� �ƴ����� ó��
		list.add(false);
		list.add(false);
		//2~n���� �Ҽ��� ����
		for(int i=2; i<=1100000; i++) 
			list.add(i, true);
		//2���� ~ i*i <= n ������ ������� ��������.
		for(int i=2; (i*i)<=1100000; i++)
			if(list.get(i))
				for(int j=i*i; j<=1100000; j+=i)
					list.set(j, false);
		for(int i=n; i<=1100000; i++)
			if(list.get(i)) {
				StringBuilder s = new StringBuilder(String.valueOf(i));
				if(s.toString().equals(s.reverse().toString())) {
						System.out.println(Integer.parseInt(s.toString()));
						break;
				}
			}
	}
}
