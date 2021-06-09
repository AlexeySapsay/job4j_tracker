package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentListToMap {
//    public Map<String, Student> collect(List<Student> studentList) {
//        return studentList.stream()
//                .distinct()
//                .collect(Collectors.toMap(
//                        Student::getSurname,
//                        keyValue -> keyValue
//                ));
//    }

    public Map<String, Student> collect(List<Student> studentList) {
        return studentList.stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        keyValue -> keyValue,
                        (keyValue1, keyValue2) -> {
                            //System.out.println("duplicate key found!");
                            return keyValue1;
                        }
                ));
    }
}
