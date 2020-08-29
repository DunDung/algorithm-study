package bandi2020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Double> heartBeats = br.lines()
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        double age = heartBeats.get(0);
        double maxHeartBeat = 220.0 - age;
        List<Double> standards = Arrays.asList(90.0, 80.0, 75.0, 68.0, 60.0);
        int size = heartBeats.size();
        StringBuilder builder = new StringBuilder();
        List<Double> a = new ArrayList<>();
        for (int i = 1; i < size; i++) {
            double k = heartBeats.get(i) / maxHeartBeat * 100.0;
            a.add(k);
        }
        int index = 0;
        int z = a.size() - 1;
        for (int i = a.size() - 1; i >= 0; i--) {
            if (index != standards.size() && a.get(i) < standards.get(index)) {
                builder.append(z - i + " ");
                index++;
                z = i;
            }
        }
        builder.append(z - 0);
        System.out.println(builder.toString());
    }
}
