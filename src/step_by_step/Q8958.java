package step_by_step;

import java.util.Scanner;

public class Q8958 {
	static int count = 0;
	static int result = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			String s = scan.next();
			for(int j=0; j<s.length(); j++) {
				if(Character.toString(s.charAt(j)).equals("O")) {
					count++;
					result += count;
				}
				else {
					count = 0;
				}
			}
			System.out.println(result);
			result = 0;
			count = 0;
		}
	}
}
