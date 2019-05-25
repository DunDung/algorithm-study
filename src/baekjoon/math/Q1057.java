package baekjoon.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//토너먼트
public class Q1057 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p1 = scan.nextInt();
		int p2 = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		List<Integer> win = new ArrayList<>();

		for(int i=1; i<=n; i++)
			list.add(i);

		int cnt = 0;
		boolean isOk = false;
		while(list.size()>1 && !isOk) {
			System.out.println(list.toString());
			cnt++;
			for(int i=0; i<list.size(); i+=2) {
				if(i+1 < list.size()) {
					int b1 = list.get(i);
					int b2 = list.get(i+1);
					if((b1 == p1 || b1 == p2) && (b2 ==p2 || b2 == p1)) {
						isOk = true;
						break;
					}
					else if(b1 == p1 || b1 == p2){
						win.add(b1);
					}
					else if(b2 == p1 || b2 == p2){
						win.add(b2);
					}
					else {
						win.add(b1);
					}
				}
			}
			if(list.size() % 2 != 0) {
				win.add(list.get(list.size()-1));
			}
			list.clear();
			list.addAll(win);
			win.clear();

		}
		if(isOk)
			System.out.println(cnt);
		else
			System.out.println(-1);
	}
}
