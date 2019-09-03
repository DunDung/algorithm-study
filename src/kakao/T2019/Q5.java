package kakao.T2019;

import java.util.*;

//길 찾기 게임

public class Q5 {

	class Node implements Comparable<Node>{
		int x;
		int y;
		int v;
		List<Node> left = new ArrayList<>();
		List<Node> right = new ArrayList<>();
		public Node(int x, int y, int v) {
			this.x = x;
			this.y = y;
			this.v = v;
		}
		
		@Override
		public int compareTo(Node o) {
			int r = this.y - o.y;
			if(r==0) return this.x - o.x;
			else return -r;
		}
	}
	public int[][] solution(int[][] nodeinfo) {
		int len = nodeinfo.length;
		List<Node> list = new ArrayList<>();
		for(int i=0; i<len; i++) {
			list.add(new Node(nodeinfo[i][0], nodeinfo[i][1], i+1));
		}
		Collections.sort(list);
		make(list.get(0), list);
		List<Integer> temp = new ArrayList<>();
		preOrder(list.get(0), temp);
		postOrder(list.get(0), temp);
		int[][] answer = new int[2][len];
		int cnt = 0;
		for(int i=0; i<2; i++) {
			for(int j=0; j<len; j++) {
				answer[i][j] = temp.get(cnt++);
			}
		}
		return answer;
	}
	public void preOrder(Node n, List<Integer> temp) {
		temp.add(n.v);
		if(!n.left.isEmpty()) {
			preOrder(n.left.get(0), temp);
		}
		if(!n.right.isEmpty()) {
			preOrder(n.right.get(0), temp);
		}
	}
	public void postOrder(Node n, List<Integer> temp) {
		if(!n.left.isEmpty()) {
			postOrder(n.left.get(0), temp);
		}
		if(!n.right.isEmpty()) {
			postOrder(n.right.get(0), temp);
		}
		temp.add(n.v);
	}
		
	public void make(Node n, List<Node> list) {
		for(Node k : list) {
			if(n.x > k.x) {
				n.left.add(k);
			}else if(n.x < k.x) {
				n.right.add(k);
			}
		}
		if(!n.left.isEmpty()) {
			make(n.left.get(0), n.left);
		}
		if(!n.right.isEmpty()) {
			make(n.right.get(0), n.right);
		}
	}
}
