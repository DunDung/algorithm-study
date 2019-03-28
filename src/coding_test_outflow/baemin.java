package coding_test_outflow;

import java.util.Arrays;
import java.util.Scanner;

public class baemin {
	static int[] solution(int money) {
		int [] a = new int[9];
		int [] size = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int i = 0;
		while(money > 0) {
			if(money/size[i] > 0) {
				a[i] = money/size[i];
				money %= size[i];
			}
			i++;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int money = scan.nextInt();
		System.out.println(Arrays.toString(solution(money)));
		scan.close();
	}
}
