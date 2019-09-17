package baekjoon.samsung;

import java.util.*;
import java.io.*;

//이차원 배열과 연산
public class Q17140 {
	static int r,c,k,cnt;

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		r  = Integer.parseInt(st.nextToken());
		c  = Integer.parseInt(st.nextToken());
		k  = Integer.parseInt(st.nextToken());
		List<List<Integer>> numList = new ArrayList<>();

		for(int i=0; i<3; i++) {
			st = new StringTokenizer(reader.readLine());
			numList.add(new ArrayList<>());
			for(int j=0; j<3; j++) {
				int v = Integer.parseInt(st.nextToken());
				numList.get(i).add(v);
			}
		}
		Map<Integer, Integer> map = new HashMap<>();
		r(numList, 0);
		//		for(List<Integer> list : tempList) {
		//			for(int i=0; i<list.size(); i++) {
		//				System.out.print(list.get(i)+" ");
		//			}
		//			System.out.println();
		//		}
	}
	static void r(List<List<Integer>> numList, int cnt) {
//		if(numList.get(r-1).get(c-1) == k) {
//			System.out.println(cnt);
//			return;
//		}
		if(cnt > 100) {
			System.out.println(-1);
			return;
		}

		List<List<Integer>> tempList = new ArrayList<>();
		int[] count = new int[101];
		int maxSize = Integer.MIN_VALUE;
		for(int i=0; i<numList.size(); i++) {
			for(int j=0; j<numList.get(i).size(); j++) {
				count[numList.get(i).get(j)]++;
			}
			List<Temp> list = new ArrayList<>();
			for(int k=1; k<=100; k++) {
				if(count[k] >= 1) {
					list.add(new Temp(count[k], k));
					if(list.size()==50) {
						break;
					}
				}
			}
			if(maxSize < list.size()) maxSize = list.size();
			Arrays.fill(count, 0);
			Collections.sort(list);
			tempList.add(new ArrayList<Integer>());
			for(Temp t : list) {
				tempList.get(i).add(t.fre);
				tempList.get(i).add(t.num);
			}
			if(tempList.size() == 100) {
				break;
			}
		}
		for(int i=0; i<tempList.size(); i++) {
			if(tempList.get(i).size()<maxSize*2) {
				for(int j=maxSize*2 - tempList.get(i).size(); j>0; j--) {
					tempList.get(i).add(0);
				}
			}
		}
		c(tempList, cnt+1);

	}
	static void c(List<List<Integer>> numList, int cnt) {
//		if(numList.get(r-1).get(c-1) == k) {
//			System.out.println(cnt);
//			return;
//		}
		if(cnt > 100) {
			System.out.println(-1);
			return;
		}

		List<List<Integer>> tempList = new ArrayList<>();
		List<List<Temp>> list = new ArrayList<>();
		int[] count = new int[101];
		int maxSize = Integer.MIN_VALUE;

		for(int i=0; i<numList.get(0).size(); i++) {
			list.add(new ArrayList<Temp>());
			for(int j=0; j<numList.size(); j++) {
				count[numList.get(j).get(i)]++;
			}
			int colSize = 0;
			for(int k=1; k<=100; k++) {
				if(count[k] >= 1) {
					list.get(i).add(new Temp(count[k], k));
					colSize++;
					if(colSize==50) {
						break;
					}
				}
			}
			if(maxSize < list.size()) maxSize = list.size();
			Arrays.fill(count, 0);
			Collections.sort(list.get(i));
			if(list.size()==50) break;
		}
		for(int i=0; i<maxSize; i++)
			tempList.add(new ArrayList<>());
		for(int i=0; i<list.size(); i++) {
			for(int j=0; j<maxSize; j++) {
				if(list.get(i).size() <= j) {
					tempList.get(j).add(0);
					continue;
				}
				if(j%2 == 0) {
					tempList.get(j).add(list.get(i).get(j).fre);
				} else {
					tempList.get(j).add(list.get(i).get(j).num);
				}
			}
		}
		for(List<Integer> zlist : tempList) {
			for(int i=0; i<zlist.size(); i++) {
				System.out.print(zlist.get(i)+" ");
			}
			System.out.println();
		}
	}
}
class Temp implements Comparable<Temp>{
	int fre;
	int num;

	public Temp(int fre, int num) {
		this.fre = fre;
		this.num = num;
	}

	@Override
	public int compareTo(Temp o) {
		int r = this.fre - o.fre;
		if(r == 0) r = 	this.num - o.num;
		return r;
	}
}
