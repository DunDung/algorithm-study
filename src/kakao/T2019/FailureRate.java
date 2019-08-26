package kakao.T2019;

import java.util.Arrays;

//2번
//실패율
//X
//나누기할때는 항상 예외처리를 하자..
public class FailureRate {
	public int[] solution(int N, int[] stages) {
		int[] a = new int[N+1];
		int[] players = new int[N+1];
		for(int i=0; i<stages.length; i++) {
			if(stages[i] == N+1) continue;
			a[stages[i]] ++;
		}
		players[0] = stages.length;
		Rate[]rates = new Rate[N];
		for(int i=1; i<=N; i++) {
			players[i] = players[i-1] - a[i-1];
			if((double)a[i]/players[i] == 0) {
				rates[i-1] = new Rate(i, 0);
			} else {
				rates[i-1] = new Rate(i, (double)a[i]/players[i]);
			}
		}
		Arrays.sort(rates);
		int[] answer = new int[N];
		for(int i=0; i<N; i++) {
			answer[i] = rates[i].num;
		}
		return answer;
	}
}
class Rate implements Comparable<Rate>{
	int num;
	double rate;

	public Rate(int num, double rate) {
		this.num = num;
		this.rate = rate;
	}
	@Override
	public int compareTo(Rate o) {
		int r = new Double(this.rate).compareTo(o.rate)*-1;
		if(r==0) r = this.num - o.num;
		return r;
	}
}
