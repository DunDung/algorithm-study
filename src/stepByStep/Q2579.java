package stepByStep;


import java.util.Arrays;
import java.util.Scanner;
//ÇÑÄ­ ÇÑÄ­ µÎÄ­ 75
//ÇÑÄ­ µÎÄ­ 55
//µÎÄ­ µÎÄ­ µÎÄ­
//µÎÄ­ ÇÑÄ­ µÎÄ­ µÎÄ­
//µÎÄ­ ÇÑÄ­ µÎÄ­ ÇÑÄ­
public class Q2579 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];
		for(int i=0; i<a.length; i++)
			a[i] = scan.nextInt();
	//	Integer [] b = new Integer[]  {step1(a), step2(a), step3(a)};
	//	System.out.println(step1(a)+" "+ step2(a)+" "+ step3(a));
	//	Arrays.sort(b);
	//	System.out.println(b[2]);
	}
	public static int step1(int [] a) {
		int value = 0;
		int count = a.length-1;
		value = a[count];
	}
}