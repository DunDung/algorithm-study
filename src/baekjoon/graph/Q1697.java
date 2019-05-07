package baekjoon.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//숨바꼭질
//X
//최단거리는 BFS이고  -1, +1, *2 모든경우의 횟수를 구한다. 
//횟수는 전의 값에 +1을 해준다.
public class Q1697 {
	static int bfs(int[] a, int n, int k) {
		Queue<Integer>q = new LinkedList<>();
		a[n] = 0;
		q.add(n);
		int [] bx = new int[3];
		while(!q.isEmpty()) {
			n = q.poll();
			bx[0] = n+1;
			bx[1] = n-1;
			bx[2] = n*2;
			for(int i=0; i<3; i++) {
				System.out.println(bx[i]);
				if(bx[i]>=0 && bx[i]<100 && a[bx[i]] == -1 ) {
					a[bx[i]] = a[n]+1;
					q.add(bx[i]);
				}
			}
			
		}
		return  a[k];
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int [] a = new int[100001];
		Arrays.fill(a, -1);
		System.out.println(bfs(a,n,k));
	}

}
