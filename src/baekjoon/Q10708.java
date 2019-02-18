package baekjoon;

import java.util.Scanner;

public class Q10708 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = scan.nextInt();
		int [] answer = new int[t];
		int [] people = new int[n];
		
		for(int i=0; i<t; i++)
			answer[i] = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			int count = 0;
			for(int j=0; j<n; j++) {
				if(scan.nextInt()==answer[i]) {
					people[j]++;
					count++;
				}
				
			}
			people[answer[i]-1]+= n-count;
		}
		
		for(int m : people)
			System.out.println(m);
	}
}
