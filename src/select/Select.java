package select;

import java.util.Arrays;
//partition을 통한 select
//partition은 O(n)
//select에서는 한쪽배열은 다시 재귀해도 한쪽배열은 무조건 무시하기 때문에 등비수열로 줄어든다.
//배열의 크기가 1로 줄어들 때 까지 모든 작업의 크기를 더해도 10n 이하이다
//평균 O(n)
//최악의 경우엔 O(n2)이다. 계속  크기가 n-1로 줄어들 경우엔 등차수열로 줄어든다. 공차=1
public class Select {
	static void swap(int [] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static int partition(int [] a, int start, int end) {
		int value = a[end];
		int i = start -1;
		for(int j=start; j<end; j++)
			if(a[j] < value)
				swap(a, ++i, j);
		swap(a, ++i, end);
		return i;
	}
	static int select(int [] a, int start, int end, int nth) {
		if(start>=end) return a[start];
		int middle = partition(a, start, end);
		int middle_nth = middle-start+1;
		if(middle_nth == nth)
			return a[middle];
		if(middle_nth > nth)
			return select(a, start, middle-1, nth);
		else
			return select(a, middle+1, end, nth-middle_nth);
	}
	public static void main(String[] args) {
		int [] example = {9, 3, 2, 4, 6, 7, 8, 1, 5, 20, 11, 13, 14, 12, 13, 28};
		System.out.println(select(example, 0, example.length-1, 11));
	}

}
