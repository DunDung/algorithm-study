package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

//∞≈∫œ¿Ã
public class Q2959 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] array = new int[4];
		
		for(int i=0; i<4; i++)
			array[i] = scan.nextInt();
		
		Arrays.parallelSort(array);
		System.out.println(array[0]*array[2]);
	}
}
