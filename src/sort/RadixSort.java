package sort;

import java.util.Arrays;

//기수정렬
//비교연산 x 안전성이있다
//자연수나 알파벳의 경우엔 매우 빠르다.
//부동소수점 실수같은 비교는 못한다.
//n크기의 메모리 낭비.
public class RadixSort {

	static int getMax(int a[]) { 
		int max = a[0]; 
		for (int i = 1; i < a.length; i++) 
			if (a[i] > max) 
				max = a[i]; 
		return max; 
	} 

	static void countSort(int a[],  int exp) 
	{ 
		int output[] = new int[a.length];  
		int count[] = new int[10]; 

		for (int i = 0; i < a.length; i++) //각 자리수에 맞게 카운팅
			count[ (a[i]/exp)%10 ]++; 

		for (int i = 1; i < 10; i++) //누적합
			count[i] += count[i - 1]; 

		for (int i = a.length - 1; i >= 0; i--) 
			output[--count[(a[i]/exp)%10]] = a[i];  //countingSort처럼 누적합을 기준으로 인덱스를 찾아간다.
			 
		for (int i = 0; i < a.length; i++) //a을 계속 바꿔줌으로써 전배열을 기준으로 한다.
			a[i] = output[i]; 
	} 

	static void radixSort(int a[]) 
	{ 
		int m = getMax(a); 

		for (int exp = 1; m/exp > 0; exp *= 10) 
			countSort(a, exp); 
	} 


	public static void main(String[] args) {
		int [] example = {9, 3, 2, 4, 6, 7, 8, 1, 5};
		radixSort(example);
		System.out.println(Arrays.toString(example));
	}

}
