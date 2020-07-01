package baekjoon.etc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q10845 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String last = null;
		
		for(int i=0; i<n; i++) {
			String s = scan.next();
			switch(s) {
			case "push":
				last = scan.next();
				q.offer(last);
				break;
			case "pop":
				if(q.isEmpty())
					System.out.println("-1");
				else
					System.out.println(q.poll());
				break;
			
			case "size":
				System.out.println(q.size());
				break;

			case "empty":
				if(q.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;

			case "front":
				if(q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(q.element());
				break;

			case "back":
				if(q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(last);
				break;

			}
		}
	}

}
