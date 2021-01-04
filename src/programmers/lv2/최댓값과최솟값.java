package programmers.lv2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 2021. 01. 04
public class 최댓값과최솟값 {
    public String solution(String s) {
        List<Integer> sortedNums = Arrays.stream(s.split(" "))
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toList());

        return sortedNums.get(0) + " " + sortedNums.get(sortedNums.size() - 1);
    }
}
