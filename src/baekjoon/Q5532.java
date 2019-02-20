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
		
		if(korean%kday != 0) {
			korean /= kday;
			korean++;
		}
		else
			korean /= kday;
		if(math%mday != 0) {
			math /= mday;
			math++;
		
		}
		else
			math /= mday;
		
		if(day-math<day-korean)
			System.out.println(day-math);
		else
			System.out.println(day-korean);
	}
}