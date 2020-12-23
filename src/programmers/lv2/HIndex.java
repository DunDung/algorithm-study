package programmers.lv2;

import java.util.Arrays;

// 2020.12.01
public class HIndex {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int length = citations.length;
        int answer = 0;
        int count = 0;
        for (int i = 0; i < length; i++) {
            int citation = citations[i];
            count++;
            if ((i <= citation) && ((length - i) >= citation)) {
                answer = count;
            }
        }
        return answer;
    }
}
