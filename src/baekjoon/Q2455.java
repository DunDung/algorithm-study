package baekjoon;

import java.util.Scanner;

//지능형 기차
//O
public class Q2455 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int now = 0;
		int max = 0;
		
		for(int i=0; i<4; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			now+= b-a;
			if(max < now)
				max = now;
		}
		
		System.out.println(max);
	}

}
