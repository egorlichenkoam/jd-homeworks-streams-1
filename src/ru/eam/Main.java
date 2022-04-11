package ru.eam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveEvenList = new ArrayList<>();
        for (Integer x : integerList) {
            if ((x > 0)
                    && (x % 2 == 0)) {
                positiveEvenList.add(x);
            }
        }
        for (int i = 0; i < positiveEvenList.size(); i++) {
            for (int j = positiveEvenList.size() - 1; j > i; j--) {
                if (positiveEvenList.get(i) > positiveEvenList.get(j)) {
                    int tmp = positiveEvenList.get(i);
                    positiveEvenList.set(i,positiveEvenList.get(j));
                    positiveEvenList.set(j,tmp);
                }
            }
        }
        for (Integer x : positiveEvenList) {
            System.out.println(x);
        }
    }
}
