package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//에라토스테네스의 체
public class EratosthenesSieve {
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		List<Boolean> list = new ArrayList<>();
		
		int n =scan.nextInt();
		
		//0,1을 소수가 아님으로 처리
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
		
		for(int i=2; i<=n; i++)
			if(list.get(i))
				System.out.println(i+" ");
	}
}
