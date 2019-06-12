package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

//전깃줄
//LIS알고리즘 사용 O(nlogn)
public class Q2565 {
	
	public static int lis(int [] a) {
		int [] temp = new int[a.length];
		temp[0] = a[0];
		int length = 1;
		
		for(int i=1; i<a.length; i++) {
			if(temp[0] > a[i])
				temp[0] = a[i];
			else if(temp[length-1] < a[i]) {
				temp[length++] = a[i];
			}
			else {
				int idx = Arrays.binarySearch(temp, 0, length, a[i]);
				idx = (idx < 0) ? -idx - 1 : idx;
				temp[idx] = a[i];
			}
		}
		return length;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Z [] z = new Z[n];
		int [] a = new int[n];
		
		for(int i=0; i<n; i++) {
			z[i] = new Z(scan.nextInt(), scan.nextInt());
		}
		Arrays.sort(z);
		for(int i=0; i<n; i++)
			a[i] = z[i].y;
		System.out.println(n-lis(a));
	}
}
class Z implements Comparable<Z>{
	int x;
	int y;
	
	public Z(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Z o) {
		return this.x - o.x;
	}
}
