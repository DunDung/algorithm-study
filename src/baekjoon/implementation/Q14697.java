package baekjoon.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//방 배정하기
public class Q14697 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int n = scan.nextInt();
		int ans = 0;
		
		for(int i=0; i<=50; i++)
			for(int j=0; j<=50; j++)
				for(int k=0; k<=50; k++)
					if((a*i) + (b*j) + (c*k) == n)
						ans=1;
		
		System.out.println(ans);
	}
}
