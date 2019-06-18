package baekjoon.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//멀티탭 스케줄링
//x
public class Q1700 {
	실패
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int [] a = new int[m];
		int [] k = new int[101];
		int cnt = 0;

		for(int i=0; i<m; i++) {
			a[i] = scan.nextInt();
			k[a[i]]++;
		}

		List<Integer>list = new ArrayList<>();
		for(int i=0; i<m; i++) {
			k[a[i]]--;
			if(list.contains(a[i])) {
				continue; //이미 꽂혀있으면 continue
			}
			if(list.size()>=n) { //빼야될 때 
				boolean ok = false; //삭제 여부
				for(int j=0; j<list.size(); j++) { //앞으로 사용하지 않는 수 찾기
					if(k[list.get(j)] <= 0) {
						list.remove(new Integer(list.get(j)));
						cnt++;
						ok = true; 
						break;
					}
				}
				if(!ok) { //앞으로 사용하지 않는 수가 없을 시
					for(int j=m-1; j > i; j--) { //가장 나중에 사용하는 수 찾기
						if(list.contains(a[j])){
							list.remove(new Integer(a[j]));
							cnt++;
							break;
						}
					}
				}
			}
			list.add(a[i]);
		}
		System.out.println(cnt);
	}
}
