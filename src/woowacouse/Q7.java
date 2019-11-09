package woowacouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q7 {

	public static void main(String[] args) {

	}
	public String[] solution(String user, String[][] friends, String[] visitors) {
		Set<String> userFriends = new HashSet<>();
		for(int i=0; i<friends.length; i++) {
			if(friends[i][0].equals(user)) {
				userFriends.add(friends[i][1]);
			}
			if(friends[i][1].equals(user)) {
				userFriends.add(friends[i][0]);
			}
		}

		Map<String, Integer> scoreMap = new HashMap<>();
		for(int i=0; i<friends.length; i++) {
			String friend = null;
			if(userFriends.contains(friends[i][0])) {
				friend = friends[i][1];
			}
			if(userFriends.contains(friends[i][1])) {
				friend = friends[i][0];
			}
			if(friend != null && !friend.equals(user)) {
				if(scoreMap.containsKey(friend)) {
					scoreMap.replace(friend, scoreMap.get(friend)+10);
				} else {
					scoreMap.put(friend, 10);
				}
			}
		}
		
		for(String visitor : visitors) {
			if(!userFriends.contains(visitor)) {
				if(scoreMap.containsKey(visitor)) {
					scoreMap.replace(visitor, scoreMap.get(visitor)+1);
				} else {
					scoreMap.put(visitor, 1);
				}
			}
		}
		
		List<RecomendFriend> recomendFrinedList = new ArrayList<>();
		for(Map.Entry<String, Integer> entryMap : scoreMap.entrySet()){
			recomendFrinedList.add(new RecomendFriend( entryMap.getKey(),entryMap.getValue())); 
		}
		
		Collections.sort(recomendFrinedList);
		
		int length = recomendFrinedList.size()>5 ? 5 : recomendFrinedList.size();
		String[] answer = new String[length];
		for(int i=0; i<length; i++) {
			answer[i] = recomendFrinedList.get(i).name;
		}
		return answer;
	}
}
class RecomendFriend implements Comparable<RecomendFriend>{
	String name;
	int score;
	
	public RecomendFriend(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public int compareTo(RecomendFriend other) {
		int r = this.score - other.score *-1;
		if(r==0) {
			r = this.name.compareTo(other.name);
		}
		return r;
	}
}
