package baekjoon.exhaustive_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//부등호
//더 효율적인 백트래킹
public class Q2529_ver2 {
	static List<String> list = new ArrayList<>();
	static boolean [] visited = new boolean[10];
	static String [] s;

	public static void go(int num, int cnt, String key, int n) {
		if(cnt == n) {
			list.add(key);
		}
		else {
			for(int i=0; i<=9; i++) {
				if(!visited[i]) {
					if(s[cnt].equals("<")) {
						if(num>=i) {
							continue;
						}
					}
					else {
						if(num<=i) {
							continue;
						}
					}
					visited[i]= true;
					go(i, cnt+1, key+i, n);
					visited[num] = false;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		s = scan.nextLine().split(" ");

		for(int i=0; i<=9; i++) {
			visited[i] = true;
			go(i, 0, i+"", n);
		}
		
		System.out.println(list.get(list.size()-1));
		System.out.println(list.get(0));
	}
}
