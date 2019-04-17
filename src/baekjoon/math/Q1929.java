package baekjoon.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1929 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m =scan.nextInt();
		int n =scan.nextInt();
		
		List<Boolean> list = new ArrayList<>();
		list.add(false);
		list.add(false);
		
		//2~n까지 소수로 설정
		for(int i=2; i<=n; i++) 
			list.add(i, true);
		
		//2부터 ~ i*i <= n 각각의 배수들을 지워간다.
		for(int i=2; (i*i)<=n; i++)
			if(list.get(i))
				for(int j=i*i; j<=n; j+=i)
					list.set(j, false);
		
		for(int i=m; i<=n; i++){
			if(list.get(i))
				System.out.println(i);
		}
	}
}
