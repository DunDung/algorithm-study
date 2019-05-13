package baekjoon.greedy;

import java.util.Scanner;

//행렬
//문제 이해를 못함..
//X
public class Q1080 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int [][]a = new int[n][m];
		int [][]b = new int[n][m];

		for(int i=0; i<n; i++) {
			String s = scan.next();
			for(int j=0; j<m; j++) 
				a[i][j] = s.charAt(j)-'0';
		}
		for(int i=0; i<n; i++) {
			String s = scan.next();
			for(int j=0; j<m; j++) 
				b[i][j] = s.charAt(j)-'0';
		}

		int cnt = 0;
		for(int i=0; i<n-2; i++) {
			for(int j=0; j<m-2; j++){
				if(a[i][j]!=b[i][j]){
					cnt++;
					for(int v1=0; v1<3; v1++) {
						for(int v2=0; v2<3; v2++) {
							if(a[i+v1][j+v2]==0)
								a[i+v1][j+v2] = 1;
							else
								a[i+v1][j+v2] = 0;
						}
					}
				}

			}
		}
		for(int i=0; i<n; i++) 
			for(int j=0; j<m; j++) {
				if(a[i][j] != b[i][j])
					cnt = -1;
			}

		System.out.println(cnt);
	}

}
