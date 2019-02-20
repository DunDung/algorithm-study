package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Q1159 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int count = 0;
		List<String>list = new ArrayList<>();
		Map<String, Integer> m = new HashMap<>();
		
		for(int i=0; i<t; i++) {
			String s = scan.next();
			if(!m.containsKey(s.substring(0, 1)))
				m.put(s.substring(0, 1), 1);
			else
				m.replace(s.substring(0, 1), m.get(s.substring(0, 1))+1);
			if(m.get(s.substring(0, 1))%5==0) {
				list.add(s.substring(0, 1));
				count++;
			}
		}
		if(count ==0)
			System.out.print("PREDAJA");
		else {
			Collections.sort(list);
			for(String s :list)
				System.out.print(s);
		}
	}
}
