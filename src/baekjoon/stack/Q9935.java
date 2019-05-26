package baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

//문자열 폭발
public class Q9935 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		Stack<Character> as= new Stack<>();
		Stack<Character> bs= new Stack<>();

		for(int i=a.length()-1; i>=0; i--) {
			as.push(a.charAt(i));
		}
		for(int i=b.length()-1; i>=0; i--) {
			bs.push(b.charAt(i));
		}

		while(true) {
			boolean isOk = false;
			Stack<Character> asFake= new Stack<>();
			Stack<Character> bsFake= new Stack<>();
			int n = as.size();
			int m = bs.size();
			for(int i=0; i<n; i++) {
				if(as.peek()==bs.peek()) {
					String ac = "";
					String bc = "";
					for(int j=0; j<m; j++) {
						ac += as.pop();
						bc += bs.pop();
					}
					if(!ac.equals(bc)) { //다름
						for(int j=m-1; j>=0; j--) {
							asFake.push(ac.charAt(j));
							bsFake.push(bc.charAt(j));
						}
					}
					else { //같음
						for(int j=m-1; j>=0; j--) {
							bsFake.push(bc.charAt(j));
						}
						isOk = true;
					}
					i+=m-1;
					bs.addAll(bsFake);
					bsFake.clear();
				}
				else {
					asFake.push(as.pop());
				}
			}
			as.addAll(asFake);
			asFake.clear();
			if(!isOk)
				break;
		}
실패
		for(char c : as) {
			System.out.print(c);
		}
	}

	
}