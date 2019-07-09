package baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

//¹®ÀÚ¿­ Æø¹ß
//X
public class Q9935 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		int n = a.length();
		int m = b.length();
		boolean [] erased = new boolean[n];
		if(m == 1) {
			for(int i=0; i<n; i++) {
				if(a.charAt(i) == b.charAt(0)) {
					erased[i] = true;
				}
			}
		}else {
			Stack<Pair> s = new Stack<>();
			for(int i=0; i<n; i++) {
				if(a.charAt(i) == b.charAt(0)){
					s.push(new Pair(i, 0));
				} else {
					if(!s.isEmpty()) {
						Pair p = s.peek();
						if(a.charAt(i) == b.charAt(p.y+1)) {
							s.push(new Pair(i, p.y+1));
							if(p.y+1 == m-1) {
								for(int j=0; j<m; j++) {
									erased[s.pop().x] = true;
								}
							}
						} else {
							while(!s.isEmpty()) {
								s.pop();
							}
						}
					}
				}
			}
		}
		boolean printed = false;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			if(erased[i]) continue;
			sb.append(a.charAt(i));
			printed = true;
		}
		if(!printed) {
			System.out.println("FRULA");
		} else {
			System.out.println(sb.toString());
		}
	}
}
class Pair{
	int x;
	int y;
	
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}