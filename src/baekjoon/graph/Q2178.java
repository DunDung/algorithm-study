package baekjoon.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//미로탐색
//최단거리는 BFS이다.
public class Q2178 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int [][] a = new int[n][m];
		boolean [][] b = new boolean[n][m];
		int [] dx = {-1, 1, 0, 0};
		int [] dy = {0, 0, -1, 1};

		for(int i=0; i<n; i++) {
			String s = scan.next();
			for(int j=0; j<m; j++)
				a[i][j] = Integer.parseInt(s.substring(j, j+1));
		}
		Queue<Pair> q = new LinkedList<>();

		q.offer(new Pair(0 ,0));
		b[0][0] = true;

		while(!q.isEmpty()) {
			Pair v = q.poll();
			int i = v.x;
			int j = v.y;
			for(int k=0; k<4; k++) { //이런 식으로 중복되는 코드를 없애자!
				int x= i+dx[k];
				int y = j+dy[k];
				if(x>=0 && x<n && y>=0 && y<m) 
					if(a[x][y]>0 && !b[x][y]) {
						q.offer(new Pair(x, y));
						b[x][y] = true;
						a[x][y] = a[i][j] +1;
					}
			}
			
		}
		System.out.println(a[n-1][m-1]);
	}

}
class Pair{ //큐에 넣기위한 클래스
	int x;
	int y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
