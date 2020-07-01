package baekjoon.etc;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//��
//�� �������̽��� �ִٴ� ���� �˰Ե�..

public class Q10866 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();	
		Deque<Integer> d = new ArrayDeque<>();
		for(int i=0; i<n; i++) {
			String s = scan.next();
			switch(s) {
			
			case  "push_front":
				d.addFirst(scan.nextInt());
				break;
			
			case "push_back":
				d.addLast(scan.nextInt());
				break;
			
			case "pop_front":
				if(d.isEmpty())
					System.out.println(-1);
				else
					System.out.println(d.pollFirst());
				break;
				
			case "pop_back":
				if(d.isEmpty())
					System.out.println(-1);
				else
					System.out.println(d.pollLast());
				break;
				
			case "size":
				System.out.println(d.size());
				break;
				
			case "empty":
				if(d.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			
			case "front":
				if(d.isEmpty())
					System.out.println(-1);
				else 
					System.out.println(d.peekFirst());
				break;

			case "back":
				if(d.isEmpty())
					System.out.println(-1);
				else 
					System.out.println(d.peekLast());
				break;
			}
		}
		scan.close();
	}

}
