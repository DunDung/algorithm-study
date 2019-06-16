package baekjoon.implementation;

import java.util.Arrays;
import java.util.Scanner;

//³îÀÌ°ø¿ø
public class Q2594 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Race[] a = new Race[n];
		int start = 10*60;
		int end = 22*60;
		
		for(int i=0; i<n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			x = (x / 100 * 60) + (x % 100 -10);
			y = (y / 100 * 60) + (y % 100 +10);
			a[i] = new Race(x, y);
		}
		
		Arrays.sort(a);
		int max = a[0].x - start;
		for(int i=1; i<n; i++) {
			if(a[i].x > a[i-1].y )
				max = Math.max(max, a[i].x-a[i-1].y);
		}
		max = Math.max(max, end - a[n-1].y);
		if(max<=0)
			System.out.println(0);
		else
			System.out.println(max);
	}

}
class Race implements Comparable<Race> {
	int x;
	int y;
	
	public Race(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Race o) {
		return this.y - o.y;
	}
}
