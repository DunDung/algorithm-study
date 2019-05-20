package baekjoon.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//직각이등변삼각형찾기
public class Q2658 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][] a = new int[10][10];
		List<Vertex> list = new ArrayList<>();
		int [] k = {0, 4, 9, 16, 25, 36, 49, 66, 85}; 
		int count = 0;
		for(int i=0; i<10; i++) {
			String s = scan.next();
			for(int j=0; j<10; j++) {
				a[i][j] = s.charAt(j)-'0';
			}
		}

		for(int i=0; i<10; i++) {
			int cnt = 0;
			int x = 0;
			int y = 0;
			for(int j=0; j<10; j++) {
				if(a[i][j]==1) {
					count++;
					cnt++;
					x = i;
					y = j;
				}
			}
			if(cnt == 1) {
				list.add(new Vertex(x+1, y+1));
			}
		}
		for(int i=0; i<10; i++) {
			int cnt = 0;
			int x = 0;
			int y = 0;
			for(int j=0; j<10; j++) {
				if(a[j][i]==1) {
					cnt++;
					x = j;
					y = i;
				}
			}
			if(cnt == 1) {
				list.add(new Vertex(x+1, y+1));
			}
		}
		if(list.size()==3) {
			Collections.sort(list);
			int x = 0;
			int y = 0;
			int index1 = 0;
			int index2 = 0;
			if(list.get(0).x == list.get(1).x) {
				index1 = 0;
				index2 = 1;
				x=list.get(0).x;
			}
			else if(list.get(0).x == list.get(2).x) {
				index1 = 0;
				index2 = 2;
				x=list.get(0).x;
			}
			else if(list.get(1).x == list.get(2).x) {
				index1 = 1;
				index2 = 2;
				x=list.get(1).x;
			}
			if(list.get(0).y == list.get(1).y) {
				index1 = 0;
				index2 = 1;
				y=list.get(0).y;
			}
			else if(list.get(0).y == list.get(2).y) {
				index1 = 0;
				index2 = 2;
				y=list.get(0).y;
			}
			else if(list.get(1).y == list.get(2).y) {
				index1 = 1;
				index2 = 2;
				y=list.get(1).y;
			}
			boolean isOk = true;
			if(x>0) {
				int de = 3-index1-index2;
				if(k[Math.abs(list.get(de).x - x)] != count)
					isOk=false;
				if((list.get(index1).y+list.get(index2).y)/2 != list.get(de).y)
					isOk=false;
			}
			if(y>0) {
				int de = 3-index1-index2;
				if(k[Math.abs(list.get(de).y - y)] != count)
					isOk=false;
				if((list.get(index1).x + list.get(index2).x)/2 != list.get(de).x)
					isOk=false;
			}
			if(isOk) {
				for(Vertex v : list)
					System.out.println(v.x+" "+v.y);
			}
			else
				System.out.println(0);
		}
		else
			System.out.println(0);
	}
}

class Vertex implements Comparable<Vertex>{
	int x;
	int y;

	public Vertex(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Vertex o) {
		int r = this.x - o.x;
		if(r==0)
			r = this.y - o.y;
		return r;
	}
}
