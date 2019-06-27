package baekjoon.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//멀티탭 스케줄링
//x
public class Q1700 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int [] a = new int[m];
		int [] how = new int[101];//몇번 출현하는지 

		for(int i=0; i<m; i++) {
			a[i] = scan.nextInt();
			how[a[i]]++;
		}

		int ans = 0;
		List<Integer>list = new ArrayList<>();

		for(int i=0; i<m; i++) {
			how[a[i]]--; //출현 횟수 감소

			if(list.contains(a[i]))	continue; //이미 꽂혀있으면 continue

			if(list.size()>=n) { //빼야될 때 
				ans++;
				boolean ok = false; //삭제 여부
				for(int j=0; j<list.size(); j++) { //앞으로 사용하지 않는 수 찾기
					if(how[list.get(j)] <= 0) { //출현 횟수가 0보다 작으면 앞으로 안나옴
						list.remove(new Integer(list.get(j)));
						ok = true; 
						break;
					}
				}
				if(!ok) { //앞으로 사용하지 않는 수가 없을 시 가장 나중에 출현하는 수를 지운다
					boolean [] b = new boolean[n]; //나중에 지워지는 수를 체크할 배열
					int check = n;
					loop:{ 
						for(int j=i+1; j < m; j++) { 
							for(int k=0; k<n; k++) {
								if(list.get(k) == a[j] && !b[k]) {
									b[k] = true;
									check --;
									if(check == 0) { //마지막으로 지워졌으면 지운다
										list.remove(new Integer(a[j]));
										break loop;
									}
									break;
								}
							}
						}
					}
				}
			}
			list.add(a[i]);
		}
		System.out.println(ans);
	}
}
