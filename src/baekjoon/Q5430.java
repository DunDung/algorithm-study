package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

//AC
//질문검색을 통해 반례와 방법을 찾아 해결
//약 2시간 걸렸다..
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
			boolean reverse = false; //이 문제의 핵심.. 문자열이 뒤집혔는지를 나타넴

			array = array.substring(1,array.length()-1); //입력받은 문자열에서 []를 제외한 1,2형태로 초기화
			String [] arrayNum = array.split(",");//split으로 숫자분리

			for(String s : arrayNum) {
				if(s.matches("[0-9]+"))  //[0~9]*로 했었음 *은 0개~ +는 1개~
					dq.addLast(s);//숫자만 덱에 삽입
			}

			for(int j=0; j<fx.length(); j++) {
				if(fx.substring(j,j+1).equals("D")) {
					if(dq.isEmpty()) {
						System.out.println("error");
						error = true;
						break; //break가 없어서 isEmpty일때 D가 많으면 error가 계속 인쇄됐었다.
					}else {
						if(!reverse) //질문검색을 통해 찾은방법 실제로 뒤집지 않고 삭제하는 방향만 바꿔서 시간초과를 해결
							dq.pollFirst();
						else
							dq.pollLast();
					}
				}
				else { //R일경우
					if(!reverse) reverse = true;
					else if(reverse) reverse = false; //이미 뒤집힌 상태라면 다시 원상태로
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
