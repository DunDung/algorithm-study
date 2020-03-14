import java.util.Scanner;

public class Q1 {
	static int[] nums = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
	static int N;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		int 최대몫 = N / nums[0];
		int index = 0;
		for (int i = 1; i < 10; i++) {
			if (최대몫 <= N / nums[i]) {
				최대몫  = N / nums[i];
				index = i;
			}
		}
		int 나머지 = N % nums[index];
		boolean 바꿨는지= false;
		int 나머지값중최대값 = 0;
		for (int i = 0; i < 10; i++) {
			if (나머지 >= nums[i]) {
				바꿨는지 = true;
				나머지값중최대값 = Math.max(나머지값중최대값, i);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 최대몫; i++) {
			sb.append(index);
		}
		if (바꿨는지){
			sb.append(나머지값중최대값);
		}
		System.out.println(sb);
	}
}
