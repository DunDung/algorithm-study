package baekjoon.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//토마토
//최소일수기 때문에 BFS
public class Q7576 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[][] a = new int[n][m];
		boolean [][]b = new boolean[n][m];
		int [] dx = {-1, 1, 0, 0};
		int [] dy = {0, 0, -1, 1};
		int x = 0, y = 0;
		boolean isOk = true;
		Queue<Pair2> q = new LinkedList<>();
		
		for(int i=0; i<n; i++) 
			for(int j=0; j<m; j++) {
				a[i][j] = scan.nextInt(); 
				if(a[i][j] == 0) //하나라도 0이 있으면
					isOk = false; //꽉차있는 것이 아님
				if(a[i][j] == 1) { //1을 찾아야 하는데 1이 여러개일 수 있으니 1을 찾을 때마다 q에 넣는다.
					x = i;
					y = j;
					q.add(new Pair2(x, y));
				}
			}

		if(isOk) //꽉 차 있으면 0출력
			System.out.println(0);
		else {
			while(!q.isEmpty()) {
				Pair2 p = q.poll();
				x = p.x;
				y = p.y;
				for(int k=0; k<4; k++) {
					int i = x+dx[k];
					int j = y+dy[k];

					if(i>=0 && j>=0 && i<n && j<m) {
						if(a[i][j]==0 && !b[i][j]) {
							q.add(new Pair2(i, j));
							b[i][j] = true;
							a[i][j] = a[x][y]+1;
						}
					}
				}
			}
			
			isOk = true; //성공 여부
			int max = 0; //최대일 수 찾기
			
			loop:
			for(int i=0; i<n; i++) 
				for(int j=0; j<m; j++) {
					if(a[i][j]==0) { //0이 하나라도 있으면 실패 
						isOk=false;
						break loop; //for문 전체를 빠져나감.
					}
					if(a[i][j]>max)
						max = a[i][j];
				}
			
			if(isOk)
				System.out.println(max-1);
			else
				System.out.println(-1);
		}
	}
}
class Pair2{
	int x;
	int y;

	public Pair2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}