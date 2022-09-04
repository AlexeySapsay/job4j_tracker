package ru.job4j.stream;

/**
 * https:\\job4j.ru/profile/exercise/36/task-view/267
 * <p>
 * В этом задании необходимо реализовать класс для подсчета
 * статистики по аттестатам учеников
 * Класс Subject описывает школьный предмет и аттестационный балл ученика.
 *
 * @author AlexSapsay (sapsayalexey@gmail.com)
 * @version 0.1
 * @since 16.10.2021
 */

public class Subject {
    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
