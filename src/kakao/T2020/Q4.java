package kakao.T2020;

import java.util.*;

class Pos implements Comparable<Pos>{
	int idx;
	int x;
	int y;
	int size;
	String word;
	public Pos(int idx, int x, int y, int size, String word) {
		this.idx = idx;
		this.x = x;
		this.y = y;
		this.size = size;
		this.word = word;
	}
	@Override
	public int compareTo(Pos o) {
		return this.word.length()-o.word.length();
	}
}
class Comp implements Comparator<String>{
	public int compare(String a, String b) {
		return a.length() - b.length();
	}
}
public class Q4 {
	public static void main(String[] args) {
		String[]a = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
		String[]b = {"fro??", "????o", "fr???", "fro???", "pro?"};
		System.out.println(Arrays.toString(solution(a, b)));
	}
	public static int[] solution(String[] words, String[] queries) {
		List<Pos> list = new ArrayList<>();
		for(int i=0; i<queries.length; i++) {
			int start = queries[i].indexOf("?");
			int end = queries[i].lastIndexOf("?");
			if(start == 0) {
				list.add(new Pos(i, end+1, queries[i].length(), queries[i].length(), queries[i]));
			} else {
				list.add(new Pos(i, 0, start, queries[i].length(), queries[i]));
			}
		}
		Arrays.sort(words, new Comp());
		Collections.sort(list);
		int[] answer = new int[queries.length];
		for(int i=0; i<list.size(); i++) {
			int x = list.get(i).x;
			int y = list.get(i).y;
			int size = list.get(i).size;
			for(int j=0; j<words.length; j++) {
				if(size < words[j].length()) break;
				if(size == words[j].length()&&words[j].substring(x, y).equals(list.get(i).word.substring(x, y))) {
					answer[list.get(i).idx]++;
				}
			}
		}
		return answer;
	}
}
