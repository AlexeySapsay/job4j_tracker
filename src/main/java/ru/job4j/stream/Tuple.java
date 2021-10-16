package ru.job4j.stream;

import java.util.Objects;

/**
 * https://job4j.ru/profile/exercise/36/task-view/267
 * <p>
 * В этом задании необходимо реализовать класс для подсчета
 * статистики по аттестатам учеников
 * Класс Tuple содержит результаты: имя и баллы.
 * Этот класс используется как для учеников, так и для предметов.
 *
 * @author AlexSapsay (sapsayalexey@gmail.com)
 * @version 1.0
 * @since 16.10.2021
 */

public class Tuple {
    private String name;
    private double score;

    public Tuple(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tuple tuple = (Tuple) o;
        return Double.compare(tuple.score, score) == 0
                && Objects.equals(name, tuple.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}
