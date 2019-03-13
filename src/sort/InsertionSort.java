package sort;

import java.util.Arrays;
//삽입정렬
//0~i-1사이에서 value보다 큰값들을 뒤로 밀어내고 밀어낸값들 앞에 value를 삽입한다.
//기초적인 정렬중에서 가장 어렵다.
public class InsertionSort {
	
	static void insertionSort(int [] a) {
		for(int i=1; i<a.length; i++) {
			int value = a[i];
			int j;
			for(j=i-1; j>=0; j--) //j--인 점을 잊지말고 value보다 작으면 멈추기에 적절한 위치에 value를 껴 넣을 수 있다.
				if(a[j]>value)
					a[j+1] = a[j];
				else
					break;
			a[j+1] = value; //j값이 --되면서 for문을 빠져나오기 때문에 j+1
		}
	}
	
	public static void main(String[] args) {
		int [] example = {9, 3, 2, 4, 6, 7, 8, 1, 5};
		insertionSort(example);
		System.out.println(Arrays.toString(example));
	}

}
