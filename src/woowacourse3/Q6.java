package woowacourse3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Q6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"1901 1 100", "1901 2 100", "1901 4 100", "1901 7 100", "1901 8 100", "1902 2 100", "1902 1 100", "1902 7 100", "1902 4 100", "1902 8 100", "1903 8 100", "1903 7 100", "1903 4 100", "1903 2 100", "1903 1 100", "2001 1 100", "2001 2 100", "2001 4 100", "2001 7 95", "2001 9 100", "2002 1 95", "2002 2 100", "2002 4 100", "2002 7 100", "2002 9 100"})));
    }

    public static String[] solution(String[] logs) {
        Map<String, Map<String, String>> result = new HashMap<>();
        for (String log : logs) {
            String[] tokens = log.split(" ");
            String 수험번호 = tokens[0];
            String 문제번호 = tokens[1];
            String 점수 = tokens[2];
            if (!result.containsKey(수험번호)) {
                result.put(수험번호, new HashMap<>());
            }
            result.get(수험번호).put(문제번호, 점수);
        }
        Set<String> 중복수험자들 = new LinkedHashSet<>();
        for (String 수험자 : result.keySet()) {
            for (String 다른수험자 : result.keySet()) {
                if (수험자.equals(다른수험자)) {
                    continue;
                }
                Map<String, String> 수험자시험결과 = result.get(수험자);
                Map<String, String> 다른수험자시험결과 = result.get(다른수험자);
                if (수험자시험결과.size() < 5 || 다른수험자시험결과.size() < 5) {
                    continue;
                }
                if (result.get(수험자).equals(result.get(다른수험자))) {
                    중복수험자들.add(수험자);
                    중복수험자들.add(다른수험자);
                }
            }
        }
        if (중복수험자들.isEmpty()) {
            return new String[]{"None"};
        }
        String[] answer = 중복수험자들.toArray(new String[중복수험자들.size()]);
        Arrays.sort(answer);
        return answer;
    }
}


