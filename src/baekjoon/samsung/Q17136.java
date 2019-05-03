package baekjoon.samsung;

import java.util.Arrays;
import java.util.Scanner;

//색종이 붙이기
public class Q17136 {
	static int [] arr1= {5, 5, 5, 5, 5};
	static int [] arr2= {5, 5, 5, 5, 5};
	static void check1(int[][]a, int x, int y) {
		int n =4;
		while(n>0) {
			boolean isOk = true;
			loop:
			for(int i=0; i<=n; i++) {
				for(int j=0; j<=n; j++) {
					if(x+i>9 || y+j>9 ||a[x+i][y+j]!=1) {
						isOk = false;
						break loop;
					}
				}
			}
			if(isOk) {
				arr1[n]--;
				for(int i=0; i<=n; i++)
					for(int j=0; j<=n; j++){
						a[x+i][y+j] = -1*n;
					}
				return;
			}
			n--;
		}
		arr1[0]--;
		a[x][y] = -1;
	}
	static void check2(int[][]a, int x, int y) {
		int n =4;
		while(n>0) {
			boolean isOk = true;
			loop:
				for(int i=0; i<=n; i++) {
					for(int j=0; j<=n; j++) {
						if(x-i<0 || y-j<0 ||a[x-i][y-j]!=1) {
							isOk = false;
							break loop;
						}
					}
				}
			if(isOk) {
				arr2[n]--;
				for(int i=0; i<=n; i++)
					for(int j=0; j<=n; j++){
						a[x-i][y-j] = -1*n;
					}
				break;
			}
			n--;
			실패
		}
		if(n==0) {
		arr2[0]--;
		a[x][y] = -1;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][]a = new int[10][10];
		int[][]b = new int[10][10];
		for(int i=0; i<10; i++)
			for(int j=0; j<10; j++) {
				a[i][j] = scan.nextInt();
				b[i][j] = a[i][j];
			}
		for(int i=9; i>=0; i--) {
			for(int j=9; j>=0; j--) {
				if(a[i][j]==1) {
					check2(b,i,j);
				}

			}
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.deepToString(b));
		int sum=0;
		for(int i=0; i<5; i++) {
			if(arr1[i]<0) {
				sum = -1;
				break;
			}
			sum += 5-arr1[i];
		}
		System.out.println(sum);
			
	}
}

