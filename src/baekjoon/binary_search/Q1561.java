package baekjoon.binary_search;

import java.util.Scanner;

//놀이공원
//X
public class Q1561 {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int[] a = new int[m];
	        for (int i=0; i<m; i++) {
	            a[i] = sc.nextInt();
	        }
	        if (n <= m) {
	            System.out.println(n);
	            return;
	        }
	        long left = 0;
	        long right = 2000000000L * 30L; //N최대 * 소요시간 최대 30분
	        while (left <= right) {
	            long mid = (left + right) / 2;
	            long begin = 0;
	            long end = m;
	            for (int i=0; i<m; i++) {
	                end += mid/a[i];
	            }
	            begin = end;
	            for (int i=0; i<m; i++) {
	                if (mid % a[i] == 0) {
	                    begin -= 1;
	                }
	            }
	            begin += 1;
	            if (n < begin) {
	                right = mid-1;
	            } else if (n > end) {
	                left = mid+1;
	            } else {
	                for (int i=0; i<m; i++) {
	                    if (mid % a[i] == 0) {
	                        if (n == begin) {
	                            System.out.println(i+1);
	                            return;
	                        }
	                        begin += 1;
	                    }
	                }
	            }
	        }

	    }

}
