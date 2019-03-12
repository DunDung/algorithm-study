package algorithm;

import java.util.Arrays;

//버블정렬
//옆의 원소를 하나씩 비교해 가장 큰 원소를 끝으로 밀어내는 방식
public class BubbleSort {
	static void swap(int [] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	static void bubbleSort(int [] a) {
		for(int i=a.length-1; i>=1; i--) {
			boolean finish = true;
			for(int j=0; j<i; j++) { //j<i기 때문에 j+1 가능
				if(a[j]>a[j+1]) {
					swap(a, j, j+1);
					finish = false;
				}
			}
			if(finish)
				break;
		}
	}
	/**
	 static void bubbleSort(int [] a){
	 	for(int i=a.length-1; i>=1; i--){
	 		boolean finish = true;
	 		for(int j=0; j<i; j++){
	 			if(a[j]>a[j+1]){
	 				swap(a, j, j+1);
	 				finish = false;
	 			}
	 		}
	 	}
	 }
	 **/
	public static void main(String[] args) {
		int [] example = {9, 3, 2, 4, 6, 7, 8, 1, 5};
		bubbleSort(example);
		System.out.println(Arrays.toString(example));
	}
	
}
