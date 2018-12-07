package stepByStep;

import java.util.Scanner;

public class Q1924 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int d = scan.nextInt();
		int [] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int count = 0;
		String [] s = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		
		if(m>0 && m<=12 && d>0 && d<=31) {
			for(int i=1; i<=12; i++) {
				for(int j=1; j<= month[i-1]; j++) {
					if(i == m && j == d)
						System.out.println(s[count%7]);
					count++;	
				}
			}
		}
	}
}
