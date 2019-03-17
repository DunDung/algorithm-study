package select;

import java.util.Arrays;

//정렬 후 찾기
//quickSort는 O(nlongn)
//O(nlogn)
public class SortAndSelect {
	static void swap(int [] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static int partition(int [] a, int start, int end) {
		int value = a[end];
		int i = start - 1;
		
		for(int j=start; j<end; j++)
			if(a[j]<value)
				swap(a, ++i, j);
		swap(a, ++i, end);
		return i;
	}
	
	static void quickSort(int [] a, int start, int end) {
		if(start>=end)
			return;
		int middle = partition(a, start, end);
		quickSort(a, start, middle-1);
		quickSort(a, middle+1, end);
	}

	static int select(int [] a, int nth) { //배열중 nth번째로 작은 수를 리턴.
		quickSort(a, 0, a.length-1);
		return a[nth-1];
	}
	public static void main(String[] args) {
		int [] example = {9, 3, 2, 4, 6, 7, 8, 1, 5};
		quickSort(example, 0, example.length-1);
		System.out.println(select(example, 5));
	}

}
