package kakao.T2019;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//3번
//후보키
public class CandidateKey {
	static List<String> list = new ArrayList<>();

	public static void main(String[] args) throws IOException{
		String [][] s = {{"100", "ryan", "music", "2"}, {"200","apeach","math","2"},
				{"300","tube","computer","3"}, {"400","con","computer","4"}, {"500","muzi","music","3"},
				{"600","apeach","music","2"}};
		System.out.println(solution(s));
	}
	public static int solution(String[][] relation) {
		backTrack(relation, "", 0, 0);
		
		int size = list.size();
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(new StringBuilder(list.get(j)).indexOf(list.get(i)) >= 0) {
					System.out.println(list.remove(list.get(j)));
					size--;
					j--;
					System.out.println(size);
				}
			}
		}
		return list.size();
		
	}
	public static void backTrack(String[][] relation, String s, int idx, int cnt) {
		if(idx >= relation[0].length || cnt > relation.length) {
			return;
		}
		if(check(relation, s)) {
			list.add(s);
		}
		backTrack(relation, s+idx, idx+1, cnt+1);
		backTrack(relation, s, idx+1, cnt);
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
