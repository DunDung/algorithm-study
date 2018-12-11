package stepByStep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Integer> l = new ArrayList<>();
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			int count = 0;
			long system = 0;
			boolean s = false;
			long x = scan.nextInt();
			long y = scan.nextInt();
			y--;
			while(!s) {
				if(x>y) {
					x += system-1;
					count++;
				}
				long []a = {x+system-1, x+system, x+system+1};
				for(int j=0; j<a.length; j++) {
					if(y == a[j]) {
						count++;
						s=true;
					}
				}
				if(!s&&x<y) {
					x += ++system;
					count++;
				}
			}
			l.add(++count);
		}
		for(Integer z : l) 
			System.out.println(z);
	}
}