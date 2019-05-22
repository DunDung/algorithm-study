package baekjoon.divide_and_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

//가장 가까운 두 점
//X
public class Q2261 {

	static int dist(Point p1, Point p2) { //두 좌표사이의 거리를 구하는 메소드
		return (p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y);
	}
	
	static int bruteForce(List<Point> a, int x, int y) { //완전 탐색으로 가장 가까운 거리 찾기
		int ans = -1;
		for(int i=x; i<=y-1; i++) {
			for(int j=i+1; j<=y; j++) {
				int k = dist(a.get(i), a.get(j));
				if(ans == -1 || ans > k)
					ans = k;
			}
		}
		return ans;
	}
	
	static int closest(List<Point> a, int x, int y) {
		int n = y-x+1;
		if(n <= 3) { //n이 3이하면 완전탐색으로 x부터 y까지 가장 가까운 두 점 사이의 거리를 찾는다.
			return bruteForce(a, x, y);
		}
		
		int mid = (x+y)/2;
		int left = closest(a, x, mid);
		int right = closest(a, mid+1, y);
		int ans = Math.min(left, right);
		List<Point> b = new ArrayList<>(); //왼쪽과 오른쪽 사이의 점들을 저장할 List
		
		for(int i=x; i<=y; i++) {
			int d = a.get(i).x - a.get(mid).x;
			if(d*d < ans) {
				b.add(a.get(i));
			}
		}
		
		Collections.sort(b, new PointComparator()); //y좌표순으로 정렬
		int m = b.size(); 
		for(int i=0; i<m-1; i++) {
			if(i+1<m) {
				int k = b.get(i+1).y - b.get(i).y;
				if(k*k < ans) {
					int d = dist(b.get(i), b.get(i+1));
					if(d < ans) {
						ans = d;
					}
				}
			}
		}
		return ans;
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		List<Point> a = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			a.add(new Point(x, y));
		}
		Collections.sort(a);
		System.out.println(closest(a, 0, n-1));
	}

}
class PointComparator implements Comparator<Point>{ //y좌표 순으로 정렬하기 위한 Comparator

	@Override
	public int compare(Point o1, Point o2) {
		return o1.y-o2.y;
	}
	
}
class Point implements Comparable<Point>{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		int r = this.x - o.x;
		if(r == 0)
			r = this.y - o.y;
		return r;
	}
}
