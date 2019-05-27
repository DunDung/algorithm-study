package baekjoon.bruteforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//고기 잡이
public class Q7573 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int g = scan.nextInt();
		int m = scan.nextInt();
		int [][] a = new int [n][n];

		List<Pos> fPos = new ArrayList<>();
		for(int i=0; i<m; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			fPos.add(new Pos(x, y));
		}

		List<Pos> gPos = new ArrayList<>();
		for(int i=1; i<g/2; i++) {
			for(int j=1; j<g/2; j++) {
				if(i+j == g/2)
					gPos.add(new Pos(i, j));
			}
		}
		실패
		int ans = 0;
		for(int i=0; i<fPos.size(); i++) {
			for(int j=0; j<gPos.size(); j++) {
				int cnt = 0;
				for(int k=0; k<fPos.size(); k++) {
					if(fPos.get(i).x + gPos.get(j).x <= n && fPos.get(i).y + gPos.get(j).y <= n) {
						if(fPos.get(k).x>=fPos.get(i).x && fPos.get(k).y>=fPos.get(i).y ) {
							if( fPos.get(i).x + gPos.get(j).x >= fPos.get(k).x && fPos.get(i).y + gPos.get(j).y >= fPos.get(k).y) {
								cnt++;
							}
						}
					}
				}
				if(cnt>ans)
					ans = cnt;
			}
		}
		for(int i=0; i<fPos.size(); i++) {
			for(int j=0; j<gPos.size(); j++) {
				int cnt = 0;
				for(int k=0; k<fPos.size(); k++) {
					if(gPos.get(j).x - fPos.get(i).x > 0 && gPos.get(j).x - fPos.get(i).x > 0) {
						if(fPos.get(k).x<=fPos.get(i).x && fPos.get(k).y<=fPos.get(i).y ) {
							if( gPos.get(j).x-fPos.get(i).x  <= fPos.get(k).x && gPos.get(j).y-fPos.get(i).y <= fPos.get(k).y) {
								cnt++;
							}
						}
					}
				}
				if(cnt>ans)
					ans = cnt;
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