package baekjoon;

import java.util.Scanner;

public class Q5567 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int count = 0;
		boolean [] realFriend = new boolean[n+1];
		boolean [] friendOfFriend = new boolean[n+1];
		boolean stop = false;
		int [] list = new int[m*2];
		for(int i=0; i<list.length; i++) {
			list[i] = scan.nextInt();
		}
		for(int j=0; j<2; j++) {
			for(int i=0; i<m*2; i+=2) {
				if(list[i]==1||list[i+1]==1) {
					if(list[i]==1) 
						realFriend[list[i+1]] = true;
					if(list[i+1]==1)
						realFriend[list[i]] = true;
				}
				if(realFriend[list[i]])
					if(!realFriend[list[i+1]])
						friendOfFriend[list[i+1]] = true;
				if(realFriend[list[i+1]])
					if(!realFriend[list[i]])
						friendOfFriend[list[i]] = true;
			}
		}
		realFriend[1] = false;
		friendOfFriend[1] = false;
		for(int i=0; i<n; i++)
			if(realFriend[i])
				count++;
		for(int i=0; i<n; i++)
			if(friendOfFriend[i])
				count++;

		System.out.println(count);
	}
}

