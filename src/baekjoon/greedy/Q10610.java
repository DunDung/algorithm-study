package baekjoon.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//30
//X
//문제 이해를 제대로 못함
//주어진 숫자의 수들중 가장 큰수가 30의 배수인지 아닌지를 찾는다.
//30의 배수이려면 끝자리가 0으로 끝나야하고 합이 3의 배수여야 한다.
public class Q10610 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		
		for(int i=0; i<s.length(); i++) {
			sum += s.charAt(i)-'0';
			list.add(s.charAt(i)-'0');
		}
		
		Collections.sort(list);
		if(list.get(0)==0 && sum %3 == 0) {//30의 배수가 맞으면
			for(int i=list.size()-1; i>=0; i--)//출력
				System.out.print(list.get(i));
		}
		else
			System.out.println(-1);
	}
}
