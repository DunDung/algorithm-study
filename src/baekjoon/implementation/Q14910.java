package baekjoon.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//¿À¸£¸·
public class Q14910 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		String s = scan.nextLine();
		String [] a = s.split(" ");
		
		for(int i=0; i<a.length; i++) {
			list.add(Integer.parseInt(a[i]));
		}

		boolean isOk = true;
		for(int i=1; i<list.size(); i++) {
			if(list.get(i-1)>list.get(i))
				isOk = false;
		}

		if(isOk)
			System.out.println("Good");
		else
			System.out.println("Bad");
	}

}
