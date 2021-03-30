package ru.job4j.collection;
//https://job4j.ru/edu/task?action=task&taskId=0873958f758d0d5301758d8a573e2e4b&number=402116


public class Job implements Comparable<Job> {
    private String name;

    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" + "name='" + name + '\'' + " priority=" + priority + '}';
    }

    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }
}
