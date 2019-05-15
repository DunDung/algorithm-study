package baekjoon.implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//경비원
public class Q2564 {
	static int n;
	static int m;
	static int tx;
	static int ty;
	static int [] dx = {1, -1, 0, 0};
	static int [] dy = {0, 0, 1, -1};
	
	public static int bfs(int x, int y) {
		int [][] a = new int[n][m];
		int [][] dist = new int[n][m];
		Queue<A> q = new LinkedList<>();
		q.add(new A(x, y));
		q.add(new A(x, y-1));
		
		for(int i=0; i<n; i++) {
			a[i][0] = 1;
			a[i][m-1] = 1;
			for(int j=0; j<m; j++) {
				if(i==0 || i==n-1)
					a[i][j] = 1;
			}
		}
		
		while(!q.isEmpty()) {
			A k = q.poll();
			int kx = k.x;
			int ky = k.y;
			if(kx ==tx && ky==ty)
				break;
			if((kx== 0 && ky==0) || (kx== 0 && ky==m-1) || (kx== n-1 && ky==0) ||(kx== n-1 && ky==m-1))
				dist[kx][ky]++;
			
			for(int i=0; i<4; i++) {
				if(kx+dx[i]>=0 && kx+dx[i]<n && ky+dy[i]>=0 && ky+dy[i]<m) {
					if(a[kx+dx[i]][ky+dy[i]]==1) {
						q.add(new A(kx+dx[i], ky+dy[i]));
						dist[kx+dx[i]][ky+dy[i]] = dist[kx][ky]+1;
						a[kx+dx[i]][ky+dy[i]] = 0;
						
					}
				}
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++){
				System.out.print(dist[i][j]+" ");
			}
			System.out.println();
		}
		return dist[tx][ty];
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
		n = scan.nextInt();
		int [][] a = new int[n][m];
		int tc = scan.nextInt();
		
		for(int i=0; i<tc; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			if(x==1) 
				a[0][y] = 1;
			else if(x==2)
				a[n-1][y] = 1;
			else if(x==3)
				a[y][0] = 1;
			else
				a[y][m-1] = 1;
		}
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if(x==1) {
			tx = 0;
			ty = y;
		}
		else if(x==2) {
			tx = n-1;
			ty = y;
		}
		else if(x==3) {
			tx = y;
			ty = 0;
		}
		else {
			tx = y;
			ty = m-1;
		}
		//입력 끝
		int sum = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++)
				if(a[i][j] == 1)
					System.out.println(bfs(i,j));
		}
		System.out.println(sum);
	}
}
실패
class A {
	int x;
	int y;
	
	public A(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
