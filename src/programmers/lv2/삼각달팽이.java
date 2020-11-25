package programmers.lv2;

import java.util.ArrayList;
import java.util.List;

// 2020.11.24
public class 삼각달팽이 {
    public int[] solution(int n) {
        List<int[]> list = new ArrayList<>();
        int last = 0;
        for (int i = 1; i <= n; i++) {
            list.add(new int[i]);
            last += i;
        }
        int count = 1;
        int x = -1;
        int y = 0;
        boolean isUp = false;
        int lastX = n - 1;
        while (count <= last) {
            if (isUp) {
                list.get(--x)[--y] = count++;
                if (list.get(x - 1)[y - 1] != 0) {
                    isUp = false;
                    continue;
                }
            }
            if (!isUp) {
                list.get(++x)[y] = count++;
                if (x == lastX) {
                    int lastIndex = 0;
                    for (int i = y; i <= x; i++) {
                        if (list.get(x)[i] == 0) {
                            list.get(x)[i] = count++;
                            lastIndex = i;
                        }
                    }
                    y = lastIndex;
                    lastX--;
                    isUp = true;
                }
            }
        }
        int index = 0;
        int[] answer = new int[last];
        for (int[] nums : list) {
            for (int num : nums) {
                answer[index++] = num;
            }
        }
        return answer;
    }
}