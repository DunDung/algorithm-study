package baekjoon.math;

import java.util.Scanner;

//네 번째 점
public class Q3009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] xCount = new int[1001];
		int [] yCount = new int[1001];
		int [] x = new int[3];
		int [] y = new int[3];
		
		for(int i=0; i<3; i++) {
			int xNum = scan.nextInt();
			x[i] = xNum;
			xCount[xNum]++;
			int yNum = scan.nextInt();
			y[i] = yNum;
			yCount[yNum]++;
		}
		for(int i=0; i<3; i++) {
			if(xCount[x[i]] == 1) {
				System.out.print(x[i]+" ");
			}
		}
		for(int i=0; i<3; i++) {
			if(yCount[y[i]] == 1) {
				System.out.print(y[i]);
			}
		}
	}

}
