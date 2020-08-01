package toss2020.server1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        StringBuilder builder = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < inputs.length; i++) {
            if (list.contains(inputs[i])) {
                list.remove(inputs[i]);
            }
            list.add(inputs[i]);
            int count = 0;
            for (int j = list.size() - 1; j >= 0; j--) {
                if (count > 4) {
                    break;
                }
                count++;
                builder.append(list.get(j));
                builder.append(" ");
            }
            builder.append(System.lineSeparator());
        }
        String[] answers = builder.toString().split(System.lineSeparator());
        for (String answer : answers) {
            System.out.println(answer.trim());
        }
    }
}
