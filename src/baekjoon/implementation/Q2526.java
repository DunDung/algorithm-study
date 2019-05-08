package baekjoon.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//ΩŒ¿Ã≈¨
public class Q2526 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p = scan.nextInt();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		int v = n;
		
		while(true) {
			int k =(v*n) % p;
			if(!list1.contains(k))
				list1.add(k);
			else {
				if(list2.contains(k))
					break;
				else
					list2.add(k);
			}
			v = k;
		
		}
		System.out.println(list2.size());
	}

}
