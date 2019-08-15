package baekjoon.graph;

import java.io.*;
import java.util.*;
//≈‰∏∂≈‰
public class Q7569 {
	static int n;
	static int m;
	static int h;
	static int [][][] a;
	static int [] tx = {1, -1, 0, 0, 0, 0};
	static int [] ty = {0, 0, 1, -1, 0, 0};
	static int [] tz = {0, 0, 0, 0, 1, -1};
	static Queue<Tomato> q = new LinkedList<>();

	public static void bfs() {
		while(!q.isEmpty()) {
			Tomato t = q.poll();
			int z = t.z;
			int x = t.x;
			int y = t.y;
			for(int i=0; i<6; i++) {
				if(z+tz[i]>=0 && z+tz[i]<h && x+tx[i]>=0 && x+tx[i]<n && y+ty[i]>=0 && y+ty[i]<m) {
					if(a[z+tz[i]][x+tx[i]][y+ty[i]] == 0) {
						a[z+tz[i]][x+tx[i]][y+ty[i]] = a[z][x][y]+1;
						q.add(new Tomato(z+tz[i], x+tx[i], y+ty[i]));
					}
				}
			}
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		a = new int[h][n][m];
		boolean zeroCheck = false;
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<n; j++) {
				st = new StringTokenizer(reader.readLine());
				for(int k=0; k<m; k++) {
					a[i][j][k] = Integer.parseInt(st.nextToken());
					if(a[i][j][k] == 0) {
						zeroCheck = true;
					} else if(a[i][j][k] == 1){
						q.add(new Tomato(i, j, k));
					}
				}
			}
		}
		if(!zeroCheck) {
			System.out.println(0);
		}else {
			bfs();
			zeroCheck = false;
			int ans = 0;
			for(int i=0; i<h; i++) {
				for(int j=0; j<n; j++) {
					for(int k=0; k<m; k++) {
						if(a[i][j][k] == 0) {
							zeroCheck = true;
						} else {
							ans = Math.max(ans, a[i][j][k]);
						}
					}
				}
			}
			if(zeroCheck) {
				System.out.println(-1);
			} else
				System.out.println(ans-1);
		}
	}

}
class Tomato{
	int z;
	int x;
	int y;
	
	public Tomato(int z, int x, int y) {
		this.z = z;
		this.x = x;
		this.y = y;
	}
}
