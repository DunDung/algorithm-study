package baekjoon;

import java.util.Scanner;

public class Q5597 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] a = new int[30];
		
		for(int i=0; i<28; i++)
			a[scan.nextInt()-1]=1;
		
		for(int i=0;i<a.length; i++)
			if(a[i]==0)
				System.out.println(i+1);
	}
}
