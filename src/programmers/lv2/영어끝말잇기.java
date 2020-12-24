package programmers.lv2;

import java.util.HashSet;
import java.util.Set;

// 2020. 12. 24
public class 영어끝말잇기 {

    public int[] solution(int n, String[] words) {
        String lastWord = "";
        Set<String> duplicateChecker = new HashSet<>();
        int count = 0;
        for (String word : words) {
            count++;
            duplicateChecker.add(word);
            if (!lastWord.isEmpty()) {
                if ((lastWord.charAt(lastWord.length() - 1) != word.charAt(0)) || (duplicateChecker.size() != count)) {
                    break;
                }
            }
            lastWord = word;
        }
        if (count == words.length) {
            return new int[]{0, 0};
        }
        int num = count % n == 0 ? n : count % n;
        int turn = count % n > 0 ? (count / n) + 1 : count / n;
        return new int[]{num, turn};
    }
}
