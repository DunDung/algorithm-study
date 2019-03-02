package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q4153 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			List<Integer> list = new ArrayList<>();
			
			list.add(scan.nextInt());
			list.add(scan.nextInt());
			list.add(scan.nextInt());
			
			Collections.sort(list);
			
			if(list.get(0) == 0 && list.get(1) == 0 && list.get(2) == 0)
				break;
			if((list.get(0)*list.get(0))+(list.get(1)*list.get(1)) == list.get(2)*list.get(2))
				System.out.println("right");
			else
				System.out.println("wrong");
				
		}
	}

}
