package baekjoon.exhaustive_search;

import java.util.Scanner;

//외판원 순회2
//X
public class Q10971 {
	static void swap(int [] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static boolean nextPermutation(int [] a) {
		int i = a.length-1;
		while(i > 0 && a[i] <= a[i-1])
			i--;

		if(i<=0)
			return false;

		int j = a.length-1;
		while(a[j] <= a[i-1]) {
			j--;
		}

		swap(a, i-1, j);

		j = a.length-1;
		while(i < j) {
			swap(a, i, j);
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [][] a = new int[n][n];

		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				a[i][j] = scan.nextInt();

		int [] d = new int[n-1];
		//0번으로 이동하는 것을 제외한 이동값 초기화
		for(int i=0; i<n-1; i++) {
			d[i] = i+1;
		}
		int ans = Integer.MAX_VALUE;
        do {
            boolean ok = true;
            int sum = 0;
            //0번으로 이동하는 것을 제외했기 때문에 -1, 더하는 값에 i+1이 있기 때문에 -1 => n-2가 된다.
            for (int i=0; i<n-2; i++) { 
                if (a[d[i]][d[i+1]] == 0) { //못가는 도시일 시 false
                    ok = false;
                } else {
                    sum += a[d[i]][d[i+1]];
                }
            }
			//못가는 도시가 없었고 0번째 도시에서 첫 번째 도시로 갈때 0이 아니고 마지막 도시에서 0번째 도시로 갈때 0이 아니면
            if (ok && a[0][d[0]] != 0 && a[d[n-2]][0] != 0) { 
                sum += a[0][d[0]] + a[d[n-2]][0]; //0째번에서 첫 번째로 가는 비용 + 마지막에서 0번째로 가는 비용
                if (ans > sum) {
                    ans = sum;
                }
            }
        } while(nextPermutation(d));

        System.out.println(ans);
	}

}
