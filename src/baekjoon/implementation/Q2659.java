package baekjoon.implementation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//십자 카드
public class Q2659 {
	static String [] possible(String [] s) { //가능한 수들을 리턴
		String [] k = new String[4];
		for(int i=0; i<4; i++) {
			k[i] =(s[(i+0)%4]+s[(i+1)%4]+s[(i+2)%4]+s[(i+3)%4]);
		}
		Arrays.sort(k);
		return k;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] s = new String[4];

		for(int i=0; i<4; i++) {
			s[i] = scan.next();
		}


		Set<String> o = new TreeSet<>(); //SortedSet을 구현한 TreeSet 
		Set<String> x = new HashSet<>(); //정렬이 필요없으므로 빠른 HashSet
		for(int a=1; a<=9; a++) {
			for(int b=1; b<=9; b++) {
				for(int c=1; c<=9; c++) {
					for(int d=1; d<=9; d++) {
						String [] z = {a+"", b+"", c+"", d+""};
						z = possible(z);
						int index = 0;
						for(int i=0; i<4; i++) {
							if(!o.contains(z[i]) && !x.contains(z[i])) {
								o.add(z[i]);
								index = i;
								break;
							}
						}
						for(int i=0; i<4; i++) {
							if(i!=index) {
								x.add(z[i]);
							}
						}
					}
				}
			}
		}
		s = possible(s);

		Iterator<String> it = o.iterator();
		loop:
			for(int i=0; i<4; i++) {
				if(o.contains(s[i])){
					int cnt = 1;
					while(it.hasNext()) {
						if(it.next().equals(s[i])) {
							System.out.println(cnt);
							break loop;
						}
						else
							cnt++;
					}
				}
			}
	}
}
