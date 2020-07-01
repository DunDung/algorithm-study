package programmers;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

// 체육복
// 2020. 07. 01
public class 체육복 {

    public static void main(String[] args) {
        System.out.println(solution(5, new int[] {1, 2}, new int[] {3, 4}));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int count = n - lost.length;
        Set<Integer> reserves = Arrays.stream(reserve)
            .boxed()
            .collect(Collectors.toSet());

        for (int i = 0; i < lost.length; i++) {
            if (reserves.contains(lost[i])) {
                reserves.remove(lost[i]);
                lost[i] = -999;
                count++;
            }
        }

        for (int k : lost) {
            if (reserves.contains(k - 1)) {
                reserves.remove(k - 1);
                count++;
            } else if (reserves.contains(k + 1)) {
                reserves.remove(k + 1);
                count++;
            }
        }

        return count;
    }
}
