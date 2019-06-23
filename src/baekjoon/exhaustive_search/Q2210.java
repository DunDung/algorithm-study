package baekjoon.exhaustive_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//숫자판 점프
//x
public class Q2210 {

	static int [] dx = {1, -1, 0, 0};
	static int [] dy = {0, 0, 1, -1};
	
	public static void backtrack(int[][]a, List<String> ans, String str, int x, int y) {
		if(str.length()==6) {
			if(!ans.contains(str)) {
				ans.add(str);
			}
			return;
		}

		for(int k=0; k<4; k++) {
			if(x+dx[k] >=0 && x+dx[k]<5 && y+dy[k]>=0 && y+dy[k]<5) {
				backtrack(a, ans, str+a[x+dx[k]][y+dy[k]], x+dx[k], y+dy[k]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][] a = new int[5][5];
		List<String> ans = new ArrayList<>();

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				backtrack(a, ans, a[i][j]+"", i, j);
			}
		}
		System.out.println(ans.size());
	}
}
