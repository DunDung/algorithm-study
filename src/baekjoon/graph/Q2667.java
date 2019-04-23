package baekjoon.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//단지번호붙이기
//뿌듯
public class Q2667 {
	static int [][] a; //입력 받은 배열
	static boolean [][] b; //방문여부 배열
	static int cnt2; //가구 수 세는 변수

	static void dfs(int i, int j) {
		if(b[i][j])
			return;

		b[i][j] = true;
		cnt2 ++; //가구수 증가

		//지도의 크기 체크, 집이있는지 체크, 방문했던 곳인지 체크
		if(i-1 >= 0 && a[i-1][j] > 0 && !b[i-1][j]) //아랫 집 
			dfs(i-1, j);
		if(i+1 < a.length && a[i+1][j] > 0 && !b[i+1][j]) //윗 집
			dfs(i+1, j);
		if(j-1 >= 0 && a[i][j-1] > 0 && !b[i][j-1]) //왼쪽 집
			dfs(i, j-1);
		if(j+1 < a.length && a[i][j+1] > 0 && !b[i][j+1]) //오른쪽 집
			dfs(i, j+1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		a = new int[n][n];
		b = new boolean[n][n];
		int cnt = 0;
		List<Integer> list = new ArrayList<>();

		for(int i=0; i<n; i++) {
			String s = scan.next();
			for(int j=0; j<n; j++) 
				a[i][j] = Integer.parseInt(s.substring(j, j+1));
		}

		for(int i=0; i<n; i++) 
			for(int j=0; j<n; j++) 
				if(a[i][j] > 0 && !b[i][j]) {
					cnt++; //단지 수 증가
					cnt2 = 0; //가구수 초기화
					dfs(i, j);
					list.add(cnt2); // 가구수 저장
				}

		System.out.println(cnt); //단지수 출력
		Collections.sort(list); //가구수 오름차순 정렬
		for(int m : list)
			System.out.println(m);
	}
}
