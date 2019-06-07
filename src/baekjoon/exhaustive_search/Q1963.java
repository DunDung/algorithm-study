package baekjoon.exhaustive_search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//소수 경로
//맨날 까먹는 에라토스테네스의 체
public class Q1963 {
	static int change(int num, int index, int v){
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		sb.setCharAt(index, (char)(v+'0')); //int를 char로 바꾸기위해 +'0'을 해준다.
		return Integer.parseInt(sb.toString());
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tc = scan.nextInt();
		
		//에라토스테네스의 체로 소수 구해놓기.
		List<Boolean> prime = new ArrayList<>();
		
		//0과 1을 소수가 아닌걸로 처리
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
						if(i==0 && j==0) //0번째 자리를 0으로 바꾸면 안된다.
							continue;
						int k = change(v, i, j); //변경 가능한 수 모두 구해보기
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
