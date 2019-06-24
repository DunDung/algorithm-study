package baekjoon.greedy;

import java.io.*;
import java.util.*;

//보석 도둑
//X
public class Q1202 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Jewelry [] a = new Jewelry[n];
		int [] bag = new int[m];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(reader.readLine());
			a[i] = new Jewelry(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		for(int i=0; i<m; i++) {
			bag[i] = Integer.parseInt(reader.readLine());
		}
		
		Arrays.sort(a);
		Arrays.sort(bag);
		
		Queue<Integer> q = new PriorityQueue<>();
		long ans = 0;
		int j = 0;
		for(int i=0; i<m; i++) {
			while(j < n && a[j].c <= bag[i]) { //앞에서 담은것은 제외해야 하므로 while문과 j를 사용
				q.add(-a[j].v);
				j++;
			}
			if(!q.isEmpty()) { //for문 한번에 한번만 더한다.
				ans+=Math.abs(q.poll());
			}
		}
		System.out.println(ans);
	}
}

class Jewelry implements Comparable<Jewelry> {
	int c;
	int v;

	public Jewelry(int c, int v) {
		this.c = c;
		this.v = v;
	}

	@Override
	public int compareTo(Jewelry o) {
		return  this.c - o.c;
	}
}
