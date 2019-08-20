package baekjoon.samsung;

import java.io.*;
import java.util.*;

//¹ì
public class Q3190 {
	public static int n;
	public static int [][] a;
	public static char [] dir = new char[10001];
	public static int state = 1;
	public static Queue<Route> q = new LinkedList<>();

	public static void changeDirection(char c) {
		if(state == 1) {
			if(c=='D') state = 3;
			else state = 4;
		} else if(state == 2) {
			if(c=='D') state = 4;
			else state =3;
		} else if(state == 3) {
			if(c=='D') state = 2;
			else state =1;
		} else {
			if(c=='D') state = 1;
			else state = 2;
		}
	}

	public static int move() {
		int day = 1;
		int x = 1;
		int y = 1;
		while(true) {
			q.add(new Route(x, y));
			if(state == 1) {
				y++;
			} else if(state == 2) {
				y--;
			} else if(state == 3) {
				x++;
			} else {
				x--;
			}
			if(x<1 || x>n || y<1 || y>n ) return day;
			if(a[x][y] != 1) {
				if(a[x][y] < 0) return day;
				Route r = q.poll();
				a[r.x][r.y] = 0; 
			}
			a[x][y]= -1;
			if(dir[day]=='D' || dir[day]=='L') {
				changeDirection(dir[day]);
			}
			day++;
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(reader.readLine());
		int m = Integer.parseInt(reader.readLine());
		a = new int[n+1][n+1];
		a[1][1] = -1;
		for(int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			a[x][y] = 1; 
		}
		m = Integer.parseInt(reader.readLine());
		for(int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int x = Integer.parseInt(st.nextToken());
			char c = st.nextToken().charAt(0);
			dir[x] = c;
		}
		System.out.println(move());
	}
}
class Route{
	int x;
	int y;
	
	public Route(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
