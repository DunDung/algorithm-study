package baekjoon;

import java.util.Scanner;

//조세퍼스 문제
//단계별에서 큐
//O
public class Q11866 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int index = 1;
		int [] q = new int[n+1];
		StringBuilder builder = new StringBuilder("<");

		for(int i=1; i<=n; i++)
			q[i] = i;

		for(int i=0; i<n; i++) {
			int count = 1;
			while(true) {
				if(index>n) //원형 큐이기 때문에 n보다 크면 %해줌
					index %= n;

				if(count == m) { //m번 째 사람인 경우
					if(q[index]==0) { //m번째 사람이지만 0인경우
						index++; //인덱수 추가
						continue;
					}
					builder.append(q[index]);
					q[index] = 0;
					break;
				}
				else if(q[index]!=0) { //0이 아니면 카운트 및 인덱스 ++
					index++;
					count++;
				}
				else if(q[index]==0) {
					index++;
					continue;
				}
			}
			if(i!=n-1)
				builder.append(", ");
		}
		scan.close();
		builder.append(">");
		System.out.println(builder.toString());
	}
}

