package baekjoon.exhaustive_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//야구공
public class Q17281 {
	public static boolean [] visited = new boolean[10];
	public static List<String> list = new ArrayList<>();
	public static int n;
	public static int [][] a;
	public static int ans = 0;

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(reader.readLine());
		a = new int[n][9];

		for(int i=0; i<n; i++) {
			String [] input = reader.readLine().split(" ");
			for(int j=0; j<9; j++) {
				a[i][j] = Integer.parseInt(input[j]);
			}
		}
		backtrack("");
		System.out.println(ans);
		}
	public static void play(String t) {
			int score = 0;
			int inning = 0;//이닝 수
			int cnt = 0;//선수 순서
			int out = 0;
			Stack<Integer> s = new Stack<>();
			while(inning < n) {
				int v = a[inning][t.charAt(cnt)-'0'];
				cnt = (cnt+1)%9;
				if(v==0) {
					out++;
					if(out>=3) {
						inning++;
						out = 0;
						s.clear();
					}
				} else if(v==4){
					score += s.size()+1;
					s.clear();
				} else {
					int size = s.size();
					while(size--> 0) {
						int k = s.pop();
						if(k+v>=4) {
							score++;
						} else {
							s.push(k+v);
						}
					}
					s.push(v);
				}
			}
			ans = Math.max(ans, score);
	}
	public static void backtrack(String s) {
		if(s.length() == 8) {
			play(new StringBuilder(s).insert(3, "0").toString());
			return;
		}
		for(int i=1; i<9; i++) {
			if(!visited[i]) {
				visited[i] = true;
				backtrack(s+i);
				visited[i] = false;
			}
		}
	}
}
