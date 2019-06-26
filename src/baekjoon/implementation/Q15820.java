package baekjoon.implementation;

import java.util.Scanner;

public class Q15820 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sam = scan.nextInt();
		int sys = scan.nextInt();
	
		boolean samOk = true;
		for(int i=0; i<sam; i++) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			if(a != b) samOk = false;
		}
		
		boolean sysOk = true;
		for(int i=0; i<sys; i++) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			if(a != b) sysOk = false;
		}
		if(!samOk) {
			System.out.println("Wrong Answer");
		} else if(!sysOk) {
			System.out.println("Why Wrong!!!");
		} else {
			System.out.println("Accepted");
		}
			
			
	}
}
