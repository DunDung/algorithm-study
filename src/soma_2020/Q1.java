package soma_2020;

import java.util.Scanner;

public class Q1 {
	static int[] nums = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
	static int N;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		int maxMok = N / nums[0];
		int index = 0;
		for (int i = 1; i < 10; i++) {
			if (maxMok <= N / nums[i]) {
				maxMok  = N / nums[i];
				index = i;
			}
		}
		int namuge = N % nums[index];
		boolean isCheck= false;
		int maxOfNamuge = 0;
		for (int i = 0; i < 10; i++) {
			if (namuge >= nums[i]) {
				isCheck = true;
				maxOfNamuge = Math.max(maxOfNamuge, i);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < maxMok; i++) {
			sb.append(index);
		}
		if (isCheck){
			sb.append(maxOfNamuge);
		}
		System.out.println(sb);
	}
}
