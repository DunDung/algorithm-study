package baekjoon.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2490 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int count = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) 
				if(scan.nextInt() == 0)
					count++;
			list.add(count);
			count = 0;
		}
		
		for(int n : list)
			switch(n) {
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
			case 0:
				System.out.println("E");
				break;
			}
	}
}
