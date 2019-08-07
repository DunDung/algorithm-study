package baekjoon.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11279 {
	public static int [] heap = new int[10001];
	public static int size = 1;
	public static StringBuilder sb = new StringBuilder();

	public static void swap(int x, int y) {
		int temp = heap[x];
		heap[x] = heap[y];
		heap[y] = temp;
	}
	public static void buildHeap(int x) {
		int value = heap[2*x] > heap[(2*x)+1] ? heap[2*x] : heap[(2*x)+1];
		if(heap[x] < value) {
			if(heap[2*x] > heap[(2*x)+1]) {
				swap(x, 2*x);
				buildHeap(2*x);
			} else {
				swap(x, (2*x)+1);
				buildHeap((2*x)+1);
			}
		}
	}
	public static void pop() {
		if(size>1) {
			sb.append(heap[1]+"\n");
			swap(1, size);
			heap[size--] = 0;
			buildHeap(1);
		} else {
			sb.append(0+"\n");
		}
		System.out.println(size);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		for(int i=0; i<n; i++) {
			int k = Integer.parseInt(reader.readLine());
			if(k==0) {
				pop();
			} else {
				heap[size++] = k;
				buildHeap(size/2);
			}
		}
		System.out.println(sb.toString());
	}

}
