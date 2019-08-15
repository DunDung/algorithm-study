package baekjoon.exhaustive_search;

import java.util.*;
import java.io.*;


//고기 잡이
public class Q7573 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken()); //모눈종이크기
		int l = Integer.parseInt(st.nextToken()); //그물길이
		int m = Integer.parseInt(st.nextToken()); //물고기개수
		Pos [] fish = new Pos[m];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(reader.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			fish[i] = new Pos(x,y);
		}
		
		List<Pos> net = new ArrayList<>();
		for(int i=1; i<l/2; i++) {
			for(int j=1; j<l/2; j++) {
				if(i+j == l/2) {
					net.add(new Pos(i, j));
				}
			}
		}
		int ans = 0;
		for(int i=0; i<fish.length; i++) {
			int x = fish[i].x;
			int y = fish[i].y;
			for(int j=0; j<net.size(); j++) {
				int tx = net.get(j).x;
				int ty = net.get(j).y;
				int cnt = 0;
				if(x-tx>=1 && y+ty<=n) {
					for(int k=0; k<fish.length; k++) {
						int fx = fish[k].x;
						int fy = fish[k].y;
						if(x-tx<=fx && x>=fx && y<=fy && y+ty>=fy) {
							cnt++;
						}
					}
					ans = Math.max(cnt, ans);
				}
				cnt = 0;
				if(x+tx<=n && y+ty<=n) {
					for(int k=0; k<fish.length; k++) {
						int fx = fish[k].x;
						int fy = fish[k].y;
						if(x<=fx && x+tx>=fx && y<=fy && y+ty>=fy) {
							cnt++;
						}
					}
					ans = Math.max(cnt, ans);
				}
				cnt = 0;
				if(x+tx<=n && y-ty>=1) {
					for(int k=0; k<fish.length; k++) {
						int fx = fish[k].x;
						int fy = fish[k].y;
						if(x<=fx && x+tx>=fx && y-ty<=fy && y>=fy) {
							cnt++;
						}
					}
					ans = Math.max(cnt, ans);
				}
				cnt=0;
				if(x-tx>=1 && y-ty>=n) {
					for(int k=0; k<fish.length; k++) {
						int fx = fish[k].x;
						int fy = fish[k].y;
						if(x-tx<=fx && x>=fx && y-ty<=fy && y>=fy) {
							cnt++;
						}
					}
					ans = Math.max(cnt, ans);
				}
			}
		}
		System.out.println(ans);
		
	}
}

class Pos{
	int x;
	int y;

	public Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
}