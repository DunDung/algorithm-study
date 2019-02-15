package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4641 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		while(true) {
			int n = scan.nextInt();
			if(n==-1)
				break;
			else {
				if(n != 0)
					list.add(n);
				else {
					int count  = 0;
					for(int i=0; i<list.size(); i++)
						for(int j=0; j<list.size(); j++) {
							double two = (double)list.get(i)/list.get(j);
							if(two == 2.0) {
								count++;
							}
						}
					System.out.println(count);
					list.clear();
				}
			}
		}
	}
}