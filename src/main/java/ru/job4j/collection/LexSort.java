package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftSplit = left.split("\\.");
        String[] rightSplit = right.split("\\.");

        //int leftInt = Integer.valueOf(left.split("\\s+"));
        int leftInt = 0;
        String leftStr = "";

        int rightInt = 0;
        String rightStr = "";

//        leftInt = Integer.valueOf(leftSplit[0].charAt(0));
        //leftInt = (Integer.valueOf(leftSplit[0]));
        leftInt = Integer.parseInt(String.valueOf((leftSplit[0])));
        leftStr = leftSplit[1];

        rightInt = Integer.parseInt(String.valueOf(rightSplit[0]));
        rightStr = rightSplit[1];

//        for (int i = 0; i < leftSplit.length; i++) {
//            System.out.println(leftSplit[i]);
//        }

        //System.out.println("lefInt: " + leftInt + " " +
        //        "leftStr: " + leftStr);

//        System.out.println("rightInt: " + rightInt + " " +
//                "rightStr: " + rightStr);


        //return left.compareTo(right);
        return Integer.compare(leftInt, rightInt);
    }
}
