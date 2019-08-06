package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//오아시스 재결합
public class Q3015 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Stack<Pair2> s = new Stack<>();
		int ans = 0;

		for(int i=0; i<n; i++) {
			int k = Integer.parseInt(reader.readLine());
			Pair2 p = new Pair2(k, 1);
			while(!s.isEmpty()) {
				if(s.peek().x <= p.x) {
					ans+= s.peek().y;
					if(s.peek().x == p.x){
						p.y += 1;
					}
					s.pop();
				} else {
					break;
				}
			}
			if(!s.isEmpty()) {
				ans += s.peek().y;
			}
			s.push(p);
		}
		System.out.println(ans);
	}
}
class Pair2{
	int x; //키
	int y; //키가 같은 사람

	public Pair2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
