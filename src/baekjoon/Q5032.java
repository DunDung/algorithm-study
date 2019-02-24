package baekjoon;

import java.util.Scanner;

public class Q5032 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int e = scan.nextInt();
		int f = scan.nextInt();
		int c = scan.nextInt();
		
		int count = (e+f)/c;
		count += a((e+f)%c+count, c);
		System.out.println(count);
	}
	
	static int a(int left, int c) {
		if((left%c)+(left/c) >= 3)
			return left/c+a(left%c+left/c, c);
		else
			return left/c;
	}

}
