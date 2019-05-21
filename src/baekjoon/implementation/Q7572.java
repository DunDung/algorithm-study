package baekjoon.implementation;

import java.util.Scanner;

//°£Áö
public class Q7572 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String [] s1 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String [] s2 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};

		n-=2013;
		int index1 = 9;
		int index2 = 5;
		
		if(n>0) {
			index1 = (index1+n)%10 ;
			index2 = (index2+n)%12 ;
		}
		if(n<0) {
			while(n<0) {
				index1--;
				index2--;
				n++;
				if(index1<0) {
					index1 = 9;
				}
				if(index2<0) {
					index2 = 11;
				}
			}
		}
		System.out.print(s2[index2]+s1[index1]);
		
	}
}