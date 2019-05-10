package baekjoon.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//잃어버린 괄호
//-뒤에를 묶는다.
//X
public class Q1541 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		List<Integer> sign = new ArrayList<>();
		List<Integer> list = new ArrayList<>();

		String k = "";
		sign.add(1); //처음엔 플러스를 넣어준다.
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='+'||s.charAt(i)=='-') {
				if(s.charAt(i)=='+')
					sign.add(1);
				else if(s.charAt(i)=='-')
					sign.add(-1);
				list.add(Integer.parseInt(k));
				k = "";
			} else {
				k += s.substring(i,i+1);
			}
		}
		
		list.add(Integer.parseInt(k)); //마지막 수를 저장
		int ans = 0;
		boolean minus = false;
		for(int i=0; i<list.size(); i++) {
			if(sign.get(i) == -1)
				minus = true;
			
			if(minus)
				ans -= list.get(i);
			else
				ans += list.get(i);
		}
		System.out.println(ans);
	}

}
