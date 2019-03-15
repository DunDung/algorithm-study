package sort;

import java.util.Arrays;

//계수정렬
//선형시간정렬 알고리즘
//안정적인 정렬
//값이 크면클수록 메모리를 낭비한다.

public class CountingSort {

	static void countingSort(int [] a) {
		int [] countArray = new int[a.length+1];
		int [] result = new int[a.length];
		
		for(int i=0; i<a.length; i++) //카운트배열에 배열 a의 값의 인덱스를 1씩 증가한다.
			countArray[a[i]]++;
		
		for(int i=1; i<countArray.length; i++) //인덱스가 뒤로갈수록 값을 누적 시킨다.
			countArray[i]+=countArray[i-1];
		
		for(int i = result.length-1; i>=0; i--) //a배열의 마지막 인덱스부터 값을 따라 countArray 인덱스에 가서 값을-1하면 
			result[--countArray[a[i]]] = a[i]; //정렬된 a[i]가 가야할 인덱스가 나온다. --해줌으로써 countArray값도 하나 빼고 -1도하고
		
		System.out.println(Arrays.toString(result));
	}
	public static void main(String[] args) {
		int [] example = {9, 3, 2, 4, 6, 7, 8, 1, 5};
		countingSort(example);
	}

}
