package baekjoon.samsung;

import java.util.*;
import java.io.*;

// 아기 상어
// 2019.12.18
public class Q16236 {
	static int n;
	static int[][] map;
	static int sharkSize = 2;
	static int nowSizeEatFishCount = 0;
	static int fishCount = 0;
	static int[] nowSharkPosition;
	static int[] tx = {-1, 0, 1, 0};
	static int[] ty = {0, -1, 0, 1};

	public static void main(String[] args){
		input();
	}

	static void input() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
			map = new int[n][n];

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					if (map[i][j] == 9) {
						nowSharkPosition = new int[]{i, j};
					} else if (map[i][j] != 0) {
						fishCount++;
					}
				}
			}
		} catch(IOException e) {}
	}
	
	static void findCloserFish() {
		Queue<int[]> q = new LinkedList<>();
		q.add(nowSharkPosition);
		
		while (!q.isEmpty()) {
			int[] temp = q.poll();
			int x = temp[0];
			int y = temp[1];
			
			for () {
				
			}
		}
		
	}
}
