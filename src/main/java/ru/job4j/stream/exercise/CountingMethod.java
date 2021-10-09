package ru.job4j.stream.exercise;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*https://job4j.ru/profile/topics/3/task_code/191/solution/new_task*/

public class CountingMethod {
    public static class Company {
        private String name;

        public Company(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Worker {
        private int age;
        private Company company;

        public Worker(int age, Company company) {
            this.age = age;
            this.company = company;
        }

        public int getAge() {
            return age;
        }

        public Company getCompany() {
            return company;
        }
    }

    /**
     * method for counting worker and company with this worker
     *
     * @param workers contains Worker
     * @return Map String Long with worker and counting or company
     */
    public static Map<String, Long> groupAndCount(List<Worker> workers) {
        return workers.stream()
                .map(Worker::getCompany)
                .map(Company::getName)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
    }
}
