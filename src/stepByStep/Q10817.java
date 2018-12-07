package stepByStep;

import java.util.Arrays;
import java.util.Scanner;

public class Q10817 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] array = new int[3];
		int n = 0;
		for(int i=0; i<3; i++) {
			n = scan.nextInt();
			if(n >= 1 && n<=100)
				array[i] = n;
		}
		Arrays.sort(array);
		System.out.println(array[1]);
	}

}
