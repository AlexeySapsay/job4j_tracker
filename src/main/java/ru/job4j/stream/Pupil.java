package ru.job4j.stream;

import java.util.List;

/**
 * https://job4j.ru/profile/exercise/36/task-view/267
 * <p>
 * В этом задании необходимо реализовать класс для подсчета
 * статистики по аттестатам учеников
 * Класс Pupil описывает ученика.
 *
 * @author AlexSapsay (sapsayalexey@gmail.com)
 * @version 0.1
 * @since 16.10.2021
 */

public class Pupil {
    private String name;
    private List<Subject> subjects;

    public Pupil(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}
