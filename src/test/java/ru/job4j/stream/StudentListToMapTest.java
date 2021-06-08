package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class StudentListToMapTest {
    @Test
    public void whenCollectClassA() {
        List<Student> students = List.of(
                new Student(10, "Surname1"),
                new Student(10, "Surname1"),
                new Student(40, "Surname4"),
                new Student(40, "Surname4"),
                new Student(50, "Surname5"),
                new Student(70, "Surname7"),
                new Student(90, "Surname9"),
                new Student(70, "Surname7"),
                new Student(70, "Surname7")
        );

        Map<String, Student> expected = Map.of(
                ("Surname1"), new Student(10, "Surname1"),
                ("Surname4"), new Student(40, "Surname4"),
                ("Surname5"), new Student(50, "Surname5"),
                ("Surname7"), new Student(70, "Surname7"),
                ("Surname9"), new Student(90, "Surname9")
        );

        StudentListToMap studentListToMap = new StudentListToMap();
        Map<String, Student> rsl = studentListToMap.collect(students);
        assertEquals(expected, rsl);
    }
}