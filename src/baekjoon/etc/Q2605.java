package baekjoon.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//�ټ����
public class Q2605 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int t = scan.nextInt();
		int [] a = new int[t];
		for(int i=0; i<t; i++) {
			a[i] = scan.nextInt();
			list.add(a[i], i+1);
		}
		for(int i=list.size()-1; i>=0; i--)
			System.out.print(list.get(i)+" ");
	}
}
