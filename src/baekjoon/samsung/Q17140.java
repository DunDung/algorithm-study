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
		List<List<Temp>> numList = new ArrayList<>();

		for(int i=0; i<3; i++) {
			st = new StringTokenizer(reader.readLine());
			for(int j=0; j<3; j++) {
				int v = Integer.parseInt(st.nextToken());
			}
			for(int k=1; k<=3; k++) {
				if(check[k] >= 1) {
					numList.get(i).add(new Temp(check[k], k));
				}
			}
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
		return -r;
	}
}
