package baekjoon;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//회전하는 큐
//쉬울줄 알았는데 1시간20분이 걸렸다.
//디버깅 실력을 키울 필요가 있는 것 같다.
public class Q1021 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		Deque<Integer> dq = new ArrayDeque<>();
		List<Integer> list = new ArrayList<>(); //뽑을 숫자를 저장할 용도
		int count = 0;
		int index = 0;//list에서 뽑아야하는 숫자의 인덱스 

		for(int i=0; i<n; i++) //덱에 1부터n까지수로 초기화
			dq.add(i+1);

		for(int i=0; i<m; i++) //뽑아야하는 수 들로 list초기화
			list.add(scan.nextInt());


		while(index<m) { //다 뽑을 때 까지
			int left = 0;
			int right = 0;
			if(dq.peekFirst() == list.get(index)) {//첫 번째 숫자가 뽑아야하는 숫자일 때
				index++; //list 인덱스 +1
				dq.removeFirst();//덱에서 삭제
				continue;
			}
			for(int i=0; i<dq.size(); i++) { //왼쪽으로 이동하는 횟수 세기
				if(list.get(index)==dq.peekFirst()) //if문과 left=i를 잘못설정해서 계속 헤맸다.
					left=i; 
				dq.addLast(dq.removeFirst());
			}
			for(int i=0; i<dq.size(); i++) {//오른쪽으로 이동하는 횟수세기
				if(list.get(index)==dq.peekFirst())
					right=i;
				dq.addFirst(dq.removeLast());
			}
			if(left<right) { //왼쪽으로 이동하는게 더 빠를 때
				count+= left;
				for(int i=0; i<left; i++)
					dq.addLast(dq.removeFirst());

			}else {
				count+= right;
				for(int i=0; i<right; i++)
					dq.addFirst(dq.removeLast());
			}
		}
		System.out.println(count);
		scan.close();
	}
}
