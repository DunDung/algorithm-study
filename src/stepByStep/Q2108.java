package stepByStep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Q2108 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];
		int sum =0;
		int max = 0;
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
			sum += a[i];
			if(map.containsKey(a[i])) {
				map.replace(a[i], map.get(a[i]), map.get(a[i])+1);
				if(max < map.get(a[i]))
					max = map.get(a[i]);
			}else
				map.put(a[i], 1);
		}
		if(max == 0)
			max++;
		Arrays.sort(a);
		int middle = n/2;
		System.out.println(Math.round((double)sum/n));
		System.out.println(a[middle]);
		
		Iterator<Entry<Integer, Integer>> i = map.entrySet().iterator();
		
		  while(i.hasNext()) {
				Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>)i.next();
				if(entry.getValue() == max)
					list.add(entry.getKey());
		  }
		  
		if(list.size()==1)
			System.out.println(list.get(0));
		else {
			Collections.sort(list);
			System.out.println(list.get(1));
		}
		System.out.println(a[n-1]-a[0]);
	}
}
