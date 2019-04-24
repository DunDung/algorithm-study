package baekjoon.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4948 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Boolean> list = new ArrayList<>();
		
		list.add(false); list.add(false);
		
		for(int i=2; i<=123456*2; i++) 
			list.add(i, true);

		//2부터 ~ i*i <= n 각각의 배수들을 지워간다.
		for(int i=2; (i*i)<=123456*2; i++)
			if(list.get(i))
				for(int j=i*i; j<=123456*2; j+=i)
					list.set(j, false);
		while(true) {
			int n =scan.nextInt();
			int count =0;
			if(n==0)
				break;
			for(int i=n+1; i<=2*n; i++){
				if(list.get(i))
					count++;
			}
			System.out.println(count);

		}
	}
}
