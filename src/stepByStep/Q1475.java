import java.util.Arrays;
import java.util.Scanner;

public class Q1475 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		String s = scan.next();
		
		int [] a = new int[10];
		for(int i=0; i<s.length(); i++) {
			int v = Integer.parseInt(s.substring(i, i+1));
			if(9==v || v==6) {
				if(a[9] > a[6])
					a[6]++;
				else
					a[9]++;
			}
			else
				a[v]++;
		}
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
	}
}
