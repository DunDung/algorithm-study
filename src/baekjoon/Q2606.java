package baekjoon;

import java.util.Scanner;

public class Q2606 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		int n = scan.nextInt();
		boolean [] b = new boolean[t+1];
		int [][]array = new int[n][2];
		b[1] = true;
		for(int i=0; i<n; i++) {
			array[i][0] = scan.nextInt();
			array[i][1] = scan.nextInt();
		}
		for(int j=0; j<3; j++) {
			for(int i=0; i<n; i++) {
				if(b[array[i][0]])
					b[array[i][1]]=true;
				if(b[array[i][1]])
					b[array[i][0]] = true;
			}
		}
		int count = 0;
		for(boolean v : b)
			if(v)
				count++;
		System.out.println(count-1);


	}

}
