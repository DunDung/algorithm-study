package baekjoon.binary_search;

import java.util.Scanner;

//���� �ڸ���
//X
public class Q1654 {

	public static boolean check(long[] a, int n, long x) {
		int cnt = 0;
		for (int i=0; i<a.length; i++) {
			cnt += a[i]/x;
		}
		return cnt >= n; //x�� �߶��� ��  n�� �̻����� ����
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		long[] a = new long[k];
		long max = 0;
		
		for (int i=0; i<k; i++) {
			a[i] = sc.nextLong();
			max = Math.max(max, a[i]);
		}
		
		long ans = 0;
		long start = 1;
		long end = max;
		while (start <= end) {
			long mid = (start+end)/2;
			if (check(a, n, mid)) {
				ans = Math.max(ans,mid);
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		System.out.println(ans);
	}
}