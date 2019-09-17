package baekjoon.samsung;

import java.util.*;
import java.io.*;

//이차원 배열과 연산
public class Q17140 {
	static int r,c,k;
	static int[][] map;
	static int[] cnt;
	static List<Temp> list;

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		r  = Integer.parseInt(st.nextToken())-1;
		c  = Integer.parseInt(st.nextToken())-1;
		k  = Integer.parseInt(st.nextToken());

		map = new int[3][3];
		for(int i=0; i<3; i++) {
			st = new StringTokenizer(reader.readLine());
			for(int j=0; j<3; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int time = -1;

		while(true) {
			time++;

			if(time > 100) {
				time = -1;
				break;
			}
			if(r < map.length && c < map[0].length) {
				if(map[r][c] == k) 	break;
			}

			int row = map.length;
			int col = map[0].length;

			int[][] temp = new int[101][101];

			if(row >= col) {
				int max = Integer.MIN_VALUE;
				for(int i=0; i<row; i++) {
					cnt = new int[101];
					for(int j=0; j<col; j++) {
						cnt[map[i][j]]++;
					}
					list = new ArrayList<>();
					for(int j=1; j<=100; j++) {
						if(cnt[j] >= 1) {
							list.add(new Temp(j, cnt[j]));
						}
					}
					Collections.sort(list);
					int z = 0;
					for(int j=0; j<list.size(); j++) {
						temp[i][z++] = list.get(j).num;
						temp[i][z++] = list.get(j).fre;
					}
					if(max < list.size()*2) max = list.size()*2;
				}
				if(max > 100) max = 100;
				map = new int[row][max];
				for(int i=0; i<map.length; i++) {
					for(int j=0; j<map[i].length; j++) {
						map[i][j] = temp[i][j];
					}
				}
			}
			else {
				int max = Integer.MIN_VALUE;
				for(int i=0; i<col; i++) {
					cnt = new int[101];
					for(int j=0; j<row; j++) {
						cnt[map[j][i]]++;
					}
					list = new ArrayList<>();
					for(int j=1; j<=100; j++) {
						if(cnt[j] >= 1) {
							list.add(new Temp(j, cnt[j]));
						}
					}
					Collections.sort(list);
					int z = 0;
					for(int j=0; j<list.size(); j++) {
						temp[z++][i] = list.get(j).num;
						temp[z++][i] = list.get(j).fre;
					}
					if(max < list.size()*2) max = list.size()*2;
				}
				if(max > 100) max = 100;
				map = new int[max][col];
				for(int i=0; i<map.length; i++) {
					for(int j=0; j<map[i].length; j++) {
						map[i][j] = temp[i][j];
					}
				}
			}
		}
		System.out.println(time);
	}
}
class Temp implements Comparable<Temp>{
	int num;
	int fre;

	public Temp(int num, int fre) {
		this.num = num;
		this.fre = fre;
	}

	@Override
	public int compareTo(Temp o) {
		int r = this.fre - o.fre;
		if(r == 0) r = 	this.num - o.num;
		return r;
	}
}
