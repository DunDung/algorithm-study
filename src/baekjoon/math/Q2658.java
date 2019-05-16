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

		for(int i=0; i<10; i++) {
			String s = scan.next();
			for(int j=0; j<10; j++) {
				a[i][j] = s.charAt(j)-'0';
			}
		}
		int count =0;
		for(int i=0; i<10; i++) {
			int cnt = 0;
			for(int j=1; j<10; j++) {
				if(a[j][i] == 1) {
					cnt++;
				}
			}
			if(cnt == 1)
				count ++;
		}
		if(count == 1) {
			List<Integer>list = new ArrayList<>();
			list.add(1);
			for(int i=0; i<10; i++) {
				int cnt = 0;
				for(int j=1; j<10; j++) {
					if(a[j][i] == 1 && a[j-1][i] == 1) {
						cnt++;
					}
				}
				if(cnt>0)
					list.add(cnt+1);
			}
			Collections.sort(list);
			boolean isOk = false;
			for(int i=1; i<list.size(); i++) {
				if(list.get(i)-2 == list.get(i-1))
					isOk = true;
				else {
					isOk = false;
					break;
				}
			}

			if(isOk) {
				List<Pos9> list2 = new ArrayList<>();
				for(int i=0; i<10; i++) {
					int cnt = 0;
					int start = 0;
					int end = 0;
					for(int j=0; j<10; j++) {
						if(a[j][i] == 1) {
							cnt++;
							if(cnt == 1)
								start = j;
							else if(cnt == list.get(list.size()-1)) 
								end = j;

						}
					}
					if(cnt == 1)
						list2.add(new Pos9(start+1, i+1));
					else if(cnt == list.get(list.size()-1)) {
						list2.add(new Pos9(start+1, i+1));
						list2.add(new Pos9(end+1, i+1));
					}
				}
				if(list2.size()==3) {
					Collections.sort(list2);
					for(Pos9 k : list2) {
						System.out.println(k.x+" "+k.y);
					}
				}
				else
					System.out.println(0);
			}
			else
				System.out.println(0);
		}
		else
			System.out.println(0);
	}
}

class Pos9 implements Comparable<Pos9>{
	int x;
	int y;

	public Pos9(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Pos9 o) {
		int r = this.x - o.x;
		if(r==0)
			r = this.y - o.y;
		return r;
	}


}
