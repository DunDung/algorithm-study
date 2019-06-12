package baekjoon.exhaustive_search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//�Ҽ� ���
//�ǳ� ��Դ� �����佺�׳׽��� ü
public class Q1963 {
	static int change(int num, int index, int v){
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		sb.setCharAt(index, (char)(v+'0')); //int�� char�� �ٲٱ����� +'0'�� ���ش�.
		return Integer.parseInt(sb.toString());
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tc = scan.nextInt();
		
		//�����佺�׳׽��� ü�� �Ҽ� ���س���.
		List<Boolean> prime = new ArrayList<>();
		
		//0�� 1�� �Ҽ��� �ƴѰɷ� ó��
		prime.add(false); 
		prime.add(false);
		
		for(int i=2; i<10000; i++) {
			prime.add(true);
		}
		for(int i=2; i*i<10000; i++) {
			if(prime.get(i)) {
				for(int j=i*i; j<10000; j+=i) {
					prime.set(j, false);
				}
			}
		}
		while(tc-- > 0) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			Queue<Integer> q = new LinkedList<>();
			int [] d = new int[10000];
			boolean [] b = new boolean[10000];
			q.add(n);
			b[n] = true;
			
			while(!q.isEmpty()) {
				int v = q.poll();
				for(int i=0; i<4; i++) {
					for(int j=0; j<=9; j++) {
						if(i==0 && j==0) //0��° �ڸ��� 0���� �ٲٸ� �ȵȴ�.
							continue;
						int k = change(v, i, j); //���� ������ �� ��� ���غ���
						if(prime.get(k) && !b[k]) {
							d[k] = d[v]+1;
							b[k] = true;
							q.add(k);
						}
					}
				}
			}
			System.out.println(d[m]);
		}
		
	}
}