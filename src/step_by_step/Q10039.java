package step_by_step;

import java.util.Scanner;

public class Q10039 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		for(int i=0; i<5; i++) {
			int n = scan.nextInt();
			if(n<40)
				result += 40;
			else
				result += n;
		}
		System.out.println(result/5);
	}
}
