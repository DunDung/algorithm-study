package baekjoon;

import java.util.Scanner;

public class Q8320 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = 0;

		for(int i=1;i<=n;i++) //1부터 n까지의 수를
		    for(int j=i;i*j<=n;j++)//i*j<=n이면 count한다..
		    	count++;
		
		System.out.println(count);
	}

}
