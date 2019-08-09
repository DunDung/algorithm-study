package baekjoon.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

//최대힙
//우선순위 큐 사용
public class Q11279_ver2 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Queue<Integer> q = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			
			int k = Integer.parseInt(reader.readLine());
			if(k==0) {
				if(q.isEmpty()) {
					sb.append(0+"\n");
				} else {
					sb.append(q.poll()*-1+"\n");
				}
			} else {
				q.add(k*-1);
			}
		}
		System.out.print(sb.toString());
	}
}
