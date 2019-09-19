package codeforce.educational_round73_div2;

import java.util.*;
import java.io.*;

//2048°ÔÀÓ
public class Game2048 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();
		while(tc-- > 0) {
			int n = Integer.parseInt(reader.readLine());
			StringTokenizer st = new StringTokenizer(reader.readLine());
			List<Integer> list = new ArrayList<>();
			for(int i=0; i<n; i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			while(true) {
				List<Integer> temp = new ArrayList<>();
				boolean check = false;
				Collections.sort(list);
				for(int i=list.size()-1; i>=0; i--) {
					if(list.get(i)==2048) {
						temp.add(2048);
						break;
					}
					if(!check && temp.contains(list.get(i))) {
						temp.remove(list.get(i));
						temp.add(list.get(i)*2);
						check = true;
					} else {
						temp.add(list.get(i));
					}
				}
				if(temp.contains(2048)) {
					System.out.println("YES");
					break;
				}  else	if(!check) {
					System.out.println("NO");
					break;
				} else {
					list.clear();
					list.addAll(temp);
				}
			}
		}
	}

}
