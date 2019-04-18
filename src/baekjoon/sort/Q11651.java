package baekjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

//좌표 정렬하기 2
public class Q11651 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Pos2 [] posArr = new Pos2[n] ;
		
		for(int i=0; i<n; i++) {
			posArr[i] = new Pos2();
			posArr[i].x = scan.nextInt();
			posArr[i].y = scan.nextInt();
		}
		
		Arrays.sort(posArr);
		
		for(Pos2 p : posArr) 
			System.out.println(p.x + " " + p.y);
	}
}
class Pos2 implements Comparable<Pos2> {
	int x;
	int y;
	
	@Override
	public int compareTo(Pos2 o) {
		int r = this.y - o.y;
		if(r==0)
			r = this.x - o.x;
		return r;
	}
	
}
