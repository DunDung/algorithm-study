package baekjoon;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10250 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t =scan.nextInt();
		int count = 0;
		List<String> list = new ArrayList<>();
		boolean full = false;
		for(int i=0; i<t; i++) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			int n = scan.nextInt();
			for(int a = 1; a<=w&&!full; a++) {
				for(int b = 1; b<=h&&!full; b++) {
					count++;
					if(n==count) {
						full = true;
						if(a<10)
							list.add(b+"0"+a);
						else
							list.add(b+""+a);
					}
				}
			}
			full=false;
			count = 0;
		}
		for(String s : list)
			System.out.println(s);
	}
}
