package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    private AnalyzeByMap() {
    }

    /**
     * Вычисляет общий средний балл в этом методе. Необходимо найти сумму баллов
     * по всем предметам у всех учеников,
     * при этом считая количество суммируемых элементов - после этих подсчетов мы
     * просто делим общий балл на количество суммируемых элементов;
     *
     * @param pupils лист, список учеников
     * @return общее среднее значение
     */
    public static double averageScore(List<Pupil> pupils) {
        var score = 0.D;
        var lines = 0.D;
        for (var pupil : pupils) {
            for (var student : pupil.subjects()) {
                lines += 1;
                score += student.getScore();
            }
        }
        return score / lines;
    }

    /**
     * Вычисляет средний балл по каждому ученику.
     * <p>
     * То есть берем одного ученика и считаем все его баллы за все предметы и
     * делим на количество предметов. Возвращает список из объекта Label
     * (имя ученика и средний балл). Реализация этого метода будет отличаться от
     * предыдущего тем, что мы считаем сумму баллов по
     * всем предметам каждого ученика. Получив сумму баллов, мы создаем объект типа Label с
     * именем ученика, а в качестве второго параметра в конструктор передаем сумму баллов
     * по предметам, разделенную на количество предметов ученика. Полученный объект
     * добавляем в список, который и возвращаем в конце метода;
     *
     * @param pupils лист, список учеников
     * @return список предметов
     */
    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labelList = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double averageTotalScore = 0;
            for (var student : pupil.subjects()) {
                averageTotalScore += student.getScore();
            }
            labelList.add(new Label(pupil.name(), averageTotalScore / pupil.subjects().size()));
        }
        return labelList;
    }

    /**
     * Метод averageScoreBySubject() - вычисляет средний балл по каждому предмету.
     * Например, собираем все баллы учеников по предмету география и делим на количество учеников.
     * Возвращает список из объектов Label (название предмета и средний балл).
     * <p>
     * Метод averageScoreBySubject() - чтобы реализовать данный метод, нам необходимо будет
     * собрать временную Map<String, Integer> (в качестве реализации используем LinkedHashMap)
     * - в качестве ключа используем название предмета, в качестве значения - сумма баллов по этому
     * предмету, которую мы получим у каждого ученика. Далее мы перебираем пары ключ-значение в
     * цикле и на их основе создаем объекты типа Label - в качестве первого параметра
     * передаем ключ карты, в качестве второго - значение карты разделенное на
     * количество учеников. Созданный объект добавляем в результирующий список,
     * его мы и вернем в конце метода.
     *
     * @param pupils лист, список учеников
     * @return список предметов
     */
    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> labelList = new ArrayList<>();
        HashMap<String, Double> subjectScoreAverageTotal = new LinkedHashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (!subjectScoreAverageTotal.containsKey(subject.getName())) {
                    subjectScoreAverageTotal.put(subject.getName(), (double) subject.getScore());
                } else {
                    subjectScoreAverageTotal.put(subject.getName(),  subject.getScore()
                            + subjectScoreAverageTotal.get(subject.getName()));
                }
            }
        }
        for (var entry : subjectScoreAverageTotal.entrySet()) {
            labelList.add(new Label(entry.getKey(), entry.getValue() / pupils.size()));
        }
        return labelList;
    }

    /**
     * Метод bestStudent() - возвращает лучшего ученика. Лучшим считается ученик
     * с наибольшим суммарным баллом по всем предметам. Возвращает объект
     * Label (имя ученика и суммарный балл).
     * <p>
     * Метод bestStudent() - в данном методе, так же как и в методе averageScoreByPupil() ,
     * мы собираем список объектов Label за одним исключением - среднее значение баллов
     * считать не нужно, мы оставляем подсчитанную сумму баллов как есть.
     * Далее мы сортируем список с помощью Comparator.naturalOrder()
     * (именно для этой цели у Label реализован интерфейс Comparable).
     * Поскольку нам нужен в итоге лучший студент - то в качестве результата
     * мы возвращаем последний элемент из списка.
     *
     * @param pupils лист, список учеников
     * @return предмет
     */
    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labelList = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sumScore = 0;
            for (var student : pupil.subjects()) {
                sumScore += student.getScore();
            }
            labelList.add(new Label(pupil.name(), sumScore));
        }
        labelList.sort(Comparator.naturalOrder());

        return labelList.get(labelList.size() - 1);
    }

    /**
     * Метод bestSubject() - возвращает предмет с наибольшим баллом для всех студентов.
     * Возвращает объект Label (имя предмета, сумма баллов каждого ученика по этому предмету).
     * <p>
     * Метод bestSubject() - в этом методе, так же как и в методе averageScoreBySubject() ,
     * нам необходимо собрать временную карту. Далее эту карту перебираем в виде пар ключ-значение
     * и создаем объекты типа Label - в качестве первого параметра используем ключ,
     * для второго - значение карты. После этого мы сортируем список с помощью
     * Comparator.naturalOrder() и в итоге возвращаем последний элемент из полученного списка.
     *
     * @param pupils лист, список учеников
     * @return предмет
     */
    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> labelList = new ArrayList<>();
        HashMap<String, Double> subjectScoreAverageTotal = new LinkedHashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (!subjectScoreAverageTotal.containsKey(subject.getName())) {
                    subjectScoreAverageTotal.put(subject.getName(), (double) subject.getScore());
                } else {
                    subjectScoreAverageTotal.put(subject.getName(), subject.getScore()
                            + subjectScoreAverageTotal.get(subject.getName()));
                }
            }
        }
        for (var entry : subjectScoreAverageTotal.entrySet()) {
            labelList.add(new Label(entry.getKey(), entry.getValue()));
        }
        labelList.sort(Comparator.naturalOrder());
        return labelList.get(labelList.size() - 1);
    }
}