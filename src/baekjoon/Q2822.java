package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2822 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer [] array = new Integer[8];
		
		for(int i=0; i<8; i++)
			array[i] = scan.nextInt();
		
		List<Integer> list = Arrays.asList(array.clone());
		List<Integer> list2 = new ArrayList<>();
		Collections.sort(list);
		System.out.println(list.get(7)+list.get(6)+list.get(5)+list.get(4)+list.get(3));
		
		for(int i=3; i<8; i++)
			for(int j=0; j<8; j++)
				if(list.get(i)==array[j]) 
					list2.add(j+1);
		
		Collections.sort(list2);
		for(int a : list2)
			System.out.print(a+" ");
	}

}
