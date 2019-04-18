package baekjoon.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//수 정렬하기3
public class Q10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wt= new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(scan.readLine());
		int [] a = new int [n];
		for(int i =0; i<a.length; i++)
			a[i] = Integer.parseInt(scan.readLine());
	
		//카운팅정렬
		int [] countArray = new int[10001]; //가장 큰 값의 크기로 임시 배열을 만든다.
		for(int i=0; i<a.length; i++) 
			countArray[a[i]]++; //임시 배열의 a[i]번째 인덱스 값을 1씩 증가시킴.
		
		for(int i=1; i<countArray.length; i++)  //등장 횟수를 누적합으로 바꿔준다.
			countArray[i] = countArray[i-1]+countArray[i];
		
		int [] sortedArray = new int[a.length];
		for(int i=a.length-1; i>=0; i--) {
			sortedArray[countArray[a[i]]-1] = a[i];
			countArray[a[i]]--;
		}
		for(int z : sortedArray)
			wt.write(Integer.toString(z)+"\n");
		wt.flush();
	}

}
