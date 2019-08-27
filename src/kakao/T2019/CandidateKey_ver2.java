package kakao.T2019;

import java.util.*;

//후보키
//빠르고 깔끔
public class CandidateKey_ver2 {
	
	public static int solution(String[][] relation) {
		int n = relation.length;
		int m = relation[0].length;
		List<Integer> ans = new ArrayList<>();
		for(int i=1; i<=(1<<m)-1; i++) { //1부터 전체집합 (1<<m)-1까지
			Set<String> set = new HashSet<>();
			for(int j=0; j<n; j++) {
				StringBuilder sb = new StringBuilder();
				for(int k=0; k<m; k++) {
					if((i&(1<<k)) > 0) { //정수 k가 비트마스크i에 포함되어있다면
						sb.append(relation[j][k]);
					}
				}
				set.add(sb.toString());
			}
			if(set.size()==n && check(ans, i)) {
				ans.add(i);
			}
		}
		return ans.size();
	}
	public static boolean check(List<Integer> ans, int now) { //최소성검사
		for(int i=0; i<ans.size(); i++) {
			if((ans.get(i)&now)==ans.get(i)) {
				return false;
			}
		}
		return true;
	}
}
