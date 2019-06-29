package baekjoon.simulation;

import java.util.Scanner;

//막대기
//문제 이해가 참 힘들었던 문제
public class Q1094 {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = 64;
		int sum = n;
		int cnt = 1; //막대의 개수

		while(sum != x) {
			cnt++; //잘랐으니까 추가
			n /= 2;
			if(sum-n >= x) { //하나 버리고 남은 길이가 x보다 크거나 같다면
				sum -= n; //합에서 빼주고
				cnt--; //막대 개수 빼기
			}
		}
		System.out.println(cnt);
	}

}
