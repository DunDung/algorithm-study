package step_by_step;

import java.util.Scanner;

public class Q2920 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		for(int i=0; i<8; i++)
			s.append(scan.next());
		
		if(s.toString().equals("12345678"))
			System.out.println("ascending");
		else if(s.toString().equals("87654321"))
			System.out.println("descending");
		else
			System.out.println("mixed");
	}
}
