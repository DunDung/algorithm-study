package codeforce.round559_div2;

import java.util.Scanner;

//¼º°ø
public class APileOfStondes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ans = 0;
		String s = scan.next();
		for(int i=0; i<n; i++) {
			if(s.charAt(i)=='+') {
				ans++;
			}
			else {
				if(ans>0)
					ans--;
			}
		}
		System.out.println(ans);
	}
}
