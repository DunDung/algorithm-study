package baekjoon.math;

import java.util.Scanner;

//직사각형에서 탈출
//x
public class Q1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		if(w-x < x) //x에서 w로 가는거리가 x에서 왼쪽 끝인 0 으로 가는거보다 가까울 경우만
			x = w-x;
		if(h-y < y) 
			y = h-y;
		//x나y에서 w나h로 가는 것보다 x나 y에서 왼쪽 벽끝인 0을 향해 가는 것이 더 빠를 수 도있다는 경우를 고려하지 않아서 틀렸었음.
		System.out.println(Math.min(x,y));
	}
}
