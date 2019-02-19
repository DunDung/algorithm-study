package baekjoon;

import java.util.Scanner;

public class Q5532 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		int korean =scan.nextInt();
		int math = scan.nextInt();
		int kday = scan.nextInt();
		int mday = scan.nextInt();
		
		if(korean/kday>math/mday)
			System.out.println(day-korean/kday);
		else
			System.out.println(day-math/mday);

	}
}