package baekjoon.etc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//������ ť
//�ܰ躰���� ť
//O
public class Q1966 {
	static int getMax(Queue<Integer> q) {
		Iterator<Integer> it = 	q.iterator();
		int max = it.next();
		while(it.hasNext()) {
			int n = it.next();
			if(max < n)
				max = n;
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for(int i=0; i<t; i++) {
			int n = scan.nextInt();
			int []a = new int[n];
			int index = scan.nextInt();
			int count = 0;
			Queue<Integer> q = new LinkedList<>();

			for(int j=0; j<n; j++) {
				q.offer(scan.nextInt());
			}
			while(true) {
				int most = getMax(q); 
				int temp = 0;
				index --;
				if(q.size() == 0)
					temp = most;
				else
					temp = q.poll(); 
				if(temp == most) {
					count ++;
					if(index == -1)
						break;
				}
				else
					q.offer(temp);

				if(index < 0)
					index = q.size()-1; //index = n-1 �ؼ� Ʋ����
			}
			System.out.println(count);
		}
	}
}
