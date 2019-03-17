package sort;

import java.util.Arrays;

//퀵정렬
//partition을 통해 기준값보다 작은값들을 앞으로 큰값들을 뒤로 보내고 기준값의 위치를 리턴시킨다.
public class QuickSort {
	static void swap(int [] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static int partition(int [] a, int start, int end) {
		int value = a[end];
		int i = start -1;
		for(int j = start; j<=end-1; ++j)
			if(a[j]<value)
				swap(a, ++i, j);
		swap(a, i+1, end);
		return i+1;
	}
/*	
	static int partition2(int[]a, int start, int end) {
		int value = a[end];
		int i = start -1;
		
		for(int j = start; j<=end-1; j++)
			if(a[j] < value)
				swap(a, ++i, j);
		swap(a, i+1, end);
		return i+1;
	}
*/	
	static void quickSort(int [] a , int start, int end) {
		if(start>=end) return;
		int middle = partition(a, start, end);
		quickSort(a, start, middle-1);
		quickSort(a, middle+1, end);
	}
	public static void main(String[] args) {
		int [] example = {9, 3, 2, 4, 6, 7, 8, 1, 5};
		quickSort(example, 0, example.length-1);
		System.out.println(Arrays.toString(example));
	}
	
}
