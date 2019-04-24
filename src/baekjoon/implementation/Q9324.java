package baekjoon.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//진짜 메세지
public class Q9324 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();

		for(int i=0; i<tc; i++) {
			Map<String, Integer> map = new HashMap<>();
			String s = scan.next();
			boolean isOk = true;
			for(int j=0; j<s.length(); j++) {
				if(map.containsKey(s.substring(j, j+1))) {
					map.replace(s.substring(j, j+1), map.get(s.substring(j, j+1)), map.get(s.substring(j, j+1))+1);
					if(map.get(s.substring(j, j+1)) == 3) {
						if(j == s.length()-1)
							isOk = false;
						else if(!s.substring(j, j+1).equals(s.substring(j+1, j+2)))
							isOk = false;
						else {
							map.replace(s.substring(j, j+1), map.get(s.substring(j, j+1)), 0);
							j++;
						}
					}
						
				}
				else
					map.put(s.substring(j, j+1), 1);
			}
			if(isOk)
				System.out.println("OK");
			else
				System.out.println("FAKE");
		}
	}

}
