package baekjoon.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//화살표 그리기
public class Q15970 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Pos> list = new ArrayList<>();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			list.add(new Pos(x,y));
		}
		
		for(int i=0; i<list.size(); i++) {
			Pos p = list.get(i);
			int min = Integer.MAX_VALUE;
			for(int j=0; j<list.size(); j++) {
				Pos o = list.get(j);
				if(i!=j && p.y == o.y) {
					if(min>Math.abs(p.x-o.x))
						min = Math.abs(p.x-o.x);
				}
			}
			sum+=min;
		}
		System.out.println(sum);
	}

}
class Pos{
	int x;
	int y;
	
	public Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
