package step_by_step;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Q1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		s=s.toUpperCase();
		Map<String, Integer> m = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			if(!m.containsKey(s.substring(i, i+1)))
				m.put(s.substring(i, i+1), 1);
			else
				m.replace(s.substring(i, i+1), m.get(s.substring(i, i+1)), m.get(s.substring(i, i+1))+1);
		}
		Iterator<Entry<String, Integer>> itr = m.entrySet().iterator();
		int max = 0;
		String r = null;
		while(itr.hasNext()) {
			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>)itr.next();
			if(max<e.getValue()) {
				max = e.getValue();
				r = e.getKey();
			}
		}
		m.remove(r);
		if(m.containsValue(max))
			System.out.println("?");
		else
			System.out.println(r);
	}
}
