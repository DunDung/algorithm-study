package kakao.T2019;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//¿ÀÇÂÃ¤ÆÃ¹æ
public class Q1 {

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
				list.add(map.get(s[1])+"´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.");
			} else if(s[0].equals("Leave")) {
				list.add(map.get(s[1])+"´ÔÀÌ ³ª°¬½À´Ï´Ù.");
			}
		}
		String [] answer = list.toArray(new String[list.size()]);
		return answer;
	}

}
