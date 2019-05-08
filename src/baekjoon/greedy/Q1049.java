package baekjoon.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//기타줄
public class Q1049 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		List<Integer> p = new ArrayList<>(); 
		List<Integer> e = new ArrayList<>();

		for(int i=0; i<m; i++) {
			p.add(scan.nextInt()); //패키지 값들 저장받기
			e.add(scan.nextInt()); //낱개 값들 저장받기
		}
		//브랜드 상관이 없으므로 가장 싼 패키지값, 낱개값을 찾기 위해 정렬
		Collections.sort(p);
		Collections.sort(e);

		int each = e.get(0)*n; //낱개 값은 제일 싼 낱개 값 * n개
		int pac = p.get(0);
		//패키지 값은 패키지당 6개 이므로 가장 싼 패키지값* n/6
		if(n/6 >= 1) {
			pac*=n/6;
			if(n%6 >= 1 ) { //n을 6으로 나누고 나머지 필요한 기타줄을 낱개로 구입할건지 패키지를 한개 더살건지 가격비교
				int z = e.get(0)*(n%6)<p.get(0) ? e.get(0)*(n%6) : p.get(0);
				pac += z; //패키지값에 더하기
			}
		}
		int min = (each>pac) ? pac : each; 
		System.out.println(min);
	}

}

