package sort;

import java.util.Arrays;

//선택 정렬
//가장 작은 수 또는 큰수를 찾아서 스왑한다.
public class SelectionSort {

	static void swap(int [] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static int findMin(int [] a, int start) {
		int min = a[start];
		int index = start; //0으로 초기화해서 이 부분에서 틀렸었음. start가 가장 최소값이 였을 경우 0을 리턴해서 0과 스왑했었음.. 

		for(int i=start+1; i<a.length; i++) {
			if(a[i] < min) {
				min = a[i];
				index = i;
			}
		}
		return index;
	}
	
	static void selectionSort(int [] a) {
		for(int i=0; i<a.length-1; i++) {
			int minIndex = findMin(a, i);
			swap(a, i, minIndex);
		}
	}
	
	public static void main(String[] args) {
		int [] example = {9, 3, 2, 4, 6, 7, 8, 1, 5};
		selectionSort(example);
		System.out.println(Arrays.toString(example));
	}

}
