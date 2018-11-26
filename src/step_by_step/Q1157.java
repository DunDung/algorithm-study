package step_by_step;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Q1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		s=s.toUpperCase();
		Map <String, Integer> m = new HashMap<>(); 
		for(int i=0; i<s.length(); i++) {
			if(m.containsKey(s.substring(i, i+1)))
				m.replace(s.substring(i,i+1), m.get(s.substring(i,i+1)), m.get(s.substring(i,i+1))+1);
			else 
				m.put(s.substring(i, i+1), 1);
		}
		int max = m.get(0);
		for(int i=1; i<m.size(); i++) {
			if(max<m.get(i))
				max = m.get(i);
		}
		System.out.println(max);
		
		
		Set<String> z = m.keySet();
		Collection<Integer> c = m.values();
	}
}
