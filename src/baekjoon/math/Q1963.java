package baekjoon.math;

import java.util.ArrayList;
import java.util.List;

//소수 경로
//맨날 까먹는 에라토스테네스의 체
public class Q1963 {

	public static void main(String[] args) {
		List<Boolean> list = new ArrayList<>();
		
		list.add(false); //0
		list.add(false); //1
		for(int i=2; i<10000; i++)
			list.add(true);
		
		for(int i=2; i*i<10000; i++) {
			if(list.get(i))
				for(int j=i*i; j<10000; j+=i) { //배수니까 j+=i이다.
					list.set(j, false);
				}
		}
		for(int i=2; i<10000; i++) {
			if(list.get(i))
				System.out.print(i+" ");
		}
	}
	나중에...bfs이용
}
