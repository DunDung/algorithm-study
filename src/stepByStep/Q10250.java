package stepByStep;

import java.util.Scanner;

public class Q10250 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int count = 0;
		boolean end = false;
		for(int i=0; i<t; i++) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			int n = scan.nextInt();
			int [][] q = new int[h][w];
			for(int j=0; j<w||end; j++) {
				for(int z =0; z<h||end; z++) {
					q[z][j] = 1;
					count++;
					if(count == n)
						System.out.println(z+","+j);
						end=true;
				}
			}
			end = false;
		}
	}

}
