package baekjoon.implementation;

import java.util.Scanner;

//경비원
//각 점들의 위치를 [0][0]를 기준점 두고 거리를 계산
//X
public class Q2564 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt(); 
		int n = scan.nextInt();
		int sum=0;
	    int []a = new int[n+1];
	    
	    for (int i = 0; i <= n; i++) {
	    	int x = scan.nextInt();
	    	int y = scan.nextInt();
	    	switch (x) {
	        case 1:
	        	a[i] = y;
	        	break;
	        case 2:
	        	a[i] = 2 * w + h - y;
	        	break;
	        case 3:
	        	a[i] = 2 * (w + h) - y; 
	        	break;
	        case 4:
	        	a[i] = w + y;
	        	break;
	        }
	    }
	    for (int i = 0; i<n; i++) {
	        int tmp = Math.abs(a[i] - a[n]);
	        sum += (tmp<(w + h))? tmp : 2*(w + h)-tmp;
	    }
	    System.out.println(sum);
	}
}
	
