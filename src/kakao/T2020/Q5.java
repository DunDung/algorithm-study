package kakao.T2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pos2{
	int x;
	int y;
	public Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pos other = (Pos) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
class Building implements Comparable<Building>{
	int x;
	int y;
	int z;
	public Building(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public int compareTo(Building o) {
		int r = this.x - o.x;
		if(r==0) r = this.y - o.y;
		if(r==0) r = this.z - z;
		return r;
	}
}
public class Q5 {
	public static void main(String[] args) {
		int [][] a = {{0,0,0,1},{2,0,0,1},{4,0,0,1},{0,1,1,1},{1,1,1,1},{2,1,1,1},{3,1,1,1},{2,0,0,0},{1,1,1,0},{2,2,0,1}};
		System.out.println(Arrays.deepToString(solution(5, a)));
	}
	public static int[][] solution(int n, int[][] build_frame) {
		Map<Pos, Integer> map = new HashMap<>();
		for(int i=0; i<build_frame.length; i++) {
			if(build_frame[i][3]==1) {
				boolean check = false;
				if(build_frame[i][2] == 0) { //±‚µ’
					if(build_frame[i][1] == 0) { //πŸ¥⁄¿Ã∏È
						check = true;
					} else { //πŸ¥⁄æ∆¥œ∏È
						Pos left = new Pos(build_frame[i][0]-1, build_frame[i][1]);
						Pos down = new Pos(build_frame[i][0], build_frame[i][1]-1);
						if(map.containsKey(left) && map.get(left)==1) { //øﬁ¬ ø° ∫∏∞° ¿÷¿∏∏È
							check = true;
						} else if(map.containsKey(down) && map.get(down)==0) { //πÿø° ±‚µ’¿÷¿∏∏È
							check = true;
						} 
					}
					if(check) {
						if(build_frame[i][3]==1) {
							map.put(new Pos(build_frame[i][0], build_frame[i][1]), 0);
						} 
					} else {
						if(build_frame[i][3]==0) {
							map.remove(new Pos(build_frame[i][0], build_frame[i][1]));
						}
					}

				} else { //∫∏
					Pos p1 = new Pos(build_frame[i][0], build_frame[i][1]-1);
					Pos p2 = new Pos(build_frame[i][0]+1, build_frame[i][1]-1);
					if((map.containsKey(p1) && map.get(p1)==0) ||(map.containsKey(p2) && map.get(p2)==0)) { //æÁ¬  πÿø° ±‚µ’¿÷¿∏∏È
						check = true;
					} else {
						Pos left = new Pos(build_frame[i][0]-1, build_frame[i][1]);
						Pos right = new Pos(build_frame[i][0]+1, build_frame[i][1]);
						if(map.containsKey(left) && map.containsKey(right)) {
							if(map.get(left)==1 && map.get(right) == 1) {
								check = true;
							}
						}
					}
					if(check) {
						map.put(new Pos(build_frame[i][0], build_frame[i][1]), 1);
					} 

				}
			} else {
				map.remove(new Pos(build_frame[i][0], build_frame[i][1]));
				for(Map.Entry<Pos, Integer> m : map.entrySet()) {
					boolean check = false;
					if(m.getValue() == 0) { //±‚µ’
						if(m.getKey().y == 0) { //πŸ¥⁄¿Ã∏È
							check = true;
						} else { //πŸ¥⁄æ∆¥œ∏È
							Pos left = new Pos(m.getKey().x-1, m.getKey().y);
							Pos down = new Pos(m.getKey().x, m.getKey().y-1);
							if(map.containsKey(left) && map.get(left)==1) { //øﬁ¬ ø° ∫∏∞° ¿÷¿∏∏È
								check = true;
							} else if(map.containsKey(down) && map.get(down)==0) { //πÿø° ±‚µ’¿÷¿∏∏È
								check = true;
							} 
						}
					} else { //∫∏
						Pos p1 = new Pos(m.getKey().x, m.getKey().y-1);
						Pos p2 = new Pos(m.getKey().x+1, m.getKey().y-1);
						if((map.containsKey(p1) && map.get(p1)==0) ||(map.containsKey(p2) && map.get(p2)==0)) { //æÁ¬  πÿø° ±‚µ’¿÷¿∏∏È
							check = true;
						} else {
							Pos left = new Pos(m.getKey().x-1, m.getKey().y);
							Pos right = new Pos(m.getKey().x+1, m.getKey().y);
							if(map.containsKey(left) && map.containsKey(right)) {
								if(map.get(left)==1 && map.get(right) == 1) {
									check = true;
								}
							}
						}
					}
					if(!check) {
						map.put(new Pos(build_frame[i][0], build_frame[i][1]), 1);
						break;
					}
				}
			}
		}
		List<Building> list = new ArrayList<>();
		for(Map.Entry<Pos, Integer> m : map.entrySet()) {
			list.add(new Building(m.getKey().x, m.getKey().y, m.getValue()));
		}
		Collections.sort(list);
		int[][] answer = new int[list.size()][3];
		for(int i=0; i<list.size(); i++) {
			answer[i][0] = list.get(i).x;
			answer[i][1] = list.get(i).y;
			answer[i][2] = list.get(i).z;
		}
		return answer;
	}
}
