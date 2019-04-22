package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//K번째 수
//입출력이 큰 문제에서는 Scanner로 절대 못맞힌다.
//StringTokenizer를 기억하자. 한줄마다 new 해줘야 한다.
//X
public class Q11004 {
	static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(int[] a, int start, int end, int pivotIndex) {
        swap(a, end, pivotIndex);
        int value = a[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; ++j)
            if (a[j] < value) {
                ++i;
                if (i != j) swap(a, i, j); // 불필요한 swap 하지 않기
            }
        swap(a, i + 1, end);
        return i + 1;
    }

    static void quickSort(int[] a, int start, int end) {
        if (start >= end) return;
        int middle = partition(a, start, end, (start+end)/2);
        quickSort(a, start, middle-1);
        quickSort(a, middle+1, end);
    }



    static int findIndex(int[] a, int start, int end, int value) {
        for (int i = start; i <= end; ++i)
            if (a[i] == value) return i;
        return -1;
    }

    static int linearSelect(int[] a, int start, int end, int nth) {
        int size = end - start + 1;
        if (size <= 5) {                   // (1)
            quickSort(a, start, end);      // (1)
            return a[start + nth - 1];     // (1)
        }
        int[] a1 = new int[(size + 4)/5];         // (2)  size/5 의 소수점 올림값 계산식 => (size + 4)/5
        for (int i = 0; i < a1.length; ++i) {     // (3)
            int start1 = start + i * 5;           // (3)
            int end1 = Math.min(start1 + 4, end); // (3)
            quickSort(a, start1, end1);           // (3)
            a1[i] = a[(start1 + end1) / 2];       // (3)
        }
        int M = linearSelect(a1, 0, a1.length-1, a1.length/2);  // (4)
        int Mindex = findIndex(a, start, end, M);               // (5)

        int middle = partition(a, start, end, Mindex);          // (5)
        int middle_nth = middle - start+1;                      // (6)
        if (nth == middle_nth) return a[middle];                // (6)
        if (nth < middle_nth)
            return linearSelect(a, start, middle-1, nth);
        else
            return linearSelect(a, middle + 1, end, nth - middle_nth);
    }

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken()); 
		int k = Integer.parseInt(st.nextToken()); 
		int [] array = new int[n];
		
		st = new StringTokenizer(reader.readLine());
		for(int i=0; i<n; i++)
			array[i] = Integer.parseInt(st.nextToken());
		
		System.out.println(linearSelect(array, 0, n-1, k));;
		
	}
}
