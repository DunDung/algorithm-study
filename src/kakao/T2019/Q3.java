package kakao.T2019;

import java.util.*;

//ÈÄº¸Å°
//X
public class Q3 {
	static List<Integer> list = new ArrayList<>();

	public static int solution(String[][] relation) {
		dfs(relation, "", -1);
		int answer = 0;
		Collections.sort(list);
        while(!list.isEmpty()) {
        	int v = list.remove(0);
        	answer++;
        	Iterator<Integer> it = list.iterator();
        	while(it.hasNext()) {
        		int next = it.next();
        		if((next&v) == v) {
        			it.remove();
        		}
        	}
        }
		return answer;

	}
	public static void dfs(String[][] relation, String s, int idx) {
		if(idx == relation[0].length-1) {
			if(check(relation, s)) {
				int now = 0;
				for(int i=0; i<s.length(); i++) {
					now |= 1<<(s.charAt(i)-'0');
				}
				list.add(now);
			}
			return;
		}
		dfs(relation, s+(idx+1), idx+1);
		dfs(relation, s, idx+1);
	}
	
	public static boolean check(String[][] relation, String s) {
		Set<String> set = new TreeSet<>();
		for(int i=0; i<relation.length; i++) {
			StringBuilder sb = new StringBuilder();
			for(int j=0; j<s.length(); j++) {
				sb.append(relation[i][s.charAt(j)-'0']);
			}
			set.add(sb.toString());
		}
		if(set.size()==relation.length) return true;
		return false;
	}
}
