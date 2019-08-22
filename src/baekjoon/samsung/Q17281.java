package baekjoon.samsung;

import java.io.*;
import java.util.*;

//야구공
//X
public class Q17281 {
	public static boolean [] visited = new boolean[10];
	public static List<String> list = new ArrayList<>();
	public static int [] order = new int[9];
	public static int n;
	public static int [][] a;
	public static int ans = 0;

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(reader.readLine());
		a = new int[n][9];

		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			for(int j=0; j<9; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		backtrack(0);
		System.out.println(ans);
	}
	public static void playBall() {
		int score = 0;
		int inning = 0;//이닝 수
		int num = 0;//선수 순서
		int out = 0;
		boolean [] roo = new boolean[4];
		while(inning < n) {
			int v = a[inning][order[num]];
			num = (num+1)%9;
			if (v == 1) { // 1루타
                if(roo[3]) {
                    score++;
                    roo[3]=false;
                }
                for(int r=2;r>=1;r--) {
                    if(roo[r]) {
                        roo[r]=false;
                        roo[r+1]=true;
                    }
                }
                roo[1]=true;
            } else if (v == 2) { // 2루타
                if(roo[3]) {
                    score++;
                    roo[3]=false;
                }
                if(roo[2]) {
                    score++;
                    roo[2]=false;
                }
                if(roo[1]) {
                    roo[1]=false;
                    roo[3]=true;
                }
                roo[2]=true;

            } else if (v == 3) { // 3루타
                for(int r=1;r<=3;r++) {
                    if(roo[r]) {
                        score++;
                        roo[r]=false;
                    }
                }
                roo[3] = true;
            } else if (v == 4) { // 홈런
                for(int r=1;r<=3;r++) {
                    if(roo[r]) {
                        score++;
                        roo[r]=false;
                    }
                }
                score++; 
            } else if (v == 0) { // 아웃
                out++;
                if (out == 3) {
                	out = 0;
                	inning++;
                	Arrays.fill(roo, false);
                }
            }
		}
		ans = Math.max(ans, score);
	}
	public static void backtrack(int num) {
		if(num == 9) {
			playBall();
			return;
		}
		if(num==3) {
			order[3] = 0;
			backtrack(num+1);
			return;
		}
		for(int i=1; i<9; i++) {
			if(!visited[i]) {
				visited[i] = true;
				order[num] = i;
				backtrack(num+1);
				visited[i] = false;
			}
		}
	}
}
