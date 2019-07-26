package baekjoon.math;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//³ª¸ÓÁö
public class Q3052 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<Integer> a = new TreeSet<>();
		for(int i=0; i<10; i++) {
			a.add(scan.nextInt()%42);
		}
		System.out.println(a.size());
	}
}
