package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 모의고사
// 2020. 07. 02
public class 모의고사 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,3,2,4,2})));
    }

    public static int[] solution(int[] answers) {
        int[] counts = new int[3];
        int[] ones = {1, 2, 3, 4, 5};
        int[] twos = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] threes = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int max = 0;
        for (int i = 0; i < answers.length; i++) {
            if (ones[i % ones.length] == answers[i]) {
                counts[0]++;
            }
            if (twos[i % twos.length] == answers[i]) {
                counts[1]++;
            }
            if (threes[i % threes.length] == answers[i]) {
                counts[2]++;
            }
            max = Math.max(max, counts[0]);
            max = Math.max(max, counts[1]);
            max = Math.max(max, counts[2]);
        }

        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (counts[i] == max) {
                temp.add(i + 1);
            }
        }

        int[] ans = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            ans[i] = temp.get(i);
        }
        return ans;
    }
}
