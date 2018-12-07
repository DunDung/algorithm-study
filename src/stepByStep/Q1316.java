package stepByStep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		boolean a = true;
		int n = scan.nextInt();
		List<String> l = new ArrayList<>();
		for(int i=0; i<n; i++) {
			String s = scan.next();
			for(int j = 0; j<s.length(); j++) {
				if(l.contains(s.substring(j, j+1)))
					if(s.substring(j-1, j).equals(s.substring(j, j+1))) {
						continue;
					}
					else {
						a = false;
						break;
					 }
				else
					l.add(s.substring(j, j+1));
			}
			if(a) 
				count++;
			l.clear();
			a = true;
		}
		System.out.println(count);

	}
}
