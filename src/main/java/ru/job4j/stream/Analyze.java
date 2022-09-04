package ru.job4j.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https:\\job4j.ru/profile/exercise/36/task-view/267
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
     * Это сумма баллов всех учеников по всем предметам/ количество учеников?
     *
     * @param stream входной стрим
     * @return среднее арифметическое значение оценки
     */
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(pupil -> pupil.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average().orElse(-1D);
    }

    /**
     * Метод averageScoreBySubject вычисляет средний
     * балл ученика по его предметам.
     *
     * @param stream входной стрим
     * @return Возвращает список из объекта Tuple (имя ученика и средний балл).
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.
                map(pupil -> new Tuple(pupil.getName(),
                        pupil.getSubjects().stream()
                                .mapToInt(Subject::getScore)
                                .average().orElse(-1D)))
                .collect(Collectors.toList());
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
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::getName,
                        LinkedHashMap::new,
                        Collectors.averagingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(stringDoubleEntry -> new Tuple(
                        stringDoubleEntry.getKey(),
                        stringDoubleEntry.getValue()))
                .collect(Collectors.toList());
    }

    /**
     * Метод bestStudent - возвращает лучшего ученика.
     *
     * @param stream входной стрим
     * @return Лучшим считается ученик с наибольшим баллом по всем предметам.
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .collect(Collectors.groupingBy(
                        Pupil::getName,
                        Collectors.summingDouble(
                                pupil -> pupil.getSubjects().stream()
                                        .mapToDouble(Subject::getScore)
                                        .sum())))
                .entrySet().stream()
                .map(strDoubleEntry -> new Tuple(
                        strDoubleEntry.getKey(),
                        strDoubleEntry.getValue()))
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(new Tuple("empty", -1));
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
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::getName,
                        Collectors.summingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(stringDoubleEntry -> new Tuple(
                        stringDoubleEntry.getKey(), stringDoubleEntry.getValue()))
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(new Tuple("empty", -1));
    }
}
