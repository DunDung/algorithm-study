package baekjoon.graph;

import java.util.Scanner;

//°áÈ¥½Ä
public class Q5567 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int count = 0;

		boolean [] friend = new boolean[n+1];
		boolean [] real = new boolean[n+1];
		int [] list = new int[m*2];

		for(int i=0; i<m*2; i++)
			list[i] = scan.nextInt();

		for(int i=0; i<m*2; i+=2) {
			if(list[i] == 1)
				real[list[i+1]] =true;
			if(list[i+1] == 1)
				real[list[i]] = true;
		}
		
		for(int i=0; i<m*2; i+=2) {
			if(list[i]!=1 &&list[i+1]!=1)
				if(real[list[i]]) {
					if(!real[list[i+1]])
						friend[list[i+1]]=true;
				}
				else if(real[list[i+1]]) {
					if(!real[list[i]])
						friend[list[i]] = true;
				}
		}

		for(int i=0; i<n+1; i++) {
			if(friend[i]) 
				count++;
			if(real[i])
				count++;
		}
		System.out.println(count);
	}
}

