package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    //    public Student findByAccount(String account) {
//            Student rsl = null;
//        for (Student s : students.keySet()) {
//            if (s.getAccount().equals(account)) {
//                return s;
//            }
//        }
//        return null;
//    }

//    public Student findByAccount(String account) {
//        Student rsl = null;
//        for (Student s: students.keySet()) {
//            if (account.equals(s.getAccount())) {
//                rsl = s;
//                break;
//            }
//        }
//        return rsl;
//    }

    // refactor that method for Optional
//    public Student findByAccount(String account) {
//        return students.keySet()
//                .stream()
//                .filter(s -> s.getAccount().equals(account))
//                .findFirst()
//                .orElse(null);
//    }

    // refactor that method for Optional
    public Optional<Student> findByAccount(String account) {
        Optional<Student> rsl = Optional.empty();
        for (Student s : students.keySet()) {
            if (account.equals(s.getAccount())) {
                rsl = Optional.of(s);
                break;
            }
        }
        return rsl;
    }

//    public Subject findBySubjectName(String account, String name) {
//        Student a = findByAccount(account);
//        if (a != null) {
//            Set<Subject> subjects = students.get(a);
//            for (Subject s : subjects) {
//                if (s.getName().equals(name)) {
//                    return s;
//                }
//            }
//        }
//        return null;
//    }

//    public Subject findBySubjectName(String account, String name) {
//        Student a = findByAccount(account);
//        if (a != null) {
//            return students.get(a)
//                    .stream()
//                    .filter(s -> s.getName().equals(name))
//                    .findFirst()
//                    .orElse(null);
//        }
//        return null;
//    }

//    public Subject findBySubjectName(String account, String name) {
//        Subject rsl = null;
//        Student s = findByAccount(account);
//        if (s != null) {
//            Set<Subject> subjects = students.get(s);
//            for (Subject subj : subjects) {
//                if (name.equals(subj.getName())) {
//                    rsl = subj;
//                    break;
//                }
//            }
//        }
//        return rsl;
//    }

//    public Optional<Subject> findBySubjectName(String account, String name) {
//        Optional<Subject> rsl = Optional.empty();
//        Optional<Student> student = findByAccount(account);
//        if (student.isPresent()) {
//            //if (student.isEmpty()) {
//            Optional<Set<Subject>> subjects = Optional.ofNullable(students.get(student));
//            //for (Optional<Set<Subject>> subj : subjects) {
//            for (Subject subj : subjects) {
//                if (name.equals(subj.getName())) {
//                    //rsl = subj;
//                    rsl = subj;
//                    break;
//                }
//            }
//        }
//        return rsl;
//    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Subject> rsl = Optional.empty();
        Optional<Student> student = findByAccount(account);
        if (student.isPresent()) {
            Set<Subject> subjects = students.get(student.get());
            for (Subject subj : subjects) {
                if (name.equals(subj.getName())) {
                    rsl = Optional.of(subj);
                    return rsl;
                }
            }
        }
        return rsl;
    }

//    public static void main(String[] args) {
//        Map<Student, Set<Subject>> students = Map.of(new Student("Student",
//                        "000001", "201-18-15"),
//                Set.of(
//                        new Subject("Math", 70),
//                        new Subject("English", 85)
//                )
//        );
//        College college = new College(students);
//        Student student = college.findByAccount("000001");
//        System.out.println("Найденный студент: " + student);
//        Subject english = college.findBySubjectName("000001", "English");
//        System.out.println("Оценка по найденному предмету: " + english.getScore());
//    }
}
