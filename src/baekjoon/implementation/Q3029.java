package baekjoon.implementation;

import java.util.Date;
import java.util.Scanner;

// 경고
public class Q3029 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] now = scanner.nextLine().split(":");
		String[] target = scanner.nextLine().split(":");
		int[] answer = new int[3];
		int carry = 0;
		
		for (int i = 2; i >= 0; i--) {
			int k = (Integer.parseInt(target[i]) + carry) - Integer.parseInt(now[i]);
			if(k < 0) {
				if(i == 0) {
					k+=24;
				} else {
					k += 60;
					carry = -1;
				}
			} else {
				carry = 0;
			}
			answer[i] = k;
		}
		
		if(answer[0] == 0 && answer[1] == 0 && answer[2] == 0) { //최소 1초는 기다리니 같으면 24시간을 기다려야하는 것.
			answer[0] = 24;
		}
		for (int i = 0; i < 3; i++) {
			if(answer[i] < 10) {
				System.out.print(0);
			}
			System.out.print(answer[i]);
			if(i != 2) {
				System.out.print(":");
			}
		}
	}
}
