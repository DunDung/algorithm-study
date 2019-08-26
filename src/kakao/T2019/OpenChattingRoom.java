package kakao.T2019;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//1번
//오픈채팅방
public class OpenChattingRoom {

	public String[] solution(String[] record) {
		Map<String, String> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<record.length; i++) {
			String [] s = record[i].split(" ");
			if(s[0].equals("Enter") || s[0].equals("Change")) {
				if(map.containsKey(s[1])) {
					map.replace(s[1], s[2]);
				} else {
					map.put(s[1], s[2]);
				}
			}
		}
		List<String> list = new ArrayList<>();
		for(int i=0; i<record.length; i++) {
			String [] s = record[i].split(" ");
			if(s[0].equals("Enter")) {
				list.add(map.get(s[1])+"님이 들어왔습니다.");
			} else if(s[0].equals("Leave")) {
				list.add(map.get(s[1])+"님이 나갔습니다.");
			}
		}
		String [] answer = list.toArray(new String[list.size()]);
		return answer;
	}

}
