package baekjoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

//AC
//�����˻��� ���� �ݷʿ� ����� ã�� �ذ�
//�� 2�ð� �ɷȴ�..
public class Q5430 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());

		for(int i=0; i<t; i++) {
			String fx = reader.readLine();
			int n = Integer.parseInt(reader.readLine());
			String array = reader.readLine();
			Deque<String> dq = new ArrayDeque<>();
			boolean error = false;
			boolean reverse = false; //�� ������ �ٽ�.. ���ڿ��� ������������ ��Ÿ��

			array = array.substring(1,array.length()-1); //�Է¹��� ���ڿ����� []�� ������ 1,2���·� �ʱ�ȭ
			String [] arrayNum = array.split(",");//split���� ���ںи�

			for(String s : arrayNum) {
				if(s.matches("[0-9]+"))  //[0~9]*�� �߾��� *�� 0��~ +�� 1��~
					dq.addLast(s);//���ڸ� ���� ����
			}

			for(int j=0; j<fx.length(); j++) {
				if(fx.substring(j,j+1).equals("D")) {
					if(dq.isEmpty()) {
						System.out.println("error");
						error = true;
						break; //break�� ��� isEmpty�϶� D�� ������ error�� ��� �μ�ƾ���.
					}else {
						if(!reverse) //�����˻��� ���� ã����� ������ ������ �ʰ� �����ϴ� ���⸸ �ٲ㼭 �ð��ʰ��� �ذ�
							dq.pollFirst();
						else
							dq.pollLast();
					}
				}
				else { //R�ϰ��
					if(!reverse) reverse = true;
					else if(reverse) reverse = false; //�̹� ������ ���¶�� �ٽ� �����·�
				}

			}
			if(!error) {
				if(!reverse)
					System.out.println(dq.toString().replaceAll(" ", ""));
				else {
					System.out.print("[");
					int size = dq.size();
					for(int j=0; j<size; j++) { 
						if(j==size-1)
							System.out.print(dq.poll());
						else
							System.out.print(dq.pollLast()+",");
					}
					System.out.print("]\n");
				}
			}
		}
	}
}
