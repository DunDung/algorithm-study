package implement;

import java.util.Scanner;

public class Q10797 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for(int i=0; i<5; i++)
			if(scan.nextInt()==n)
				count++;
		System.out.println(count);
	}

}
