package ru.job4j.stream.exercise;

import static ru.job4j.stream.exercise.AveragingMethod.*;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AveragingMethodMain {
    public static void main(String[] args) {
        Company c1 = new Company("Apple");
        Company c2 = new Company("Amazon");
        Company c3 = new Company("Microsoft");

        Worker w1 = new Worker(20, c1);
        Worker w2 = new Worker(25, c2);
        Worker w3 = new Worker(30, c2);
        Worker w4 = new Worker(35, c3);
        Worker w5 = new Worker(40, c3);
        Worker w6 = new Worker(45, c3);

        Map<String, Double> expect = Map.of(
                "Apple", 20D,
                "Amazon", 27.5D,
                "Microsoft", 40D
        );
        //System.out.println(expect);

        List<Worker> workers = List.of(w1, w2, w3, w4, w5, w6);
        //System.out.println(workers);
//        for (int i = 0; i < workers.size(); i++) {
//            System.out.println(workers.get(i));
//        }

        //workers ages
        List<Integer> ages = workers.stream()
                .map(Worker::getAge).collect(Collectors.toList());
        //System.out.println("Workers ages is: " + ages);

        //workers company
//        List<String> companies = workers.stream()
//                .map(Worker::getCompany)
//                .map(Company::getName)
//                .collect(Collectors.toList());
//        System.out.println(companies);

        // counting workers in particular company
//        Map<String, Long> groupAndCount = workers.stream()
//                .map(Worker::getCompany)
//                .map(Company::getName)
//                .collect(Collectors.groupingBy(
//                        Function.identity(),
//                        Collectors.counting()
//                ));
//        System.out.println(groupAndCount);

        //calculate average age of workers
        Map<String, Double> averageAge = workers.stream()
                .collect(Collectors.groupingBy(
                        worker -> worker.getCompany().getName(),
                        Collectors.averagingDouble(Worker::getAge)
                ));
        System.out.println(averageAge);
    }
}
