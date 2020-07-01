package baekjoon.etc;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

//ȸ���ϴ� ť
//������ �˾Ҵµ� 1�ð�20���� �ɷȴ�.
//����� �Ƿ��� Ű�� �ʿ䰡 �ִ� �� ����.
public class Q1021 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		Deque<Integer> dq = new ArrayDeque<>();
		List<Integer> list = new ArrayList<>(); //���� ���ڸ� ������ �뵵
		int count = 0;
		int index = 0;//list���� �̾ƾ��ϴ� ������ �ε��� 

		for(int i=0; i<n; i++) //���� 1����n�������� �ʱ�ȭ
			dq.add(i+1);

		for(int i=0; i<m; i++) //�̾ƾ��ϴ� �� ��� list�ʱ�ȭ
			list.add(scan.nextInt());


		while(index<m) { //�� ���� �� ����
			int left = 0;
			int right = 0;
			if(dq.peekFirst() == list.get(index)) {//ù ��° ���ڰ� �̾ƾ��ϴ� ������ ��
				index++; //list �ε��� +1
				dq.removeFirst();//������ ����
				continue;
			}
			for(int i=0; i<dq.size(); i++) { //�������� �̵��ϴ� Ƚ�� ����
				if(list.get(index)==dq.peekFirst()) //if���� left=i�� �߸������ؼ� ��� ��̴�.
					left=i; 
				dq.addLast(dq.removeFirst());
			}
			for(int i=0; i<dq.size(); i++) {//���������� �̵��ϴ� Ƚ������
				if(list.get(index)==dq.peekFirst())
					right=i;
				dq.addFirst(dq.removeLast());
			}
			if(left<right) { //�������� �̵��ϴ°� �� ���� ��
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
