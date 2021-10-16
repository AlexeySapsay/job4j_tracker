package ru.job4j.stream;

import java.util.List;
import java.util.stream.Stream;

/**
 * https://job4j.ru/profile/exercise/36/task-view/267
 * <p>
 * В этом задании необходимо реализовать класс для подсчета
 * статистики по аттестатам учеников
 * Класс Tuple содержит результаты: имя и баллы.
 * <p>
 * Класс Analyze получает статистику по аттестатам.
 *
 * @author AlexSapsay (sapsayalexey@gmail.com)
 * @version 1.0
 * @since 16.10.2021
 */

public class Analyze {
    /**
     * Метод averageScore вычисляет общий средний балл.
     *
     * @param stream входной стрим
     * @return среднее арифметическое значение оценки
     */
    public static double averageScore(Stream<Pupil> stream) {
        return 0D;
    }

    /**
     * Метод averageScoreBySubject вычисляет средний
     *
     * балл ученика по его предметам.
     * @param stream входной стрим
     * @return Возвращает список из объекта Tuple (имя ученика и средний балл).
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return List.of();
    }

    /**
     * Метод averageScoreByPupil вычисляет
     * средний балл по всем предметам для каждого ученика.
     *
     * @param stream входной стрим
     * @return Возвращает список из объекта Tuple
     * (название предмета и средний балл).
     */
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return List.of();
    }

    /**Метод bestStudent - возвращает лучшего ученика.
     *
     * @param stream входной стрим
     * @return Лучшим считается ученик с наибольшим баллом по всем предметам.
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return null;
    }

    /**
     * Метод bestSubject - возвращает предмет с
     * наибольшим баллом для всех студентов.
     *
     * @param stream входной стрим
     * @return Возвращает объект Tuple
     * (имя предмета, сумма баллов каждого ученика по этому предмету)
     */
    public static Tuple bestSubject(Stream<Pupil> stream) {
        return null;
    }
}
