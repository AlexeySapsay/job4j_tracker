package ru.job4j.list;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int sum = 0;

        for (int index = 1; index < data.size() - 1; index++) {
            if ((data.get(index - 1) + data.get(index + 1)) / 2 == data.get(index)) {
                sum += data.get(index);
                if (index + 2 == data.size()) {
                    sum += data.get(index + 1);
                    sum += 1;
                    return sum;
                }
            } else {
                return 0;
            }
        }
        return sum;
    }
}
