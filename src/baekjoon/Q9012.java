package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q9012 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String> s = new Stack<>();
		int n = scan.nextInt();
		boolean no = false;
		for(int i=0; i<n; i++) {
			String a = scan.next();
			for(int j=0; j<a.length(); j++) {
				if(a.substring(j, j+1).equals("("))
					s.push("(");
				else {
					if(s.empty())
						no = true;
					else
						s.pop();
				}
			}
			if(!s.empty()||no)
				System.out.println("No");
			else
				System.out.println("YES");
			
			s.clear();
			no = false;
		}
		
	}
}
