package baekjoon;

import java.util.Scanner;

public class Q5585 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int price = scan.nextInt();
		int change = 1000-price;
		int count = 0;
		while(true) {
			if(change == 0)
				break;
			if(change/500 >=1) {
				count+=change/500;
				change %= 500;
			}
			if(change/100 >=1) {
				count+=change/100;
				change %= 100;
			}
			if(change/50 >=1) {
				count+=change/50;
				change %= 50;
			}
			if(change/10 >=1) {
				count+=change/10;
				change %= 10;
			}
			if(change/5 >=1) {
				count+=change/5;
				change %= 5;
			}
			if(change/1 >=1) {
				count+=change/1;
				change %= 1;
			}
		}
		System.out.println(count);
	}

}
