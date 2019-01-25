package baekjoon;

import java.util.Scanner;

public class Q2751 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];
		for(int i=0; i<n; i++)
			a[i] = scan.nextInt();
		
		mergeSort(a, 0, a.length-1);
		for(int z : a)
			System.out.println(z);
		
	}
	static void mergeSort(int [] a, int start, int end) {
		if(start >= end) return;
		int middle = (start+end)/2;
		mergeSort(a, start, middle);
		mergeSort(a, middle+1, end);
		merge(a, start, middle, end);
	}
	
	static void merge(int [] a, int start, int middle, int end) {
		int [] temp = new int[end-start+1];
		int i=0; int index1 = start; int index2 = middle+1;
		
		while(index1<=middle && index2 <= end) {
			if(a[index1]<a[index2]) 
				temp[i++] = a[index1++];
			else
				temp[i++] = a[index2++];
		}
		
		while(index1 <= middle)
			temp[i++] = a[index1++];
		while(index2 <= end)
			temp[i++] = a[index2++];
		
		for(i=0; i<temp.length; i++)
			a[start+i] = temp[i];
	}
}
