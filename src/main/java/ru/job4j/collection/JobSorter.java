package ru.job4j.collection;
/**
 * https://job4j.ru/edu/task?action=task&taskId=0873958f758d0d5301758d8a572a2e4a&number=402115
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class JobSorter {
    public static void main(String[] args) {
        /* manual test for String.compareTo();*/
        String strLeft = "Ivanov";
        String strRight = "Ivanova";

        System.out.println("result by String.compareTo() : " + strLeft.compareTo(strRight));

        StringCompare compare = new StringCompare();
        int rsl = compare.compare(strLeft, strRight);
        System.out.println("result by compare : " + rsl);

        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1),
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("Fix bug", 3),
                new Job("X task", 0)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob());
        System.out.println(jobs);

        /*sorting by name and priority in reversedOder*/
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));

        /*Создадим комбинированный компаратор:
        сортировка по длине имени, по имени и приоритету.*/
        Comparator<Job> comb = new JobDescByNameLn()
                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByPriority());
        Collections.sort(jobs, comb);
        System.out.println(jobs);

        /* создаем кобинированный компаратор
            name ascending and priority ascending */
        Comparator<Job> comb1 = new SortJobByNameAndAscending()
                .thenComparing(new SortJobByPriorityAndAscending());
        Collections.sort(jobs, comb1);
        System.out.println(jobs);

        /*создаем кобинированный компаратор
             name ascending and priority descending*/
        Comparator<Job> comb2 = new SortJobByNameAndAscending()
                .thenComparing(new SortJobByPriorityAndDescending());
        Collections.sort(jobs, comb2);
        System.out.println(jobs);

        /*создаем кобинированный компаратор
            name descending  and priority ascending*/
        Comparator<Job> comb3 = new SortJobByNameAndDescending()
                .thenComparing(new SortJobByPriorityAndAscending());
        Collections.sort(jobs, comb3);
        System.out.println(jobs);

        /* создаем кобинированный компаратор
         name descending  and priority ascending*/
        Comparator<Job> comb4 = new SortJobByNameAndDescending()
                .thenComparing(new SortJobByPriorityAndDescending());
        Collections.sort(jobs, comb4);
        System.out.println(jobs);
    }
}
