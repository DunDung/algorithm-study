package programmers.lv2;

import java.util.Arrays;

// 2020. 07. 03
public class 스킬트리 {

    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        boolean[] check = new boolean[skill.length()];
        for (String nowSkill : skill_trees) {
            Arrays.fill(check, false);
            for (int i = 0; i < nowSkill.length(); i++) {
                int index = skill.indexOf(nowSkill.charAt(i));
                if (index < 0) {
                    continue;
                }
                if (index != 0 && !check[index - 1]) {
                    answer--;
                    break;
                }
                check[index] = true;
            }
        }
        return answer;
    }
}
