package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 3", 13),
                new Attachment("image 2", 34)
        );

        //anonymize class
        Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getSize() - right.getSize();
            }
        };

        attachments.sort(comparator);
        System.out.println(attachments);

        //anonymize class for compare names of attachments by lexicographically
        Comparator<Attachment> comparator2 = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getName().compareTo(right.getName());
            }
        };

        attachments.sort(comparator2);
        System.out.println(attachments);
    }
}
