package baekjoon.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Base Conversion
//O
public class Q11576 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int m = scan.nextInt();
		int ten = 0;
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<m; i++) { //10진법으로 변환
			int num = scan.nextInt();
			ten = ten*a+num;
		}
		
		while(ten != 0) {
			list.add(ten%b);
			ten /= b;
		}
		
		for(int i=list.size()-1; i>=0; i--)
			System.out.print(list.get(i)+" ");
	}
}
