package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    /**
     * looking for account by String account.
     * if account is present- return account
     * if absent - return Optional.empty();
     *
     * @param account - user account
     * @return Optional - return value
     */
    public Optional<Student> findByAccount(String account) {
        Optional<Student> rsl = Optional.empty();
        for (Student s : students.keySet()) {
            if (account.equals(s.getAccount())) {
                return Optional.of(s);
            }
        }
        return rsl;
    }

    /**
     * looking for subject by String account and name of subject.
     * if account is present- return account
     * if absent - return Optional.empty();
     *
     * if subject is present - return Optional Subject
     * if subject is is absent - return Optional Subject empty
     *
     * @param account- user account
     * @param name - name of subject by user
     * @return if subject is present - return Optional Subject
     *         if subject is is absent - return Optional Subject empty
     */
    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Subject> rsl = Optional.empty();
        Optional<Student> student = findByAccount(account);
        if (student.isPresent()) {
            Set<Subject> subjects = students.get(student.get());
            for (Subject subj : subjects) {
                if (name.equals(subj.getName())) {
                    return Optional.of(subj);
                }
            }
        }
        return rsl;
    }
}
