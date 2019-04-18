package baekjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

//좌표 정렬하기
public class Q11650 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Pos [] posArr = new Pos[n] ;
		
		for(int i=0; i<n; i++) {
			posArr[i] = new Pos();
			posArr[i].x = scan.nextInt();
			posArr[i].y = scan.nextInt();
		}
		
		Arrays.sort(posArr);
		
		for(Pos p : posArr) 
			System.out.println(p.x + " " + p.y);
	}
}
class Pos implements Comparable<Pos> {
	int x;
	int y;
	
	@Override
	public int compareTo(Pos o) {
		int r = this.x - o.x;
		if(r==0)
			r = this.y - o.y;
		return r;
	}
	
}
